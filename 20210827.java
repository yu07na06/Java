package Pack;

import java.util.Iterator;

/*
class Animal{

}

class Tiger extends Animal{

}

//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");
	}
}
 */

/*
class A{
	void m1(){
		System.out.println(1);
	}
}

interface B{
	void m2(); // 함수 원형/프로토타입 - 코드가 제외한 나머지
}

interface C{
	void m3();
}

class D extends A implements B, C{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}
}

@FunctionalInterface // 반드시 함수 원형을 1개만 넣어야한다. 라고 말한다.
interface E{ // 인터페이스 함수 원형을 넣어달라 강제함
	void m1();
//	void m2();
}

//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		D t = new D();
		t.m1();
		t.m2();
		t.m3();
		
//		Thread t2=null; // t2: 객체를 받기 위한 변수일 뿐 - 객체 메모리를 할당하지 않을떄는 null을 적는 습관을 가지자
//		String s=null;
//		StringBuffer sf=null;
	}
}
*/

/*
interface 한국은행{
	void 입금();
	void 출금();
	void 이체();
	void 대출();
}

class 국민은행 implements 한국은행{
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 입금() {
		// TODO Auto-generated method stub
		System.out.println("이자율은 3%입니다.");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
}

class 우리은행 implements 한국은행{
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 입금() {
		// TODO Auto-generated method stub
		System.out.println("이자율은 4%입니다.");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
}

//ex40)
public class Hello 
{
	public static void main(String[] args) 
	{
		국민은행 t1=new 국민은행();
		우리은행 t2=new 우리은행();
		
		t1.입금();
		t2.입금();
		
	}
}
*/

/*
class 대장장{
	void 칼() { // 칼 잘 만듦
		System.out.println("칼을 잘 만듭니다.");
	}
	
	void 방패() {}; // 방패 잘 못만듦-자식 니가 만들어라
}

class 나그네1 extends 대장장{ // 무조건 방패를 만들어야함
	void 방패() {
		System.out.println("방패 잘 만듭니다.");
	}
}

//@Override // Annotation(어노테이션) - 프로그래머가 실수할 수 있는 상황을 방지하기 위해 사용하게 된다.
class 나그네2 extends 대장장{ // 무조건 방패를 만들어야함
	@Override
	void 방패() {
		// TODO Auto-generated method stub
		super.방패();
	}
}


//ex39)
public class Hello 
{
	public static void main(String[] args) 
	{
		나그네1 t1 = new 나그네1();
		t1.칼();
		t1.방패();
		
		나그네2 t2 = new 나그네2();
		t2.칼();
		t2.방패();
	}
}
*/

/*
// 이 클래스는 코드가 미완성되었습니다.
// abstract class Animal{ // abstract : 추상(미완성)
//	abstract void m1(); // {} 스코프가 없는 코드를 미완성 코드
//}

interface Animal{ // abstract : 추상(미완성)
	abstract void m1(); // {} 스코프가 없는 코드를 미완성 코드
	// interface는 abstract을 자바에서 자동으로 붙여줌
	// abstract은 함수를 만들 수 있지만, interface는 함수를 만들면 안되고 가이드만 제공해야함.
}

// extends - 부모가 만든걸 추가적으로 사용한다는 확장 개념
// implements - 부모가 못다한 꿈을 자식이 해라고
// 기능적으로 interface로 바꿀 수 있다면, 바꾸는게 더 좋음
class Tiger implements Animal{ // 미완성 코드를 상속하면, 부모가 완성하지 못하는 것을 자식은 완성시켜놔야하기 때문에 Tiger는 반드시 m1이 필요
	public void m1() { // 부모가 만들어달라는 가이드를 제공한 함수는 반드시 public을 앞에 적어놔야함(중요)
		System.out.println(2);
	}
}

//ex38)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1=new Tiger();
		t1.m1();
//		Animal t2=new Animal(); // 미완성 코드라서 객체를 생성할 수 없음
	}
}
*/

