
/*
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/

// ex5)
class UserDao{
	ConnectionMake c;
	public UserDao(ConnectionMake c) {
		this.c=c;
	}
	void addUse() { 
		c.connect();
		
		// DB 등록(insert into ~)
		System.out.println("insert into");
	}
}

interface ConnectionMake{
	void connect();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("오라클 DB 연결");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new UserDao(new AmazonConnection()); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		userdao.addUse();
	}
}

/*
// ex4-1)
// 다오 클래스 - 데이터베이스에서 CRUD를 할 수 있는 클래스를 일컫음
abstract class UserDao{
	// insert into라는 CRUD가 있어야함. (의도적으로 인수 전달을 하지 않음)
	void addUse() { 
		// DB 접속
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB 등록(insert into ~)
		System.out.println("insert into");
		
		// DB 종료
	}
	
	abstract ConnectionMake getConnection(); // 템플릿 메소드 패턴 - 무조건 상속 받는 애는 이 함수를 만들어야 한다.
}

// 팩토리 메소드 패턴 - 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class AmazonDao extends UserDao{
	@Override
	ConnectionMake getConnection() {
		return new AmazonConnection();
	}
}

interface ConnectionMake{ // 피자의 종류가 다르므로
	void connect();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("오라클 DB 연결");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new AmazonDao(); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		userdao.addUse();
	}

}
*/

/*
// ex4)
// 다오 클래스 - 데이터베이스에서 CRUD를 할 수 있는 클래스를 일컫음
abstract class UserDao{
	// insert into라는 CRUD가 있어야함. (의도적으로 인수 전달을 하지 않음)
	void addUse() { 
		// DB 접속
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB 등록(insert into ~)
		System.out.println("insert into");
		
		// DB 종료
		conn.close();
	}
	
	void getUse() {
		// DB 접속
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB 조회(select from ~)
		System.out.println("select from");

		// DB 종료
		conn.close();
	}
	
	abstract ConnectionMake getConnection(); // 템플릿 메소드 패턴 - 무조건 상속 받는 애는 이 함수를 만들어야 한다.
}

// 팩토리 메소드 패턴 - 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class AmazonDao extends UserDao{
	@Override
	ConnectionMake getConnection() {
		return new AmazonConnection();
	}
}

interface ConnectionMake{ // 피자의 종류가 다르므로
	void connect();
	void close();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("오라클 DB 연결");
	}
	@Override
	public void close() {
		System.out.println("오라클 DB 종료");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new AmazonDao(); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		userdao.addUse();
		userdao.getUse();
	}

}
*/

/*
// ex3) 팩토리 메소드 패턴의 대표적인 예 : 피자
abstract class PizzaStore{ // 본점
	void orderPizza() {
		Pizza pizza = createPizza();// 제작 방법은 다르게 한다. (서울형, 부산형)
		pizza.make();
		System.out.println("본점 브랜드를 이용해서 판매한다.");
	}
	
	void method() {}; // hook 함수 - 상속받은 애가 구현해도 되고, 안해도 되며 빈 코드를 일컫음
	abstract Pizza createPizza(); // 템플릿 메소드 패턴 - 무조건 상속 받는 애는 이 함수를 만들어야 한다.
}

// 팩토리 메소드 패턴 - 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class SeoulPizzaStore extends PizzaStore{ // PizzaStore가 본사고, SeoulPizzaStore가 프랜차이즈
	@Override
	Pizza createPizza() {
		return new SeoulPizza();
	}
}

interface Pizza{ // 피자의 종류가 다르므로
	void make();
}

class SeoulPizza implements Pizza{
	@Override
	public void make() {
		System.out.println("서울형 피자를 만든다.");
	}
}

public class Hello {

	public static void main(String[] args) {
		PizzaStore pizzastore = new SeoulPizzaStore(); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		pizzastore.orderPizza();
	}

}
*/

/*
// ex2-2)
abstract class Airplane{
	void fly() {
		getFuel().use();
		System.out.println("로 날아갑니다.");
	}
	
	void method() {}; // hook 함수 - 상속받은 애가 구현해도 되고, 안해도 되며 빈 코드를 일컫음
	abstract Fuel getFuel(); // 템플릿 메소드 패턴 - 무조건 상속 받는 애는 이 함수를 만들어야 한다.
}

// 팩토리 메소드 패턴 - 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class KoreaAir extends Airplane{
	// 연료 주입은 상속하는 자식이 알아서 바꾸세요.
	@Override
	Fuel getFuel() {
		return new Water();
	}
}

interface Fuel{ // 연료의 종류는 다양하므로
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("물");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new KoreaAir(); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		airplane.fly();
	}

}
*/

/*
// ex2-1) -- 전략 패턴을 사용하지 않기로 함.
class Airplane{
	void fly() {
		getFuel().use();
		System.out.println("로 날아갑니다.");
	}
	
	Fuel getFuel() {
		return new Water();
	}
}

interface Fuel{ // 연료의 종류는 다양하므로
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("물");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		airplane.fly();
	}

}
*/

/*
// ex1) -- 전략 패턴 사용
class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) {
		this.fuel=fuel;
	}
	
	void fly() {
		fuel.use();
		System.out.println("로 날아갑니다.");
	}
}

interface Fuel{ // 연료의 종류는 다양하므로
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("물");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new Water()); // 인젝션(injection)이라고 함 -->의존적 관계(spring에서는 DI(의존적 주입))
		airplane.fly();
	}

}
*/
