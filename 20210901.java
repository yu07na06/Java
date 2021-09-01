package Pack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
class Tiger{

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
//ex67)
public class Hello extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); // UI의 제일 상단에 있다 : root
		root.setPrefSize(400, 300); // 사이즈 변경
		//------------------------------------------- 
		
		// 이 영역에 모든 코드가 들어 간다.
		Button btn1 = new Button("눌러줘1");
		root.getChildren().add(btn1); // root 밑으로 들어가라고 해야함, 아니면 root와 아무런 연관이 없음 
		Button btn2 = new Button("눌러줘2");
		root.getChildren().add(btn2); // root 밑으로 들어가라고 해야함, 아니면 root와 아무런 연관이 없음 
		
		//-------------------------------------------
		Scene scene = new Scene(root); // 장면으로 등록 시키기 위해 객체 생성
		arg0.setTitle("Server"); // 캡션창에 제목 설정
		arg0.setScene(scene); // 프라이빗 씻? : arg0, setScene이 장면으로 등록시켜줌 
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); // 여기서 blocking이 되어버림
		System.out.println("Exit");
	}
}
*/

/*
//ex66)
public class Hello extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(2);
		arg0.show();
		System.out.println(3);

	}
	
	public static void main(String[] args) 
	{
		System.out.println(1);
		launch(); // 여기서 blocking이 되어버림
		System.out.println(4);
	}
}
*/

/*
//ex65)
public class Hello
{

	
	public static void main(String[] args) 
	{
				Thread t = new Thread() {
					public void run() {
						System.out.println(1);
					}
				};
				t.start();
				
				new Thread() {
					public void run() {
						System.out.println(2);
					}
				}.start();
	}
}
*/

/*
class Tiger extends Thread{
	public void run() {
		System.out.println("Tiger start");
		
		Thread t = new Lion();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // 여기까지 입력받고 제어권을 다른 곳으로 넘겨 아래에 출력을 하지 않는 것을 확인할 수 있다.
		
		System.out.println("Tiger end");
	}
}
class Lion extends Thread{
	public void run() {
		System.out.println("Lion start");
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		System.out.println("Lion end");
	}
}

//ex64)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		
		Thread t = new Tiger();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // 블록킹 함수
		
 		System.out.println("main end");
	}
}
/*

/*
class Tiger extends Thread{
	public void run() { // 2
		System.out.println(2);
		
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이 "+i);
			try {Thread.sleep(0);} catch (Exception e) {} // 블록킹 함수
			// 컴퓨터 니가 쉴 수 있는 시간보다 가장 작게 쉬어라 (최소한의 시간동안 쉼)
			// sleep 1을 못하는 이유는, 컴퓨터가 1쉴동안 다른 프로세스를 전부 실행시켜놓음(부지런한것...)
		}
		System.out.println("종료");
	}
}

//ex63)
public class Hello 
{
	public static void main(String[] args) 
	{
		Thread t = new Tiger();
		// Thread가 start가 있기 때문에 이것이 실행이 될 수 있었다. 또한, start에 run이 있었기 때문에 자식이 가지고 있는 run이 호출된 것이다.
		t.start(); // 1
		System.out.println(1);
		// 1과 2가 출발지점이 같으며, 운영체제는 어느 것을 선택해서 실행하는지는 모름 -- thread가 생성되었다.
		
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("	코끼리 "+i);
			try {Thread.sleep(0);} catch (Exception e) {} // 블록킹 함수
			// 컴퓨터 니가 쉴 수 있는 시간보다 가장 작게 쉬어라 (최소한의 시간동안 쉼)
		}
		// 컴퓨터가 느리면, 느릴수록 잘 섞임
		
		System.out.println("main Exit");
	}
}
*/

