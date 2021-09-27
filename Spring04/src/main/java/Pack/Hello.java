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
	// 일어날 수 있는 경우의 수(4가지)
	A m1() { return new A(); }
	A m2() { return new B(); } // 부 = 자 (up casting)
//	B m3() { return new A(); } // 자 = 부 (down casting)
	B m4() { return new B(); } 
}

public class Hello{
	public static void main(String[] args) {
		C c = new C();
		
		// (왼쪽) 문법 = (오른쪽) 메모리 확보
		A a0 = c.m2();
		A a1 = (A)c.m2();
		A a2 = (B)c.m2();
		// a1과 a2는 같다.
		
		// a1과 a2 둘다 f1밖에 못쓴다.
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
		return "물";
	}
}

class Gas implements Fuel{
	public String getFuel() {
		return "가스";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}

class Ship{
	Fuel fuel;
	public Ship(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 헤엄치다.");
	}
}

class Car{
	Fuel fuel;
	public Car(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 달리다.");
	}
}

public class Hello {

	public static void main(String[] args) {
		// 외부 XML 파일을 로딩해주어야 한다.
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("Context.xml"); // 설정 파일을 들고온다.
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
	String getFuel(); // 연료를 요청하는 함수
}

class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
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
	// 객체를 만들어주세요~ @Bean
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
//		Airplane airplane = new Factory().Airplane(); // Airplane 객체를 만들어주는거
//		airplane.fly();
//		
//		Ship ship = new Factory().Ship();
//		Car car = new Factory().Car();
		
		// Airplane airplane = new Factory().airplane(); // 와 결과는 동일하다.
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Factory.class);
//		Fuel fuel = ctx.getBean("makeFuel", Fuel.class); 
//		//Fuel fuel = (Fuel)ctx.getBean("makeFuel"); // 위에 코드와 같은 구조이다.
//		System.out.println(fuel.getFuel());
		
		Airplane airplane = ctx.getBean("airplane", Airplane.class); 
		airplane.fly();
		
		ctx.close(); // 리소스 낭비를 막기 위해 close를 해준다.
	}
}
*/

/*
// step 4
interface Fuel{
	String getFuel(); // 연료를 요청하는 함수
}

class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
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
		Airplane airplane = new Factory().Airplane(); // Airplane 객체를 만들어주는거
		airplane.fly();
		
		Ship ship = new Factory().Ship();
		Car car = new Factory().Car();
	}
}
*/

/*
// step 3
interface Fuel{
	String getFuel(); // 연료를 요청하는 함수
}

class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
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
	// 만드는 방법 2
	Airplane Airplan() { // 비행기 객체를 만들어주는 역햘을 한다.
		// 물이라는 연료를 사용하도록 한다.
		Airplane airplane = new Airplane(makeFuel()); // 만드는 것을 공장 안에서 만들겠다.
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
	String getFuel(); // 연료를 요청하는 함수
}

class water implements Fuel{
	public String getFuel() {
		return "물";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}

class Factory{
	
//	// 만드는 방법 1
//	Airplane makeAirplan() { // 비행기 객체를 만들어주는 역햘을 한다.
//		// 물이라는 연료를 사용하도록 한다.
//		Airplane airplane = new Airplane(new water()); // 만드는 것을 공장 안에서 만들겠다.
//		return airplane;
//	}
	
	// 만드는 방법 2
	Airplane Airplan() { // 비행기 객체를 만들어주는 역햘을 한다.
		// 물이라는 연료를 사용하도록 한다.
		Airplane airplane = new Airplane(new water()); // 만드는 것을 공장 안에서 만들겠다.
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
	String getFuel(); // 연료를 요청하는 함수
}

class water implements Fuel{
	public String getFuel() {
		return "물";
	}
}

class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) { this.fuel=fuel; }
	
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new water());
		airplane.fly();
	}
}
*/