package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class Animal {
	public Animal() {
		System.out.println("������ ��1");
	}
	void m1() {
		System.out.println("��1");
	}
}

class Tiger extends Animal{
	public Tiger() {
		System.out.println("������ ��2");
	}
	void m1() {
		System.out.println("��2");
	}
	
//	void m1() {
//		System.out.println("��22");
//	}
}

class Apple{
	public Apple() {
		System.out.println("Apple ������");
	}
	void f1() {
		System.out.println("Apple �޼ҵ�");
	}
}

// ������ ȯ�� ���� Ŭ���� �Դϴٸ� �˸��� ���̴�. ��ü ���� �뵵��� ���ٴ� ���������� �˸��� ���̴�. ���������� �����ϴ� �ڵ��� �˾Ƶ���!!!!
@Configuration
class AppConfig{ // �̰͵� ������ ���� �����̶�� ���ø� �˴ϴ�.
	@Bean
	public Apple apple() {
		return new Apple(); 
	}
}
public class Hello {

	public static void main(String[] args) {
		//1. �ܺ����Ͽ��� ��ü ���� ���
		//Animal t = new Animal();
		//t.m1();
		
		//���� ���Ͽ��� ������� ��ü�� ���⼭ ����� ���̴�.
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext(
					"classpath:Context.xml"
				); //
		
		System.out.println("ctx ����");
		Animal t1 = ctx.getBean("tiger", Animal.class); // ��ĳ����
		//Animal t1 = new Tiger();
		t1.m1(); // ȣ��� ����� ������, �ȴ�.
		
		Tiger t2 = ctx.getBean("tiger", Tiger.class); // �׳� �ڱ� �ڽ�
		//Tiger t2 = new Tiger();
		t2.m1(); // ȣ��� ����� ������, �ȴ�.
		
		Animal t3 = ctx.getBean("tiger", Tiger.class); // �׳� �ڱ� �ڽ�
		t3.m1(); // ȣ��� ����� ������, �ȴ�. 
		
//		Tiger t4 = ctx.getBean("tiger", Animal.class); // �׳� �ڱ� �ڽ�
//		t4.m1(); // ȣ��� ����� ������, �ȴ�. 
		
		ctx.close(); // ctx�� �� ����, close�� ���־���Ѵ�.
		
		
//		AnnotationConfigApplicationContext ctx2= new AnnotationConfigApplicationContext(AppConfig.class);
//		Apple a2 = ctx2.getBean("apple", Apple.class); // Apple Ŭ������ ��ü�� �ּ���
//		a2.f1();
//		
////		insert into table values(name, age);
//		
//		ctx2.close();
	}

}