/*
// 다형성 프로그램이다. - 업캐스팅이 없다면, 다형성을 말할 수 없다. 고로 업캐스팅을 하는 것 자체가 다형성 프로그램이라고 한다.
class Animal{
	void cry() { // 짖다, 울다
		System.out.println("...");
	}
}

class Dog extends Animal{
	void cry() { // 짖다, 울다
		System.out.println("멍멍!");
	}

}

class Cat extends Animal{
	void cry() { // 짖다, 울다
		System.out.println("야옹~");
	}

}

class Snake extends Animal{

}

//ex37)
public class Hello 
{
	public static void main(String[] args) 
	{
		Random rn=new Random();

		Animal t0=new Dog();
		Animal t1=new Cat();
		Animal t2=new Snake();

		for (int i = 0; i < 10; i++) {
			int num=rn.nextInt(3); // 0,1,2
			switch (num) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;
			}
		} // 업캐스팅을 이용하면, 스위치문이 필요가 없어지는 것을 아래에서 확인할 수 있다.
		
		System.out.println("-------------------------");
		Animal[] t3=new Animal[] {new Dog(), new Cat(), new Snake()};// animal 타입으로 배열을 받겠다는 말
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry(); // 업캐스팅을 이용하면, 스위치문을 사용하지 않고도 이런식으로 사용할 수 있다.			
		}
		
	}
}
*/

/*
//ex36)
public class Hello 
{
	public static void main(String[] args) 
	{
		Random rn = new Random();
		System.out.println(rn.nextInt()); // int 범위 안에 수를 가져온다.
		for (int i = 0; i < 10; i++) {
//			int num=rn.nextInt(10); // 내가 넣은 숫자 -1 까지 random으로 나옴
//			System.out.println(num);

			System.out.println(rn.nextInt(10)); // 두줄을 한줄로 처리한 것

		}
	}
}
 */

/*
//ex35)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=10; // 4바이트 양수 한개 주세요

		// 자바 배열 선언 방식(3가지)
		int[] ar = new int [5]; // 실제로 사용하는 문법
		int[] br = new int [] {1,2,3,4,5};  
		int[] cr = {10,20,30,40,50};

		System.out.println(ar.length); // 배열이 가지고 있는 개수를 알려준다.
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println(); // 한줄처리했을때, 마지막에 줄바꿈 코드를 출력한다.

		// i변수 대신에 x, data, value 를 사용함. (i는 인덱스 개념이 강해서, 인덱스가 출력될 것 같아서 그래요)
		for (int x : cr) { // 간략화된 for문
			System.out.print(x+" ");
		} System.out.println(); // 단점 : 인덱스 번호를 모름

		//cr같은 경우, 메모리를 5개 달라고 했음. 배열의 유효범위 인덱스 크기는 '배열의 길이-1' 임
		cr[0]=100;
		cr[4]=200;
//		cr[5]=300; // 유효범위를 벗어났기 때문에 오류가 난다.

//		ar[-1]=400;
		int num=3;
		ar[num]=500;
		ar[num*3-5]=600; // num*3=9-5=4 이므로 이건 작동해봐야 안다.
		ar[2]=3;
		ar[ar[2]]=999;

		System.out.println(ar[2]+" "+ar[3]);

		ar[ar[3]-998]=888; // 유효범위 안에 들어가면 오류가 나지 않음
		for (int x : ar) {
			System.out.print(x+" ");
		} System.out.println();

		System.out.println("----------------------");
		boolean[] dr={true, true, false, true};
		for (boolean x : dr) {
			System.out.print(x+" ");
		} System.out.println();

		System.out.println("----------------------");
		String[] ss=new String[4]; // String 타입으로 변수 4개가 만들어졌다.
		ss[0]="호랑이";
		ss[1]="거북이";
		ss[2]="코끼리";
		ss[3]="맘모스";
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]+" ");
		} System.out.println();
		for (String data : ss) {
			System.out.print(data+" ");
		} System.out.println();

		String[] st=new String[] {"해바라기", "붓꽃", "튤립"};
		String s1="호랑이"; // 약식
		String s2=new String("독수리"); // 정석
		String[] su=new String[] {new String("민들레"), new String("코스코스"), new String("장미")}; // st와 문법이 유사하게 같음
	}
}
 */

/*
class Animal{
	void cry() { // 짖다, 울다
		System.out.println("...");
	}
}

class Dog extends Animal{
	void cry() { // 짖다, 울다
		System.out.println("멍멍!");
	}

}

class Cat extends Animal{
	void cry() { // 짖다, 울다
		System.out.println("야옹~");
	}

}

class Snake extends Animal{

}

class Zoo{ // 동물 울음소리를 듣고싶을때마다 계속해서 오버로딩 함수를 넣어주어야하는 단점이 있다. 계속 클래스를 수정하는 것보다 업캐스팅을 사용한다.
//	void sound(Dog t) {
//		t.cry();
//	}
//	void sound(Cat t) {
//		t.cry();
//	}
//	void sound(Snake t) {
//		t.cry();
//	}

	void sound(Animal t) {
		t.cry();
	}
}

//ex34)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 업캐스팅으로 구현
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Snake();

		// 부모는 먼저 자식을 쳐다보고 울고 있는 애가 있는지 확인하고, 자식이 울고 있으면 자식꺼를 호출한다.
		t1.cry();
		t2.cry();
		t3.cry(); // 뱀은 울지 않기 때문에 부모꺼로 출력이 된다.

		//////////////////////////////////////// 위, 아래 결과가 같은데 왜 업캐스팅을 쓰냐 //////////////////////////////////////////////////

		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Snake t6 = new Snake();

		t4.cry();
		t5.cry();
		t6.cry(); 

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("--------------------------");
		Zoo t7 = new Zoo();
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Snake());
	}
} // 화장에 열려있고, 코드 변경에는 닫혀있다. : 개방폐쇄원칙
 */