/*
class A{
	void start() {
		System.out.println("start call");
		run();
	}
	
	void run() { // 자식에서 run이 있으므로 upcasting에서는 자식을 먼저 찾아보므로 A run이 먼저 실행 된다.
		System.out.println("A run");
	}
}

class B extends A{
	void run() {
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 종료");
	}
}

//ex62)
public class Hello 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.start();
	}
}
*/

/*
class A<T>{ // 외부에서 타입을 알려줄테니, 그걸로 타입을 사용해라
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

//ex61-2) 제너릭 문법 - 코드의 양이 줄어든 것이 아님. 컴파일을 하면 ex61-1과 같아짐.
public class Hello 
{
	public static void main(String[] args) 
	{
		A<Integer> a = new A<Integer>();
		a.setData(100);
		System.out.println(a.getData());
		
		A<String> b = new A<String>();
		b.setData("호랑이");
		System.out.println(b.getData());
		
		LinkedList<Integer> l = new LinkedList<Integer>(); // 어떤 타입이 들어올지 모르니 제너릭 타입의 문법을 유지하고 있다.
	}
}
*/

/*
class A{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class B{
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

class C{ // 타입이 다르다는 이유로 클래스를 새로 만듦
	private float data;
	
	public float getData() {
		return data;
	}
	
	public void setData(float data) {
		this.data = data;
	}
}

//ex61-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.setData(100);
		System.out.println(a.getData());
		
		B b = new B();
		b.setData("호랑이");
		System.out.println(b.getData());
	}
}
*/

/*
class 커피{
	int 가격 = 30;
	int 계산() {
		System.out.println("커피 주문");
		return 가격;
	}
}

class 설탕 extends 커피{
	int 가격 = 20;
	커피 a;
	설탕(커피 a){
		this.a=a;
	}
	int 계산() {
		System.out.println("설탕 추가");
		return 가격 + a.계산();
	}
}

class 프림 extends 커피{
	int 가격 = 10;
	커피 a;
	프림(커피 a){
		this.a=a;
	}
	int 계산() {
		System.out.println("프림 추가");
		return 가격 + a.계산();
	}
}

//ex60-3) 데코레이션 패턴 활용
public class Hello 
{
	public static void main(String[] args) 
	{
		커피 a = new 커피();
//		System.out.println(a.계산());
		a = new 설탕(a);
		a = new 설탕(a); // 설탕을 하나 더 주문할 수 있다.
//		System.out.println(a.계산());
		a = new 프림(a);
		a = new 프림(a);
		a = new 프림(a); // 이것이 데코레이션 패턴의 매력
		System.out.println(a.계산());
	}
}
*/

/*
class A{
	int num = 10;
	int run() {
		System.out.println("A Run");
		return num;
	}
}

class B extends A{
	int num = 20;
	A a;
	B(A a){
		this.a=a;
	}
	int run() {
		System.out.println("B Run");
		return num + a.run();
	}
}

class C extends A{
	int num = 30;
	A a;
	C(A a){
		this.a=a;
	}
	int run() {
		System.out.println("C Run");
		return num + a.run();
	}
}

//ex60-2) 데코레이션 패턴 (계속해서 덧붙진다.-객체가 객체를 감싸고 객체가 객체를 감싸는 코드)
public class Hello 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a = new B(a); // 곧 사라질 놈을 백업 잡았다.
		System.out.println(a.run());
		
		System.out.println("-------------------------");
		a = new C(a);
		System.out.println(a.run());
	}
}
*/

/*
class AA{} // 단줄 처리
class BB extends AA{}
class CC extends AA{}

//ex60-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		AA a1 = new BB(); // a1은 AA 타입
		System.out.println(a1.hashCode());
		a1 = new CC(); // 이전 객체는 사라지고, 새로운 객체를 사용한다. 
		System.out.println(a1.hashCode());
		a1 = new BB();
		System.out.println(a1.hashCode());
		
		AA a2=a1; // 백업
		a1 = new CC(); // 이전에 자기 객체를 a2에 백업시킴
	}
}
*/

