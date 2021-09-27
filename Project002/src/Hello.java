
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
		
		// DB ���(insert into ~)
		System.out.println("insert into");
	}
}

interface ConnectionMake{
	void connect();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("����Ŭ DB ����");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new UserDao(new AmazonConnection()); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		userdao.addUse();
	}
}

/*
// ex4-1)
// �ٿ� Ŭ���� - �����ͺ��̽����� CRUD�� �� �� �ִ� Ŭ������ ������
abstract class UserDao{
	// insert into��� CRUD�� �־����. (�ǵ������� �μ� ������ ���� ����)
	void addUse() { 
		// DB ����
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB ���(insert into ~)
		System.out.println("insert into");
		
		// DB ����
	}
	
	abstract ConnectionMake getConnection(); // ���ø� �޼ҵ� ���� - ������ ��� �޴� �ִ� �� �Լ��� ������ �Ѵ�.
}

// ���丮 �޼ҵ� ���� - �ڽ� Ŭ������ � ��ü�� �������� �����ϴ� ����
class AmazonDao extends UserDao{
	@Override
	ConnectionMake getConnection() {
		return new AmazonConnection();
	}
}

interface ConnectionMake{ // ������ ������ �ٸ��Ƿ�
	void connect();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("����Ŭ DB ����");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new AmazonDao(); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		userdao.addUse();
	}

}
*/

/*
// ex4)
// �ٿ� Ŭ���� - �����ͺ��̽����� CRUD�� �� �� �ִ� Ŭ������ ������
abstract class UserDao{
	// insert into��� CRUD�� �־����. (�ǵ������� �μ� ������ ���� ����)
	void addUse() { 
		// DB ����
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB ���(insert into ~)
		System.out.println("insert into");
		
		// DB ����
		conn.close();
	}
	
	void getUse() {
		// DB ����
		ConnectionMake conn = getConnection();
		conn.connect();
		
		// DB ��ȸ(select from ~)
		System.out.println("select from");

		// DB ����
		conn.close();
	}
	
	abstract ConnectionMake getConnection(); // ���ø� �޼ҵ� ���� - ������ ��� �޴� �ִ� �� �Լ��� ������ �Ѵ�.
}

// ���丮 �޼ҵ� ���� - �ڽ� Ŭ������ � ��ü�� �������� �����ϴ� ����
class AmazonDao extends UserDao{
	@Override
	ConnectionMake getConnection() {
		return new AmazonConnection();
	}
}

interface ConnectionMake{ // ������ ������ �ٸ��Ƿ�
	void connect();
	void close();
}

class AmazonConnection implements ConnectionMake{
	@Override
	public void connect() {
		System.out.println("����Ŭ DB ����");
	}
	@Override
	public void close() {
		System.out.println("����Ŭ DB ����");
	}
}

public class Hello {

	public static void main(String[] args) {
		UserDao userdao = new AmazonDao(); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		userdao.addUse();
		userdao.getUse();
	}

}
*/

/*
// ex3) ���丮 �޼ҵ� ������ ��ǥ���� �� : ����
abstract class PizzaStore{ // ����
	void orderPizza() {
		Pizza pizza = createPizza();// ���� ����� �ٸ��� �Ѵ�. (������, �λ���)
		pizza.make();
		System.out.println("���� �귣�带 �̿��ؼ� �Ǹ��Ѵ�.");
	}
	
	void method() {}; // hook �Լ� - ��ӹ��� �ְ� �����ص� �ǰ�, ���ص� �Ǹ� �� �ڵ带 ������
	abstract Pizza createPizza(); // ���ø� �޼ҵ� ���� - ������ ��� �޴� �ִ� �� �Լ��� ������ �Ѵ�.
}

// ���丮 �޼ҵ� ���� - �ڽ� Ŭ������ � ��ü�� �������� �����ϴ� ����
class SeoulPizzaStore extends PizzaStore{ // PizzaStore�� �����, SeoulPizzaStore�� ����������
	@Override
	Pizza createPizza() {
		return new SeoulPizza();
	}
}

interface Pizza{ // ������ ������ �ٸ��Ƿ�
	void make();
}

class SeoulPizza implements Pizza{
	@Override
	public void make() {
		System.out.println("������ ���ڸ� �����.");
	}
}

public class Hello {

	public static void main(String[] args) {
		PizzaStore pizzastore = new SeoulPizzaStore(); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		pizzastore.orderPizza();
	}

}
*/

/*
// ex2-2)
abstract class Airplane{
	void fly() {
		getFuel().use();
		System.out.println("�� ���ư��ϴ�.");
	}
	
	void method() {}; // hook �Լ� - ��ӹ��� �ְ� �����ص� �ǰ�, ���ص� �Ǹ� �� �ڵ带 ������
	abstract Fuel getFuel(); // ���ø� �޼ҵ� ���� - ������ ��� �޴� �ִ� �� �Լ��� ������ �Ѵ�.
}

// ���丮 �޼ҵ� ���� - �ڽ� Ŭ������ � ��ü�� �������� �����ϴ� ����
class KoreaAir extends Airplane{
	// ���� ������ ����ϴ� �ڽ��� �˾Ƽ� �ٲټ���.
	@Override
	Fuel getFuel() {
		return new Water();
	}
}

interface Fuel{ // ������ ������ �پ��ϹǷ�
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("��");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new KoreaAir(); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		airplane.fly();
	}

}
*/

/*
// ex2-1) -- ���� ������ ������� �ʱ�� ��.
class Airplane{
	void fly() {
		getFuel().use();
		System.out.println("�� ���ư��ϴ�.");
	}
	
	Fuel getFuel() {
		return new Water();
	}
}

interface Fuel{ // ������ ������ �پ��ϹǷ�
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("��");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		airplane.fly();
	}

}
*/

/*
// ex1) -- ���� ���� ���
class Airplane{
	Fuel fuel;
	public Airplane(Fuel fuel) {
		this.fuel=fuel;
	}
	
	void fly() {
		fuel.use();
		System.out.println("�� ���ư��ϴ�.");
	}
}

interface Fuel{ // ������ ������ �پ��ϹǷ�
	void use();
}

class Water implements Fuel{
	@Override
	public void use() {
		System.out.print("��");
	}
}

public class Hello {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new Water()); // ������(injection)�̶�� �� -->������ ����(spring������ DI(������ ����))
		airplane.fly();
	}

}
*/