/*
class Animal{
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
}

class Tiger extends Animal{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

//ex33)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal();
		Tiger t2 = new Tiger();
		Animal t3 = new Tiger(); // 업 캐스팅(부자관계)
//		Tiger t4 = new Animal(); // 다운 캐스팅 / 자바에서는 제공하지 않는 문법

		t3.m1(); // 타입이 부모이기 때문에, 문법 자체로 부모꺼만 쓸 수 있음 - 자식꺼는 못쓴다. 못쓰는 메모리가 있는 것

		// 부자관계는 무조건 자식을 먼저 본다. 먼저 자식을 쳐다보고 있으면 자식꺼를 호출하고 끝냄, 없으면 자기꺼 호출하고 끝냄
		t3.m3();  // 자식에 있는 m3가 있는 것을 확인하고, 자식꺼를 호출한다.
	}
}
 */

/*
class Animal{ // 부모
	Animal(){
		System.out.println("부모 생성자 콜");
	}
	Animal(int n){
		System.out.println(n);
	}
}

class Tiger extends Animal{ // 자식
	Tiger(){
		// 현재 라인에 코드가 한 줄 생략되어있다. --> 자바에서 자동으로 super();를 부름, 내가 적으면 자동 해제된다.
//		super(); // 부모의 생성자를 콜 한다.
		System.out.println("자식 생성자 콜");
	}
	Tiger(int num){ 
		// 이것도 super가 생략
		super(num+100); // 명시적으로 적어줌
		System.out.println(num);
	}
	Tiger(int a, int b){ 
		super(a*b); // 슈퍼는 코드의 맨 처음에 있어야한다.
		System.out.println("세번째 생성자");
	}

}

//ex32)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 사실, 자식 생성자가 먼저 콜이 되었고, 그 다음에 부모 생성자가 콜이 되었다.
		// 자식 객체가 생성되었을때도 마찬가지로, 자신의 생성자를 먼저 콜 하는 것이 맞다.
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(100);
		Tiger t3 = new Tiger(3,4);
		// 결과적으로는 자식 생성자가 먼저 호출된 것이다. 자식 생성자에 super가 있어서 부모로 간겨
	}
}
 */

/*
// 상속 구조
class Animal{ // 부모
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

class Tiger extends Animal{ // 부모(Animal) 자식(Tiger) 관계
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
	void m4() {
		m3(); // 메소드가 메소드를 부를 수 있다.
		System.out.println(4);
		super.m3(); // 부모를 부르는 간접적인 방법
	}
}

//ex31)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal(); // 상속과 아무런 관계가 없다 - Animal만 쓰려고 객체를 생성한 것 뿐
		Tiger t2 = new Tiger(); // 이건 상속과 연관이 있음

		t2.m1(); // 자기꺼를 뒤져보고 있어서, 자기꺼를 출력
		t2.m2(); // 자기한테 m2가 없어서, 부모한테 m2가 있는걸 발견하고 사용함
		t2.m3(); // 부모한테 m3가 있지만, 자기 자신한테도 m3가 있기 때문에 / 자기 자신꺼를 쓴다.

		t2.m4(); // 자기 자신에게 있는 m3를 부모의 m3를 가지고 오고 싶은 방법은 간접적인 방법이 있다. (super 사용)
	}
}
 */

/*
//ex30 - 책 p.533
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(Math.abs(-3));



		.out.println(Math.ceil(5.3));
		System.out.println(Math.ceil(5.0));
		System.out.println(Math.ceil(12));
		System.out.println(Math.ceil(-3.2));
		System.out.println(Math.ceil(-3.6));
		System.out.println(Math.floor(-3.6));		
		System.out.println(Math.floor(-3.2));		
		System.out.println(Math.floor(5.4));		
		System.out.println(Math.random());		
		System.out.println(Math.rint(5.6));		
		System.out.println(Math.rint(5.4));		
		System.out.println(Math.rint(-5.4));		
		System.out.println(Math.rint(-5.6));		
		System.out.println(Math.round(-5.4));		
		System.out.println(Math.round(-5.9));		
	}
}
*/

