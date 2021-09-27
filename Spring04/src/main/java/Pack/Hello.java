package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class A{
	void f1() {}
}

class B extends A{
	void f2() {}
}

class C{
	// �Ͼ �� �ִ� ����� ��(4����)
	A m1() { return new A(); }
	A m2() { return new B(); } // �� = �� (up casting)
//	B m3() { return new A(); } // �� = �� (down casting)
	B m4() { return new B(); } 
}

public class Hello{
	public static void main(String[] args) {
		C c = new C();
		
		// (����) ���� = (������) �޸� Ȯ��
		A a0 = c.m2();
		A a1 = (A)c.m2();
		A a2 = (B)c.m2();
		// a1�� a2�� ����.
		
		// a1�� a2 �Ѵ� f1�ۿ� ������.
		a1.f1();
		a2.f1();
		
		((A)c.m2()).f1();
//		((A)c.m2()).f2();
		((B)c.m2()).f1();
		((B)c.m2()).f2();
	}
}

/*
// step 6
interface Fuel{
	String getFuel();
}

class Water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Gas implements Fuel{
	public String getFuel() {
		return "����";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}

class Ship{
	Fuel fuel;
	public Ship(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ���ġ��.");
	}
}

class Car{
	Fuel fuel;
	public Car(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� �޸���.");
	}
}

public class Hello {

	public static void main(String[] args) {
		// �ܺ� XML ������ �ε����־�� �Ѵ�.
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("Context.xml"); // ���� ������ ���´�.
//		Fuel fuel = ctx.getBean("makeFuel", Water.class);
//		System.out.println(fuel.getFuel());
		
		Airplane airplane = ctx.getBean("airplane", Airplane.class);
		airplane.fly();

		Ship ship = ctx.getBean("ship", Ship.class);
		ship.fly();
		
		Car car = ctx.getBean("car", Car.class);
		car.fly();
	}
}
*/

/*
// step 5
interface Fuel{
	String getFuel(); // ���Ḧ ��û�ϴ� �Լ�
}

class Water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}

class Ship{
	Fuel fuel;
	public Ship(Fuel fuel) { this.fuel=fuel; }
}

class Car{
	Fuel fuel;
	public Car(Fuel fuel) { this.fuel=fuel; }
}

@Configuration
class Factory{
	// ��ü�� ������ּ���~ @Bean
	@Bean
	Fuel makeFuel() {
		return new Water();
	}
	
	@Bean
	Airplane Airplane() {
		return new Airplane(makeFuel());
	}
	
	Ship Ship() {
		return new Ship(makeFuel());
	}
	
	Car Car() {
		return new Car(makeFuel()); 
	}
}

public class Hello {

	public static void main(String[] args) {
//		Airplane airplane = new Factory().Airplane(); // Airplane ��ü�� ������ִ°�
//		airplane.fly();
//		
//		Ship ship = new Factory().Ship();
//		Car car = new Factory().Car();
		
		// Airplane airplane = new Factory().airplane(); // �� ����� �����ϴ�.
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Factory.class);
//		Fuel fuel = ctx.getBean("makeFuel", Fuel.class); 
//		//Fuel fuel = (Fuel)ctx.getBean("makeFuel"); // ���� �ڵ�� ���� �����̴�.
//		System.out.println(fuel.getFuel());
		
		Airplane airplane = ctx.getBean("airplane", Airplane.class); 
		airplane.fly();
		
		ctx.close(); // ���ҽ� ���� ���� ���� close�� ���ش�.
	}
}
*/

/*
// step 4
interface Fuel{
	String getFuel(); // ���Ḧ ��û�ϴ� �Լ�
}

class Water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}

class Ship{
	Fuel fuel;
	public Ship(Fuel fuel) { this.fuel=fuel; }
}

class Car{
	Fuel fuel;
	public Car(Fuel fuel) { this.fuel=fuel; }
}

class Factory{
	Fuel makeFuel() {
		return new Water();
	}
	
	Airplane Airplane() {
		return new Airplane(makeFuel());
	}
	
	Ship Ship() {
		return new Ship(makeFuel());
	}
	
	Car Car() {
		return new Car(makeFuel()); 
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Factory().Airplane(); // Airplane ��ü�� ������ִ°�
		airplane.fly();
		
		Ship ship = new Factory().Ship();
		Car car = new Factory().Car();
	}
}
*/

/*
// step 3
interface Fuel{
	String getFuel(); // ���Ḧ ��û�ϴ� �Լ�
}

class Water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}

class Ship{
	Fuel fuel;
	public Ship(Fuel fuel) { this.fuel=fuel; }
}

class Car{
	Fuel fuel;
	public Car(Fuel fuel) { this.fuel=fuel; }
}

class Factory{
	// ����� ��� 2
	Airplane Airplan() { // ����� ��ü�� ������ִ� ���l�� �Ѵ�.
		// ���̶�� ���Ḧ ����ϵ��� �Ѵ�.
		Airplane airplane = new Airplane(makeFuel()); // ����� ���� ���� �ȿ��� ����ڴ�.
		return airplane;
	}
	Ship Ship() {
		Ship ship = new Ship(makeFuel());
		return ship;
	}
	Car Car() {
		Car car = new Car(makeFuel()); 
		return car;
	}
	Fuel makeFuel() {
		return new Water();
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Factory().Airplan();
		airplane.fly();
		
		Ship ship = new Factory().Ship();
		Car car = new Factory().Car();
	}
}
*/

/*
// step 2
interface Fuel{
	String getFuel(); // ���Ḧ ��û�ϴ� �Լ�
}

class water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}

class Factory{
	
//	// ����� ��� 1
//	Airplane makeAirplan() { // ����� ��ü�� ������ִ� ���l�� �Ѵ�.
//		// ���̶�� ���Ḧ ����ϵ��� �Ѵ�.
//		Airplane airplane = new Airplane(new water()); // ����� ���� ���� �ȿ��� ����ڴ�.
//		return airplane;
//	}
	
	// ����� ��� 2
	Airplane Airplan() { // ����� ��ü�� ������ִ� ���l�� �Ѵ�.
		// ���̶�� ���Ḧ ����ϵ��� �Ѵ�.
		Airplane airplane = new Airplane(new water()); // ����� ���� ���� �ȿ��� ����ڴ�.
		return airplane;
	}
}

public class Hello {

	public static void main(String[] args) {
//		Airplane airplane = new Factory().makeAirplan();
		Airplane airplane = new Factory().Airplan();
		airplane.fly();
	}
}
*/

/*
// step 1
interface Fuel{
	String getFuel(); // ���Ḧ ��û�ϴ� �Լ�
}

class water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"�� ����");
	}
}
public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new water());
		airplane.fly();
	}
}
*/