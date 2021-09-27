package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class Animal {
	public Animal() {
		System.out.println("생성자 콜1");
	}
	void m1() {
		System.out.println("콜1");
	}
}

class Tiger extends Animal{
	public Tiger() {
		System.out.println("생성자 콜2");
	}
	void m1() {
		System.out.println("콜2");
	}
	
//	void m1() {
//		System.out.println("콜22");
//	}
}

class Apple{
	public Apple() {
		System.out.println("Apple 생성자");
	}
	void f1() {
		System.out.println("Apple 메소드");
	}
}

// 스프링 환경 설정 클래스 입니다를 알리는 것이다. 객체 생성 용도라기 보다는 스프링에게 알리는 것이다. 스프링에서 번역하는 코드라고 알아들음!!!!
@Configuration
class AppConfig{ // 이것도 일종의 설정 파일이라고 보시면 됩니다.
	@Bean
	public Apple apple() {
		return new Apple(); 
	}
}
public class Hello {

	public static void main(String[] args) {
		//1. 외부파일에서 객체 생성 방법
		//Animal t = new Animal();
		//t.m1();
		
		//설정 파일에서 만들어진 객체를 여기서 사용할 것이다.
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext(
					"classpath:Context.xml"
				); //
		
		System.out.println("ctx 얻음");
		Animal t1 = ctx.getBean("tiger", Animal.class); // 업캐스팅
		//Animal t1 = new Tiger();
		t1.m1(); // 호출된 결과가 나오면, 된다.
		
		Tiger t2 = ctx.getBean("tiger", Tiger.class); // 그냥 자기 자신
		//Tiger t2 = new Tiger();
		t2.m1(); // 호출된 결과가 나오면, 된다.
		
		Animal t3 = ctx.getBean("tiger", Tiger.class); // 그냥 자기 자신
		t3.m1(); // 호출된 결과가 나오면, 된다. 
		
//		Tiger t4 = ctx.getBean("tiger", Animal.class); // 그냥 자기 자신
//		t4.m1(); // 호출된 결과가 나오면, 된다. 
		
		ctx.close(); // ctx는 다 쓰면, close를 해주어야한다.
		
		
//		AnnotationConfigApplicationContext ctx2= new AnnotationConfigApplicationContext(AppConfig.class);
//		Apple a2 = ctx2.getBean("apple", Apple.class); // Apple 클래스의 객체를 주세요
//		a2.f1();
//		
////		insert into table values(name, age);
//		
//		ctx2.close();
	}

}