/*
class Tiger{
	static void mymain() {
		Tiger t=new Tiger(); // 이게 성립하느냐? 성립 한다. 자기 클래스 내에서 객체 생성이 가능하다.
		t.m1(); // 전혀 문제가 되지 않는다.
//		m1(); // 안될 이유는 없다.
	}

	void m1() {
		System.out.println(111);
	}
}

//ex29)
public class Hello // 그러고 보니 이게 클래스였네, hello 이름의 클래스를 사용중이었음
{
	// 아래에 static이 적혀있음
	// void main - entry point (main 이 함수 이름)
	// 이건 누가 불렀는지 출처부터 알아야함. 이건 운영체제에서 부름
	// static을 지워서 이거 객체 생성안시키면, 사용 못함 - 운영체제는 이 main을 사용할 수 없음. 방법은 있음 운영체제 지가 직접 객체를 생성하면 된다.
	static int num=10; // 문법적으로 전혀 하자가 없음

	Hello(){ // 생성자는 무조건 클래스 이름과 동일해야함

	}
	static void m1() { // 함수를 생성해도 전혀 문제가 되지 않음
		System.out.println(1);
	}

	public static void main(String[] args) 
	{
		System.out.println(num); // static 함수 안에서는 반드시 static 멤버만 쓸 수 있다.
		m1(); // 이걸 쓰고 싶으면, 메소드에 static을 사용하면 된다.
		Hello h=new Hello();
		h.m1();
		h.m2();
		Hello.m1();
//		Hello.m2(); // 사용할 수 없음
	}

	void m2() { // main 아래에 메소드를 적어도 전혀 문제가 발생하지 않는다.
		System.out.println(2);
	}
}
 */

/*
// static 적혀져 있는 멤버가 컴파일 되었을때의 모습
// static은 필드나 함수에 붙일 수 있음.
// static은 객체를 생성시키지 않아도 사용할 수 있다가 핵심
// 필드에 static을 붙잉는 경우는 = 객체간의 전역 변수, 공용 변수로 사용되는 것임
class Tiger{
	int num1;
	static int num2=100; // static은 처음부터 값을 초기화하는게 원칙이다.

	static void m1() {
		System.out.println("static 함수 콜");
	}
}

//ex28)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		System.out.println(t2.num2); // 클래스 변수 이름으로 접근하면, 프로그램 상으로 혼란이 있음 (원칙에는 어긋남)
		t2.num2=200;
		System.out.println(t1.num2); // 관제탑은 다같이 쓰기 때문에 다른 객체 변수가 접근해서 변경하면 또 다른 객체에서 사용할 때 변경된 값을 사용하게 된다.
		System.out.println(Tiger.num2); // 관제탑은 클래스 이름으로 접근하는게 원칙
		Tiger.m1();

		//ex - math 표준 클래스
		System.out.println(Math.abs(-10)); // 절댓값 함수
		String a;
		a.length();
		// abs는 static으로 만들어진 것 - 처음부터 만들어진 것
	}
}
 */