/*
//ex59-3)
public class Hello 
{
	public static void main(String[] args)ㄴ 
	{
		try {
//			Reader r = new FileReader("test02.txt", Charset.forName("UTF-8")); // 인코딩 : UTF-8
			Reader r = new FileReader("test02.txt"); // 인코딩 : ANSI
			while(true) { // 데이터를 하나씩 읽는 건 속도면에서 좋지 못함.
				int data = r.read(); // 데이터 읽기 - 한개의 데이터를 읽어옴
				if (data==-1) { // 파일을 다 읽으면, data는 -1을 받아옴
					break;
				}
				System.out.print((char)data); // 데이터를 읽을때 casting을 하여 문자로 변환해 출력
			}
			System.out.println();
			
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
*/

/*
class Tiger{ // extends Object 가 원래 있지만, 자바에서 생략 모든 클래스의 부모는 Object임 컴파일할떄 생김
	
}

//ex59-2)
public class Hello 
{
	public static void main(String[] args) 
	{
		try {
			// 파일 불러오기 사용할때 어쩔 수 없이 try catch를 사용해야함
			// Unhandle 무조건 오류를 자기가 해결하지 않고, 사용자가 해결해라
			Writer w = new FileWriter("test01.txt"); // upcasting -- 부자관계임
			
			w.write("apple"); // 파일에 사과 적어랑
			w.write("\n");
			w.write("무궁화\n\n");
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2==0? "O ":"X ");
				}
				w.write("\n");
			}
			
			w.close(); // 파일 입출력시 파일 열기 뒤에 반드시 파일 닫기를 작성하기
			System.out.println("파일 입출력 종료"); // 항상 파일 열고 닫을떄 상황이 끝났는지 확인하도록 하자
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
*/

/*
//ex59-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("(i, j)");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("["+i+" "+j+"] ");
			}
			System.out.println();
		}System.out.println();
		
		// 체스 모양
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if((i+j)%2==0) {
					System.out.print("O ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}System.out.println();
	}
}
*/

/*
class Tiger{
	int num;
	private static Tiger instance=null; // 멤버 변수
	private Tiger() {
		
	}
	
	static Tiger getInstance() {
		if(instance==null) {
			System.out.println(1);
			instance=new Tiger();
		}
		return instance;
	}
	
	void m1() {
		System.out.println(1000);
	}
}

//ex58-1) - GOF의 싱글톤 패턴
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1=Tiger.getInstance();
		Tiger t2=Tiger.getInstance();
		System.out.println(t1.hashCode()); // 동일한 객체이다.
		System.out.println(t2.hashCode()); // 동일한 객체이다.
		t1.m1();
		t2.m1();
		
		t1.num=2000;
		System.out.println(t2.num); // 동일한 객체임을 증명
	}
}
*/

/*
class Tiger{
	// 객체를 못만들게 하는 테크닉이 있음. 생성자에서
	private Tiger() {} // 생성자에 private를 적으면, 외부에서 아예 객체를 못만들게 된다. 최소한 여러개 만들수 있는 원천적인 방법을 차단한다.
	
	// static 함수는 static 변수를 사용해야 하므로 변수에 static을 적음
	// 객체가 아니다라는 의미와 요소를 확인할떄 null 값이 있기 위해 null을 넣음
	static private Tiger t = null; // 멤버 변수로 사용 - 밖에서 사용하지 못하도록 private를 적어야함
	static void m1() { // static은 처음부터 class 밖으로 빠겨나가 있으므로
//		Tiger t = new Tiger(); // 어떻게든 한 번은 객체를 생성해야 하므로 메소드 안에 객체 생성
		if(t == null) { // main에서 객체를 생성하면, 다시는 객체를 또 생성하지 못함
			System.out.println(1);
			t=new Tiger();
		}
	}
}

//ex58)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger.m1(); // 객체가 한 개 생성했다.
		Tiger.m1(); // 객체 두개 생성 못함
		
	}
}
*/

/*
class Tiger{
	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age=age;
	}
}

//ex57-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.setName("박유나");
		t.setAge(23);
		System.out.println(t.getName());
		System.out.println(t.getAge());
	}
}
*/

/*
class Tiger{
	private int a; // private : class 내부에서만 사용할 수 있다. - 데이터를 은닉한다.
	// public : 누구나 사용할 수 있따.
	public int b; // default가 앞에 생략되어 있다. 적으면 오류남 - dafault와 유사하게 쓰이는게 public을 구태역으로 넣어줌
	
	/////////////////////////////////////////////////////////////////////////////////////여기 덩어리가 한 쌍!! get함수, set함수라고 말함
	private int num; // 외부에서 값을 변경하고 싶다면, 함수에서 접근하도록 한다.
	public void setNum(int num) { // 쓰기 전용
		this.num = num;
	}
	public int getNum() { // 읽기 전용
		return this.num;
	}
	////////////////////////////////////////////////////////////////////////////////////MVC에서 모델을 만들때 형식이다.	
	
	private void m1() { // 외부에 노출을 시키지 않는 메소드
		
	}
}

//ex57)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.b=10;
//		t.a=10; // 이렇게 사용할 수 없다. a가 private으로 접근 제한이 되어있기 때문에
		
		t.setNum(100); // class 내부 변수를 변경할때 사용하는 우회적인 방법
		System.out.println(t.getNum());
	}
}
*/

/*
interface Test1{
	void m1();
}

interface Test2{
	int m1();
}

class Tiger{
	void m2(Test1 t) {
		t.m1();
	}
	
	void m3(Test2 t) {
		System.out.println(t.m1());
	}
}

//ex56)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ex1)
		Test1 t1 = ()->{
			System.out.println(1);
		};
		Tiger tiger = new Tiger();
		tiger.m2(t1);
		// 실제 사용 모습
		tiger.m2(()->{
			System.out.println(2);
		});
		
		tiger.m3(()->100);
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(22);
		mm.removeIf((lion)->lion%2==0);
		mm.removeIf((lion)->{
			return lion%2==0; 
		});
		System.out.println(mm);
		
	}
}
*/

/*
interface Test1{
	void m1();
}

interface Test2{
	void m1(int num);
}

interface Test3{
	int m1();
}

interface Test4{
	String m1(int num, String str);
}

interface Test5{
	int m1();
}

//ex55)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ex1) 익명 클래스로 사용하기
		Test1 t1 = new Test1() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		
		// ex2) 람다 사용 
		Test1 t2=()->{
				System.out.println(2);
		};
		t2.m1();
		
//		// ex3) 람다 인수 전달이 있을때
//		Test1 t3=()->{ // 인터페이스에서 출발했기 때문에 인수 전달을 괄호 안에 넣을 수는 없다.
//			
//		};
		
		// ex3) 람다 인수 전달이 있을때 - 인터페이스에 함수가 하나 있다는 가정 하에 람다를 사용할 수 있다는 점!
		Test2 t3 = (n)->{ // 인수 적을때 타입 적지 않으며, interface에 명시된 변수를 적을 필요 없다.
			System.out.println(n);
		};
		t3.m1(100);
		
		// ex4) 리턴을 가지는 람다
		Test3 t4 = () ->{
			System.out.println(3);
			return 100;
		};
		System.out.println(t4.m1());
		
		// ex5) 람다 인수 전달이 2개 이상일때
		Test4 t5 = (n, s)->{
			return n+s;
		};
		System.out.println(t5.m1(100, "호랑이"));
		
		// ex6) 람다 반환 코드를 단줄로 작성할 때
		Test5 t6 = () -> 100; // return이 있는 코드가 단줄일때, 스코프와 return을 생략해서 적는 경우도 있다.
		System.out.println(t6.m1());
	}
}
*/