/*
// 필드 생성 > 생성자 생성 > 메소드 생성
class Car{
	// 멤버
	int fuel=100; // 연료
	String name;

	// 생성자
	Car(){
		System.out.println("디폴트 생성자 출력");
		name="무명";
	} // default 생성자

	Car(String n, int f){
		name=n;
		fuel=f;
		System.out.println("인수 전달 생성자 출력");
	}

	// 메소드
	void move() { // 자동차 달릴때 연료가 소비되는 메소드
		if (fuel<40) {
			System.out.println("자동차 연료가 부족합니다. 현재 연료 상태 :"+fuel);
			return;
		}
		System.out.println(name+" 자동차가 달린다");
		fuel-=30;
	}
	
	boolean moveR() {
		if (fuel<40) {
			System.out.println("자동차 연료가 부족합니다. 현재 연료 상태 :"+fuel);
			return true;
		}
		System.out.println(name+" 자동차가 달린다");
		fuel-=30;
		return false;
	}

	void stop() { // 자동차 멈출때, 연료가 소비되는 메소드
		System.out.println(name+" 자동차가 멈춘다");
		fuel-=10;
		if (fuel<40) {
			System.out.println(name+"자동차 연료가 "+fuel+" 만큼 남았습니다.");
		}
	}

	void inject() { // 연료를 주입한다. (inject : 주입하다 (전공용어))
		fuel+=100;
		System.out.println(name+" 연료를 "+100+" 만큼 주입합니다.");
		System.out.println("현재 연료는 "+fuel+" 입니다.");
	}

	void inject(int f) { // 연료를 주입한다. (inject : 주입하다 (전공용어))
		if (fuel+f>300) {
			System.out.println(name+" 너무 많은 주입은 불가능합니다."+"\n"+"남은 연료통 공간 : "+ (300-fuel));
			System.out.println("남은 연료통 공간 : "+ (300-fuel));
			return;
		}
		System.out.println(name+" 연료를 주입한다.");
		fuel+=f;
		if (fuel==300) {
			System.out.println(name+" 연료통이 가득 찼습니다.");
		}
	}

	void show() { // 자동차 연료 확인 메소드
		System.out.println(name+" 연료 : "+fuel);
		System.out.println(name+" 남은 연료 공간 : "+(300-fuel));
	}
	
	int showF() {
		return fuel; 
	}
}

//ex27)
public class Hello 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		Car car2 = new Car("람보르기니", 200);
		System.out.println();

		car1.move();
		car2.move();
		System.out.println();

		car1.show();
		System.out.println();
		car2.show();
		System.out.println();
		
		car2.move();
		car2.move();
		car2.move();
		car2.move();
		car2.move();
		car2.move();
		System.out.println();
		car2.inject();
		System.out.println();
		
		car2.move();
		car2.move();
		car2.move();
		System.out.println();
		car2.stop();
		
		System.out.println("-----------------------------------");
		
		int count=0;
		while(true) {
			if (car2.moveR()) {
				car2.inject();
			}
			count+=1;
			System.out.println();
			if (count==14) {
				int F=car2.showF();
				if(F<10) {
					car2.inject(10-F);
				}
				car2.stop();
				break;
			}
		}
	}
}
*/


/*
// 내가 생성자를 만들면, 클래스에서 생성자를 안만들어줌
class Tiger{
	Tiger(){} // 프로그래머들은 프로그램할때, 디폴트 생성자를 쓰든 안쓰든 그냥 일단 쓰고 본다. 이런 습관을 가지자.

	Tiger(int a, int b){

	}
}

//ex26)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); //내가 생성자를 만들면, default 생성자를 안만들어줌
		Tiger t2 = new Tiger(10, 20);

	}
}
 */

/*
//1) 생성자는 함수이다. --> 그래서 생성자 함수라고 한다.
//2) 함수 이름은 클래스 이름과 반드시 동일해야 한다.
//3) 생성자 함수는 리턴값을 가질 수 없다. 그래서 void 조차도 생략한다.
//4) 생성자 함수도 오버로딩이 가능하다.
//5) 생성자 함수는 객체가 생성될때, 단 한번 호출된다. (임의로 호출할 수 없다.)
//6) 생성자를 사용하는 목적은 멤버, 메소드를 초기화하는 목적으로 사용된다.
//7) 생성자 함수를 작성하지 않을 시에는 자동으로 default 생성자가 만들어진다.
class Tiger{
	int age=20; // 멤버는 첫자가 소멸자로 시작
	String name="홍길동";

	// 인수 전달이 없는 생성자를 "default 생성자"라고 한다.
	Tiger(){ // 이게 생성자 - 위에 선언한 멤버를 초기화하는 것이 목적
		System.out.println("생성자 콜");
		age=20;
		name="홍길동";
	} // 객체가 생성되면서, 멤버를 초기화 해줌

	Tiger(int a, String n){
		age=a;
		name=n;
	}

	// 이런 출력 함수를 사용하면, 작업이 훨씬 편해진다
	void showInfo() { // 낙타 표기법으로 쓰자
		System.out.println(age+" "+name);
	}

}

//ex25)
public class Hello 
{
	public static void main(String[] args) 
	{
		// Tiger()는 반드시 new 뒤에서만 호출이 되고, 내가 임의로 선언할 수 없다.
		Tiger t1 = new Tiger(); // 생성자 함수가 호출이 된다. --> Tiger() 이것이 생성자를 호출한 것
		Tiger t2 = new Tiger(); // 객체가 생성될 때마다 호출이 된다.
		Tiger t3 = new Tiger(100, "독수리"); // 생성자 오버로딩으로 인수를 전달할 수 있다.
		Tiger t4 = new Tiger(200, "앵무새");

		t1.showInfo();
		t2.showInfo();
		// 멤버는 처음부터 초기화해서 시작하면 안되나요? 맞다. 하지만 생성자 오버로딩에서 차이가 난다. 아래와 같이!!!
		t3.showInfo();
		t4.showInfo();
	}
}
 */
