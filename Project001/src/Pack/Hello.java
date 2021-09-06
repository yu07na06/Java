package Pack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*********************************************************** 21.9.2(목) *************************************************************/
class Tiger{
	
}

//ex70)
public class Hello extends Application
{
	@Override
	public void start(Stage arg0) throws Exception {
		
	}
	public static void main(String[] args) 
	{
		System.out.println("1000");
	}
}

/*
class ConnectThread  extends Thread{ // 접속 스레드
//	Button button;
	Hello hello;
	ConnectThread(Hello hello) {
		this.hello=hello;
	}
	
	public void run() {
		System.out.println(2);
		Platform.runLater(
				()->{
					hello.btn1.setText("호랑이"); // 여기서는 btn1를 제어하지 못한다. 생성자에서 받아오면 된다.
				});
	}
}

//ex69-2)
public class Hello extends Application
{
	Button btn1=new Button("텍스트1"); // 헬로우 멤버 변수로
	Button btn2=new Button("텍스트2");
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15);
		// -------------------------------------------------------------------------

		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // 버튼을 누르면 스레드가 발동되었다가 죽었다가 스레드가 발동되었다가 죽은거
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(
								()->{
									btn2.setText("호랑이");
								});
					}
				}.start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				new ConnectThread(btn1).start(); // 객체 발동 시, start 함수 사용하겠다.
				new ConnectThread(Hello.this).start(); // 나를 던진다.
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) 
	{
		launch();
		System.out.println("Exit");
	}
}
*/

/*
//ex69)
public class Hello extends Application
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15);
		// -------------------------------------------------------------------------

		Button btn1=new Button("텍스트1");
		Button btn2=new Button("텍스트2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // 버튼을 누르면 스레드가 발동되었다가 죽었다가 스레드가 발동되었다가 죽은거
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(
								()->{
									btn2.setText("호랑이");
								});
					}
				}.start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // 버튼을 누르면 스레드가 발동되었다가 죽었다가 스레드가 발동되었다가 죽은거
					@Override
					public void run() {
						System.out.println(2);
//						btn2.setText("호랑이");
					}
				}.start();
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) 
	{
		launch();
		System.out.println("Exit");
	}
}
*/

/*
//ex68)
public class Hello extends Application
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15);
		// -------------------------------------------------------------------------

		Button btn1=new Button("텍스트1");
		Button btn2=new Button("텍스트2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("호랑이");// 글자 바꿔주는 함수
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				btn1.setVisible(false); // 숨길까 말까 보여줄까 말까한 함수
				btn1.setDisable(true);
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) 
	{
		launch();
		System.out.println("Exit");
	}
}
*/

/*
//ex67) - 어제꺼 이어서
public class Hello extends Application
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // 버튼 간의 간격 설정
		// ----------------------------
		
		// 방법1
//		Button btn1=new Button("테스트1");
//		root.getChildren().add(btn1);
//		
//		Button btn2=new Button("테스트2");
//		root.getChildren().add(btn2);
		
		// 방법2
//		Button btn1=new Button("호랑이");
//		Button btn2=new Button("사자");
//		root.getChildren().addAll(btn1, btn2); // 한번에 연결시키는 것

		Button btn1=new Button("호랑이");
//		Button btn2=new Button("사자");
		
		// 예제1
		// 마우스로 버튼 클릭 시, 클릭 이벤트 발생, 액션 발생, 메시지 발생 했다고 말함.
		btn1.setOnAction(new EventHandler<ActionEvent>() { // 이벤트가 걸렸을떄, 이벤트를 처리하는 함수
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
			}
		});
		
//		btn2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("사자");
//			}
//		});
		
		// 텍스트를 적을 수 있는 영역
		TextArea textarea = new TextArea();
		
		// 텍스트를 적을 수 있는 필드가 만들어짐
		TextField textfield = new TextField();
		textfield.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("코끼리");
				String s = textfield.getText(); // 작성한 텍스트를 가져올 수 있는 함수
				textarea.appendText(s+"\n"); // 기존 데이터 + 새로운 데이터를 추가하는 개념의 함수
				textfield.setText(" "); // 엔터 후, 필드 안을 비우기 위해
			}
		});
		root.getChildren().addAll(btn1, textarea, textfield); // 한번에 연결시키는 것
		
		// ----------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) 
	{
		launch();
		System.out.println("Exit");
	}
}
*/

/*********************************************************** 21.9.2(목) *************************************************************/
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

/*********************************************************** 21.9.1(수) *************************************************************/
/*
//ex54-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(44);
		mm.add(77);
		for (int i = 0; i < 10; i++) {
			mm.add(i*2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		System.out.println(mm);
		
//		int size=mm.size();
//		for (int i = 0; i < size; i++) {
//			int num=mm.get((size-i-1));
//			if (num % 2==0) mm.remove((size-i-1));
//		}
//		System.out.println(mm);
		
		
		// 방법 1 : 따로 증가한다.
		for (int i = 0; i < mm.size();) { // 전형적인 방법 - 요즘은 잘 안쓴다.
			int num=mm.get(i);
			if(num%2==0) {
				mm.remove(i);
			}else {
				i++;
			}
		}
		System.out.println(mm);
		
		
		// 방법 2 : Iterator 이용
		// Iterator<Integer> it = mm.iterator() : 첫번째 데이터를 가리키는 지팡이 it
		// hasNext() : 지팡이가 가리키고 있는 곳에 데이터가 있는지 true, false를 반환
		mm.remove(0);
		for (Iterator<Integer> It = mm.iterator(); It.hasNext();) { 
			Integer num=It.next(); // 데이터 가지고 옴
			if (num%2==0) {
				It.remove();
				System.out.println(It);
			}
		}
		
		System.out.println(mm);
		
		
		// 방법 3 : removeIf 이용 - 실제 코드에서는 적극적으로 이용
		// 조건에 맞춰 제거
		// removeIf 세부 코드 > Predicate 클래스
		mm.removeIf(new Predicate<Integer>() { // 익명
			@Override
			public boolean test(Integer t) {
				return t%2==0; // 제거 했으면 좋겠는 거를 조건문에 넣어라
			}
		});
		System.out.println(mm);
		
		// 방법 4 : Lamda 함수 사용 
		mm.removeIf(num->num%2==0);
		System.out.println(mm);
	}
}
*/

/*
//ex54)
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			int num=mm.get(i);
//			System.out.println(num); // 항상 개발할때 출력해서 확인하는 습관을 가지는 것이 좋음
			if (num==100) {
				System.out.println(i+"번째 찾았다.");
				break;
			}
			
			if(i==mm.size()-1) {
				System.out.println("못찾음");
			}
		}
		
		for (int i = 0; i < mm.size(); i++) {
			int num=mm.get(i);
			if (num==55) {
				mm.remove(i);
				System.out.println("55 삭제함");
				break;
			}
		}
		System.out.println(mm);
	}
}
*/

/*
//ex53)
public class Hello 
{
	public static void main(String[] args) 
	{
		// CRUD (Create, Read, Update, Delete)
		
		// 컨테이너에 자료형을 넣어주면, 해당 자료형만 사용함
		// <>에는 무조건 class만 들어감 - primitive 는 들어가지 않음
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		// C(Create) 단계 /////////////////////////////////////////////////////
		mm.add(10);
		System.out.println(mm.size()); // 관리하고 있는 데이터 개수
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		// R(Read)단계 /////////////////////////////////////////////////////
		// 1.
		System.out.println(mm);
		
		// 2. -- 이렇게 쓰는 것이 활용도가 높음
		int size=mm.size(); // 이렇게 갑을 얻어와서 변수를 사용해야지 비용을 절감할 수 있다.
		for (int i = 0; i < size; i++) { // mm.size() 함수 호출함으로 비용이 들고 있다.-- 최적화에서는 큰일나는 코드
			int data=mm.get(i); // class냐 primitive냐! int(primitive)말고 integer(class)넣어도된다.
			System.out.print(data+" "); // 데이터 출력시 항상 ln없는 출력문을 넣어주는게 좋다.
		}System.out.println(); // 그리고 나서 엔터 출력해주기
		
		// 3. - (x, item, data, value)의 용어로 많이 씀
		for (Integer x : mm) {
			System.out.print(x+" ");
		}System.out.println();
		
		// U(Update) /////////////////////////////////////////////////////
		mm.set(5, 999);
		System.out.println(mm);
		
		// D(Delete) /////////////////////////////////////////////////////
		mm.remove(5); // 해당 인덱스 제거
		System.out.println(mm);
	}
}
*/

/*
//ex52)
public class Hello
{
	static String hexaToBinary(int n) {
		String s=Integer.toBinaryString(n);
		
		while(s.length()<32) s="0"+s;
		
		StringBuffer s1=new StringBuffer(s);
		for (int i = 0; i < 7; i++)
			s1.insert((7-i)*4," ");

		return s1.toString(); // String으로 바꿔서 반환
	}
	
	public static void main(String[] args) 
	{
		int a=0x3b12cd5a;
		int b=0x0000ff00; // 필터링 할떄 사용하는 '마스크'라고 함
		int c=0x0ff00000;
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(a&b));
		System.out.println(hexaToBinary((a&b) >> 8)); // 먼저 연산이 일어나는 순위는 괄호로 표기하는 것이 암묵적인 약속이다.
		System.out.println((a&b) >> 8);
		System.out.println(hexaToBinary((a&c) >> 20));
		System.out.println((a&c) >> 20);
		System.out.println();
		
		int aa=0x0000cd5a;
		int b1=0x0000f800;
		int b2=0x000007e0;
		int b3=0x0000001f;
		System.out.println(hexaToBinary(aa));
		System.out.println("============================");
		System.out.println(hexaToBinary(b1));
		System.out.println(hexaToBinary((aa & b1)>>11));
		System.out.println((aa & b1)>>11);
		System.out.println("----------------------------");
		System.out.println(hexaToBinary(b2));
		System.out.println(hexaToBinary((aa & b2)>>5));
		System.out.println((aa & b2)>>5);
		System.out.println("----------------------------");
		System.out.println(hexaToBinary(b3));
		System.out.println(hexaToBinary(aa & b3));
		System.out.println(aa & b3);
		
		System.out.println("\n============================");
		int d=0x77000000;
		System.out.println(hexaToBinary(aa));
		System.out.println(hexaToBinary(aa|d));
		int c1=25, c2=42, c3=26;
		System.out.println("----------------------------");
		System.out.println(Integer.toHexString( (c1<<11) | (c2 << 5) | c3 ));
		
		System.out.println("\n============================");
		
		char c5 = 0x00dc; // 1101 1100
		char mask = 0x80; // 1000 0000
		String[] elec=new String[] {"에어컨", "선풍기", "냉장고", "세탁기", "TV", "에어프라이기", "노트북", "컴퓨터"};
		for (int i = 0; i < 8; i++, mask>>=1) {
			System.out.println((c5 & mask)==mask? elec[i]+" : ON": elec[i]+" : OFF");
		}
	}
}
*/

/*********************************************************** 21.8.30(월) *************************************************************/
/*
//ex51)
public class Hello 
{
//	static void hexaToBinary(int n) {
//		String s=Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
//		
//		while(s.length()<32) {
//			s="0"+s;
//		}
//		System.out.println(s);
//		
//		StringBuffer s1=new StringBuffer(s);
//		for (int i = 0; i < 7; i++) {
//			System.out.println((7-i)*4);
//			s1.insert((7-i)*4," ");
//		}
//		System.out.println(s1);
//	}
	
	static String hexaToBinary(int n) {
		String s=Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
		
		while(s.length()<32) {
			s="0"+s;
		}
//		System.out.println(s);
		
		StringBuffer s1=new StringBuffer(s);
		for (int i = 0; i < 7; i++) {
//			System.out.println((7-i)*4);
			s1.insert((7-i)*4," ");
		}
//		System.out.println(s1);
		return s1.toString(); // String으로 바꿔서 반환
	}
	
	public static void main(String[] args) 
	{
//		int a=1234; // 10진수
//		int b=0x1234; // 16진수 표기 (2진수로 표기 : 0001 0010 0011 0100)
//		System.out.println(a);
//		System.out.println(b); // 출력하게 되면, 10진수로 출력
//		System.out.println(Integer.toBinaryString(a)); //2진수로 출력해주는 내장함수
//		System.out.println(Integer.toBinaryString(b));
		
		// 0011 1011 0001 0010 1100 1101 0101 1001
		int a=0x3b12cd59;
		int b=991087961;
		System.out.println(a);
		if(a==b) {
			System.out.println(1);
		}
		
		// 11 1011 0001 0010 1100 1101 0101 1001
		System.out.println(hexaToBinary(a));
		// 0011 1011 0001 0010 1100 1101 0101 1001
		System.out.println(hexaToBinary(b));
	}
}
*/

/*
//ex50)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s="무궁화꽃이피었습니다";
		// 1.
		System.out.println(s.length());
		
		// 2. char charAt(int index)
		System.out.println(s.charAt(3));
		
		// 3.
		System.out.println(s.indexOf("화꽃이")); // 받은 값을 가지고,
		System.out.println(s.indexOf("목꽃이"));
		
		int n=s.indexOf("화꽃이");
		if(n!=-1){
			System.out.println(n+"번쨰에서 find");
		}else {
			System.out.println("not found");
		}
		
		// 4.
		// 주의 : 스프킹리은 데이터 수정 불가
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
//		s="대한민국";
//		System.out.println(s);
		
		// 5.slicing
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		
		// 6.
		String s2="   App   le   ";
		System.out.print(s2.trim()); // trim 공백 제거 (ex. 아이디, 패스워드)
		System.out.println("호랑이");
		
		// 7.
		String s3="APple";
		System.out.println(s3.toUpperCase()); // 대문자 만들어주기
		System.out.println(s3.toLowerCase()); // 소문자 만들어주기
		
		// 8. 데이터를 받았을떄
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4=new String(data, 0, data.length); // 배열, 위치, 길이
		System.out.println(s4);
		// 데이터를 전송할때
		String s5="Banana";
		byte[] data1=s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
		
	}
}
*/

/*
class Tiger{
	void m1(int a, int b) {
		if (a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
	}
	
	void m2(int a, int b) {
		try {
			if (a>b) {
				System.out.println(1);
			}else {
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println(2);
		}
	}
}

//ex49)
public class Hello 
{
	public static void main(String[] args) 
	{
//		try {
//			int a=10/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally { // Exception이 발생 하든지 안하든지 finally에 들어간다.
//			System.out.println(1);
//		}
		
		Tiger t1 = new Tiger();
		t1.m1(3, 5);
		t1.m2(3, 5);
	}
}
*/

/*
//ex48)
public class Hello 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {Thread.sleep(2000);} catch (Exception e) {} // 코드 단줄 처리 만이 함
		}
		// 2초동안 holding
	}
}
*/

/*
class Tiger{
	void m1() {
		System.out.println(1);
		try {
			throw new Exception(); // 예외가 의도적으로 발생을 했음
		} catch (Exception e) {
			System.out.println("Exception 발생함");
		}
	}
	
	void m2() throws Exception{ // 이 함수를 호출한 사람이 찾아내라-사용자에게 책임을 떠넘김(예외 떠넘기기)
		System.out.println(2);
		throw new Exception(); // 예외가 의도적으로 발생을 했음
		
	}
}

//ex47)
public class Hello 
{
	public static void main(String[] args)
	{
		Tiger t1 = new Tiger();
		t1.m1();
		
		// Unhandled exception
		try {
			t1.m2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
	}
}
*/

/*
//ex46)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try {
//			int a=10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		int[]ar= {1,2,3};
		try {
			ar[3]=10;
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
		
		String s="무궁화꽃이피었습니다";
		System.out.println(s.length());
		s=null; // 객체가 아니다. 
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(4);
	}
}
*/

/*
class Baduk{
	Ai ai;
	Baduk(Ai ai){
		this.ai=ai;
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		ai.play();
	}
	
	void stop() {
		ai.stop();
	}
}

interface Ai{
	void play();
	void stop();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}

	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
	}
}

//ex45-5)
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk1 = new Baduk(new Alphago());
		Baduk baduk2 = new Baduk(new Bephago());
		baduk1.play();
		baduk1.stop();
		baduk1.play();
		baduk1.stop();
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Ai ai) {
		ai.play();
	}
	
	void stop(Ai ai) {
		ai.stop();
	}
}

interface Ai{
	void play();
	void stop();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}

	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
	}
}

//ex45-4) 함수를 호출할떄마다 함수에 인수에 인공지능을 전달해야하는 번거로움이 있다.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
		baduk.stop(new Alphago());
		baduk.stop(new Bephago());
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Ai ai) {
		ai.play();
	}
}

interface Ai{
	void play();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}

//ex45-3)
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/


/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Alphago alphago) {
		alphago.play();
	}
	
	void play(Bephago bephago) {
		bephago.play();
	}
}

class Alphago{ // 구글에서 만듦
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

class Bephago{ // 아마존에서 만듦
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}

//ex45-2) 문제점 : 새로운 인공지능이 생길떄마다 바둑 play의 인수를 달리하여 만들어야함.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//ex45-1) 이 프로그램의 문제점 : 인공지능이 바뀐다면, 어떻게 할 것인가?
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play();
	}
}
*/

/*
interface Animal{
	void m1();
}

class Zoo{
	void sound(Animal t) {
		t.m1();
	}
}

//ex44-2)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		
		Zoo t2 = new Zoo();
		t2.sound(new Animal() {
			@Override
			public void m1() {
				System.out.println(2);
			}
		});
	}
}
*/

/*
interface Animal{
	void m1();
}

class Tiger implements Animal{
	@Override
	public void m1() {
		System.out.println(1);
	}
}

class Zoo{
	void m1(Animal t) {
		t.m1();
	}
}

//ex44-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
		
		Animal t2 = new Tiger(); // upcasting
		t2.m1();
		
		// 익명 클래스
		Animal t3 = new Animal() { // 클래스 제작 없이 사용
			@Override
			public void m1() {
				System.out.println(2);
			}
		};
		t3.m1();
		
		// 익명 객체
		new Animal() {
			@Override
			public void m1() {
				System.out.println(3);
			}
		}.m1();
		
		// 함수 인수로 코드를 전달한다.
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			@Override
			public void m1() {
				System.out.println(4);
			}
		});
		
		t4.m1(t1); // 인수 전달로 upcasting이 가능함
	}
}
*/

/*
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		this(); // 인수 전달이 없는 생성자를 콜한다.
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		this(a+b); // 생성자 호출할떄 사용
		System.out.println(a+" "+b);
	}
}

//ex43-4) this를 이용하여 자기 class 안에서 다른 생성자를 호출할떄 사용한다.
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20);
	}
}
*/

/*
class Tiger{
	void m1() {
		Lion t = new Lion();
		if (t.marry(this)) { // 여기서 "this=호랑이 자신"
			System.out.println("감사합니다.");
		} else {
			System.out.println("ㅠㅠ");
		}
	}
	
	int m2() {
		System.out.println("제가 가지고 있는 재산은 50입니다.");
		return 50;
	}
	
	String m3() {
		return "온순";
	}
}

class Lion{
	boolean marry(Tiger t) {
		if (t.m2()>=80) { // 호랑이 재산을 확인
			return true;			
		}else {
			String s=t.m3();
			switch (s) {
			case "온순":
				return true;
			case "난폭":
				return false;
			}
			return false;
		}
	}
}

//ex43-4)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
	}
}
*/

/*
class Tiger{
	Tiger m1() { //Tiger 타입 메소드에서 return의 3가지 경우
		
//		return new Tiger();
		
//		Tiger t = new Tiger();
//		return t;
		
		System.out.println(1);
		return this;
	}
	
	Tiger m2() {
		System.out.println(2);
		return this;
	}
	
	void m3() {
		System.out.println(3);
	}
}

//ex43-3) - this 용도 : 함수 체이닝
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = t1.m1();
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		
		t2.m2();
		t1.m1().m2().m1().m2().m3(); // Chaining : 한 객체에 다양한 메서드를 줄줄이 이어서 사용할 수 있다.
		
		System.out.println("---------------------------------------");
		t1.m1().m2().m3();
		t1.m1();
		t1.m2();
		System.out.println("호랑이"); // 코드가 난입했다.
		t1.m3();
	}
}
*/

/*
class Tiger{
//	Tiger this;
//	Tiger(Tiger t){
//		this=t;
//	}
	
	int a,b;
	int size;
	Tiger(int a, int b, int size){
		this.a=a; // 필드의 a=멤버의 a, 멤버 a=인수전달a
		this.b=b;
		this.size=size; // 가독성 측면에서는 떨어지는 코드
	}
	
	void show() {
		System.out.println(this.a+" "+this.b); // 멤버의 a,b를 사용함
	}
}

//ex43-2) - this 용도 : 클래스 필드와 메소드 인수 전달 변수의 구분을 위해
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20, 30);
		
		int num=10;
		num=num; // 셀프 대입 : 자기 변수 값을 자기 변수에 대입하는 것 --> 하등에 쓸모없는 코드
		
		t1.show();
	}
}
*/

/*
class Tiger{
	
	// 생략된 것
//	Tiger this;
//	Tiger(Tiger t, int a, int b){
//		this=t;
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode()); // this가 Tiger타입으로 선언되어 있음
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
//	Tiger this; 이거 생략되어 있음
//	void m2(Tiger t) { // 모든 함수는 이 인수가 생략되어 있음
//		this.t; // 모든 함수는 이 코드가 생략되어 있음
//	}
	
}

//ex43-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20); // 10과 20은 a, b에 넘어감
		// 이때 t1은 t로 인수전달해서 넘어감
	
//		t1.m1();
		System.out.println(t1.hashCode()); // 생성자 해쉬코드와 객체 변수의 해쉬 코드가 같다.
		
		Tiger t2 = new Tiger(30, 40); // t2, 30, 40 인수가 전달된다.
		System.out.println(t2.hashCode());
	}
}
*/

/*
final class Animal{ // 상속을 받을 수 없는 클래스로 표기
	final int NUM=10; // 더이상 값을 변경할 수 없다.는 의미 --> 사용할 수 있는 메모리를 상수화시킨다.
	// 영구 불변의 수를 지정하고 싶을떄 사용
	
	final void m1() { // 여기 코드 이후부터는 오버라이딩이 마지막이다.
		
	}
}

class Tiger extends Animal{ // 상속을 받을 수 없는 클래스는 상속받을 수 없다.
//	void m1() { // 부모 클래스에서 m1에 final을 붙였기 때문에 m1을 오버라이딩하여 사용할 수 없다.
//		
//	}
}

//ex42)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal();
//		t1.NUM=20; // 성립이 되지 않는 코드(final을 선언했기 때문에)
		System.out.println(Math.PI); //  Math의 PI는 final 가 적혀져있다.
		String s1=null; // String은 final이 적혀있기에 사용할 수 없다.
	}
}
*/

/*********************************************************** 21.8.27(금) *************************************************************/
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

//ex41)
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

/*********************************************************** 21.8.26(목) *************************************************************/
/*
//ex24)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=100;
		String s1=Integer.toString(a); // 문자열로 변환하고 싶을떄 toString을 사용
		System.out.println(s1+200); // 문자열+문자열 이므로 연산이 일어나지 않음
		String s2=""+a; // Sugar code
		System.out.println(s2+200);
		String s3="456";
		int b=Integer.parseInt(s3); // 숫자로 변환하고 싶을떄 parseInt를 사용
		System.out.println(b+1); // 숫자+숫자 이므로 연산이 일어남
	}
}
 */

/*
class Tiger{ // 클래스 안에 사용된 함수 이름은 특정한 조건만 만족하면, 동일한 이름으로 사용할 수 있다. (특정 조건 1. 인수 개수가 다르면, 2. 타입이 다르면,)
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a, int b) {
		System.out.println(4);
	}
	int getArrayRECT(int w, int h) { // getArrayRECT <-- 낙타 표기법
		return w*h;
	}
	int getArrayRECT(int length) {
		return length*length;
	}
}

//ex23) - 오버로딩
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(1);
		t1.method01(1,2);
		t1.method01("호랑이",1);
		System.out.println(t1.getArrayRECT(3, 2));
		System.out.println(t1.getArrayRECT(3));
	}
}
 */

/*
//ex22)
public class Hello 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) { // continue 나 break를 남발하면, 힘들어짐
			if(i<3) {
				continue; // 여기로 만나면, for문의 증감 i++ 으로 간다.
			}
			System.out.println(i);
			if (i==7) {
				break; // 자기 자신을 감싸고 있는 반복문 중에서 가장 가까운 반복문을 탈출한다.
			}
		}
		System.out.println("호랑이");

		int num=0;
		while(true) {
			num++;
			if (num%2!=0) {
				System.out.println("호랑이"+num);
				continue;
			}
			if (num==10) {
				System.out.println("코끼리"+num);
				break;
			}
		}
	}
}
 */

/*
class Tiger{
	int m1(int a, int b) {
		if (a>b) {
			return 100;
		}else { // else에서 return을 못만날 수 있기 때문에 오류가 생김
			// 해결 방법 1. else에도 return을 적어준다.
			// 해결 방법 2. else 끝나고 나서 return을 적어준다.
			System.out.println("호랑이");
		}
		return 0;
	}

	void m2() {
		System.out.println(1);
		return; // 함수가 실행 중단되었다를 의미
//		System.out.println(2); // Unreachable Code
	}

	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if (i==num) {
				System.out.println("찾았다");
				return; // 찾았으니 더 이상 찾을 이유가 없음. 강제 종료
			}
		}
		System.out.println("검색 데이터 찾지 못함");
	}
}

//ex21)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1(3, 5);
		t1.m3(5);
	}
}
 */

/*
class Tiger{
	String m1() { // 문자열이 리턴되는 객체
		return "독수리";
	}

	Lion m2() {
		Lion t = new Lion();
		return t;
	}

	Lion m3(Lion t) {
		return t;
	}
}

class Lion{
	void show() {
		System.out.println(1000);
	}
}

//ex20) - 이 구조가 복잡하게 보이면 안된다고 하시넹
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		String s1=t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());

		//1)
		Lion t2 = t1.m2();
		t2.show();

		//2)
		Lion t3 = t1.m3(new Lion());
		t3.show();

		//3)
		t1.m3(new Lion()).show();
	}
}
 */

/*
class Tiger{
	// 함수 유형 4가지에서 파생된 유형 설명

	// 함수 유형 1)
	// 주의 void m1(int a, b)는 안된다. - 자기 자신의 타입을 가지고 선언되어야 함
	void m1(int a, int b) { // 인수 개수를 여러개 할 수 있다.
		System.out.println(a+" "+b);
		System.out.println(a*b+a);
	}

	// 함수 유형 2)
	void m2(int a, char b, boolean c, float d, String e) { // 인수의 타입을 다양하게 사용할 수 있다. 또한, 객체도 인수로 전달 가능하다.
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}

	// 함수 유형 3)
	void m3(Lion a) { // 사용자가 생성한 클래스를 받아 사용가능하다.
		System.out.println(a.hashCode());
		a.sound(); // 전달받은 클래스의 객체를 사용할 수 있다.
	}
}

class Lion{
	void sound(){
		System.out.println("어흥");
	}
}

//ex19)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s1="호랑이"; // String : 자바에서 만들어준 클래스
		System.out.println(s1);
		System.out.println(s1.length());

		Tiger t1 = new Tiger(); // 객체 생성
		t1.m1(3, 4);
		t1.m2(10, '한', false, 3.14f, "호랑이");

		Lion t2 = new Lion();
		System.out.println(t2.hashCode()); // 고유 민증 번호 확인
		t1.m3(t2); // 인수의 타입과 같은 타입을 전달해야한다.
		t1.m3(new Lion()); // Lion a=new Lion() 이렇게 인수 전달이 완료된것이다.
	}
}
 */

/*
class Tiger{
	// "메쏘드 = 함수 = function" 은 다 같은말

	// 함수유형 1) 인수 전달이 없다.
	void merry() { // 강아지 한마리 분양 받음(함수 만듦) - 강아지 이름이 'merry'
		System.out.println("멍!");
	} // 함수 : 자주 사용하는 코드를 저장한 후, 불러서 사용한다.

	// 함수 유형 2) 필요에 따라 인수를 전달한다.
	// int num = 3
	void happy(int num) { // happy 강아지 한마리 더 분양 받음 - happy라고 부를때 3번 짖도록
		for (int i = 0; i < num; i++) {
			System.out.println("왕!");
		}
	}

	// 함수 유형 3) 값을 돌려주는 return
	// void 는 return 할 것이 없다. 정수를 돌려줄꺼면 int를 적는다.
	int turtle() {
		System.out.println("거북이 콜");
		return 15; // 돌려준다고 약속했으면, 반드시 무언가를 돌려주기 위해서 return 이 항상 필요
	}

	// 함수 유형 4) 인수 전달하며 값을 돌려줌
	int fish(int num) {
		int n=num*3;
		return n;
	}
}

//ex18)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.merry(); // 함수를 콜한다. 함수를 부른다. 의 행위를 했음.

		for (int i = 0; i < 10; i++) { // 강아지 10번 부르기
			t.merry();
		}

		System.out.println("---------------------------"); // 이전 결과랑 헷가리지 않게, 하이픈을 사용해서 분리해주면 좋다.
		Tiger t2 = new Tiger();
		t2.happy(3);

		int num=t.turtle(); // 변수로 받아서 사용하거나
		System.out.println(num);
		System.out.println(t.turtle()); // 바로 출력하는 방법이 있음

		int ct=t.fish(7);
		System.out.println(ct);
		System.out.println(t.fish(7));
		// 함수 구성 4가지
		// 리턴 값   인수 전달
		//   X        X
		//   X        O
		//   O        X
		//   O        O
	}
}
 */

/*
//ex17)
class Tiger{ //첫자리가 대문자로 암묵적인 약속을 했음
	// 필드 : 변수
	int a; // <---"멤버, 변수, 필드" 다 같은 용어임
	int b=20;
	int c, d=30;

	// 생성자

	// 메쏘드

}

public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");

		Tiger t1=new Tiger(); // 설계도를 이용해 실질적으로 만들어놓은 비행기 이름 : t1 (객체의 이름)
		Tiger t2=new Tiger(); // "객체를 생성시켰다." 라고 일컫음

		t1.a=100; //안에 들어있는 멤버를 사용한다.
		t1.c=t1.a+30;
		System.out.println(t1.a+" "+t1.b+" "+t1.c+" "+t1.d);
		System.out.println(t2.c);

		System.out.println(t1.hashCode()); // 고유한 식별 번호(시리얼 번호) ==> "민증번호"라고 생각
		System.out.println(t2.hashCode()); // 절대 t1과 중복될 수 없다.

		Tiger t3;
		t3=t2; // 대입 연산자는 쌍방의 타입이 같으면, 성립한다.
		System.out.println(t3.hashCode()); // t3의 민증번호가 t2가 같음. "두 변수를 참조한다." "메모리를 공유한다." 라고 말함. 메모리 공유가 일어났다.
		// 곰돌이와 홍길동이 같은 사람이라고 가정하자.
		t3.a=999; // 곰돌이가 999를 가지면,
		System.out.println(t2.a); // 홍길동도 999를 가진다. 왜냐면 홍길동이 곰돌이이기 때문에 (서로 메모리를 공유한다.)

	}
}
 */

/*
//ex16)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=10, b;
		b=a++; // 순서 : 대입 -> 증가
		System.out.println(a+" "+b);

		int c=10, d=0;
		d=++c; // 순서 : 증가 -> 대입
		System.out.println(d+" "+c);

		int a1=10, a2=10;
		System.out.println(a1++); // 출력 이후 1증가되므로
		System.out.println(++a2);
		System.out.println(a1); // 여기서는 1증가된 값으로 출력
		System.out.println(a2);
	}
}
 */

/*
//ex15)
public class Hello 
{
	public static void main(String[] args) 
	{
		//책 보고 하고 계심
		int a=10; // int : 타입, a : 변수, = : 대입연산자, 10 : 정수 리터럴
		int b=20;
		short c=30;
		// 원칙을 어긴 예시
//		b=c;
//		c=a;

		// 강제 타입 변환 : type casting
		b=(int)c; // 강제로 타입을 지시함 : type casting
		c=(short)a;

		int num=10;
		num=num+3;
		num+=3; // num=num+3와 동일(실행 속도도 동일, 컴파일 속도가 빠름(기계어로 변역하는 속도가 빠름)) ==> 복합 대입 연산자

		int a1=0, a2=0;
		a1=a2+3; // 복합 대입 연산자와 아무런 관련이 없음

		// 아래의 경우를 주의해야함
		int t= +1; // 단항 연산자, 구태역 연산자로 양수값을 가리킴
		int u= -1; // 이런 경우 구태역 연산자를 사용함 (의도적인 자리 맞춤을 위해 양수도 구태역 연산자를 사용함)
		int k=10;
		k+=3; // 복합 연산
		System.out.println(k);
		k=+3; // 대입 연산
		System.out.println(k);

		int d=0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d=d+1; // 실행 속도가 느림
		System.out.println(d);
		d+=1;
		System.out.println(d);
	}
}
 */

/*
//ex14)
public class Hello 
{
	public static void main(String[] args) 
	{
		//1)
		int n=129;
		while(true) { // 우박수(Collatz) 출력 프로그램 : 출력 결과가 우박처럼 왔다갔다 거려서
			System.out.println(n);

//			if (n%2==0) { // 짝수 일때,
//				n=n/2;
//			}else { // 홀수 일때,
//				n=n*3+1;
//			}

			n = (n%2 == 0) ? n/2 : n*3+1; // 위에 if else 문을 삼항 연산으로 사용할 수 있음

			if(n==1) {
				System.out.println(n);
				System.out.println("탈출하기 직전");
				break;
			}
		}

		//2)
		int n2=1234;
		int sum=0;
		while(true) {
			int r=n2%10;// 나머지 약자로 r 을 많이 씀
			n2=n2/10;
			System.out.println(n2+" "+r);

			sum=sum+r;

			if(n2==0) {
				System.out.println("탈출하기 직전");
				break;
			}
		}
		System.out.println(sum);
	}
}
 */

/*
//ex13)
public class Hello 
{
	public static void main(String[] args) 
	{
		// for : 프로그래머가 반복횟수를 알고 사용하는 것
		// while : 프로그래머가 반복횟수를 모르고 사용하는 것
		int num=0;
//		while(true) { // 무한 루프 코드
//			num++;
//			System.out.println(num+" "); // 출력 이후 줄 바꿈 있음
//		}// System.out.print(); 출력 이후 줄 바꿈 없음

		int n=0;
		while(n<10) { // 실제 코드에서는 반복회수를 알고 있기 때문에, 이렇게 사용하지 않는다.
			System.out.println(n);
			n++;
		}
		System.out.println("tiger");

		int a=0;
		while(true) { // 무조건 반복한다.
			System.out.println(a);
			if(a==5) {
				System.out.println("탈출하기 직전");
				break; // 무조건 반복문을 탈출함
			}
			a++;
		}
	}
}
 */

/*
//ex12)
public class Hello 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i = 1; i <= 10; i++) { // 10번 반복
			sum=sum+i;
			System.out.println(sum); // 로그를 
		}

		// 구구단 출력하기
		int n=7;
		for (int i = 0; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
 */

/*
//ex11)
public class Hello 
{
	public static void main(String[] args) 
	{
		// for문
		System.out.println(1000);
		int num=10;
		num=num+3;
		System.out.println(num);
		num=num+1;
		System.out.println(num);

		// 후위 증가
		num++; // num=num+1과 같음
		System.out.println(num);
		num--; // num=num-1과 같음
		System.out.println(num);

		// 전위 증가
		++num;
		System.out.println(num); // 여기서 따로 실행해준게 없어서 전위나 후위나 결과는 같음

		// for(초기; 조건; 증감)
		for (int i = 0; i < 3; i++) { // 여기서 3은 반복 횟수이다.
			System.out.println("tiger"+i);
		}

//		// 주의해야하는 코드
//		// 실무에서 int i=0 또는 int i=1 뺴고는 사용하지 않음
//		for (int i = 5; i < 4; i++) {
//
//		}
//		// 실무에서 조건식 i>4로 부등호가 바뀌지 않음 
//		for (int i = 0; i > 4; i++) {
//
//		}
//		// i=i+3과 같이 증감이 1증가하는 코드가 아니라면, 잘못된 코드
//		for (int i = 0; i < 3; i=i+3) {
//
//		}
//		//모든 제어는 for문 안에서 사용해야함
//
//		//for문을 사용하는 3가지 형식
//		//(1)
//		for (int i = 0; i < 5; i++) {
//
//		}
//		for (int i = 1; i <= 5; i++) { // i에서 돌고 5보나 작거나 같으면, 반복횟수 5번
//
//		}
//		int n=5;
//		for (int i = -n; i <= n; i++) { // 음수, 양수의 좌표값 사용할 때, 사용된다.
//			// 반복횟수 : 5*2+1
//		}
	}
}
 */

/*
//ex10)
public class Hello 
{
	public static void main(String[] args) 
	{
		// switch문
		// 1. case 뒤에 변수가 올 수 없다.
		// 2. switch 안에는 변수가 올 수 있다.
		// 3. default break는 필요 여부에 따라 생략할 수 있다.
		// 4. 의도적인 경우, break를 생략할 수 있다.
		// 5. case분기문에서 실행되는 문장이 한 문장 이상일때는 일반적으로 블록 처리를 해버린다.

		int n=10;
		switch (10) {
		case 10:
			System.out.println(1);
			//break;
		case 20:{ // switch문장의 블록 처리의 표준은 다음과 같다.
			System.out.println(2);
			System.out.println(100);
		}break;
		case 30:
			System.out.println(3);
			break;
		default:
			System.out.println(4);
			break;
		}

		//프로그램 속도가 평준화될 수 없음
		int num=83;
		int q=num/10;
		if(q==9) {
			System.out.println("A");
		}else if(q==8){
			System.out.println("B");
		}else if(q==7){
			System.out.println("C");
		}else if(q==6){
			System.out.println("D");
		}else{
			System.out.println("F");
		}

		// 분기되는 곳으로 바로 점프하기 때문에, 실행 속도가 안정화
		// 조건이 3가지 이상일 때, switch문 사용 
		switch (q) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
 */

/*
//ex9)
public class Hello 
{
	// 제어문(if, for, switch, while, (do-while은 제외))
	public static void main(String[] args) 
	{	
		//if문

		//1)
		System.out.println(1);
		if(true) { // if(조건-참/거짓) 
			System.out.println(2);
			System.out.println(4);
		}; // ; 생략가능
		System.out.println(3);

		if(false) // unreachable code: 도달할 수 없는 코드로 노란색 줄이 생김
		{ 
			System.out.println(0);
		}


		//2)
		if(true) {
			System.out.println(5);
		}else {
			System.out.println(6);
		}


		//3)
		int a=10, b=5;
		int c;
		// if로 들어가나 else로 들어가나 받는 변수가 같다면, 삼항 연산을 쓰는게 좋음
		if (a>b) {
			c=7;
		}else {
			c=8;
		}
		System.out.println(c);
		c=a>b?7:8; // 실행상 속도와는 차이가 없음, 단 코드줄이 짧아짐 --> 슈가 코드
		System.out.println(c);

		if(a>b) {
			System.out.println("tiger");
		}else {
			System.out.println("elephant");
		}
		System.out.println(a>b?"tiger":"elephant");


		//4)
		int num=83;
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80){
			System.out.println("B");
		}else if(num>=70){
			System.out.println("C");
		}else if(num>=60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
}
 */

/*********************************************************** 21.8.25(수) *************************************************************/
/*
//ex8)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 변수를 가지고 오칙연산을 사용할 수 있다. - 변수를 사용하면, 일일히 숫자를 변경하지 않아도 된다.
		int a=17, b=3; // b의 값이 0이 들어가지 않는다는 전제하에 (나누기 때문에)
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);

		// 연산 우선순위 : 산술>비교>논리 (외우자!)
		System.out.println(a>b*7); // 산술연산과 비교연산이 같이 일어나고 있음
		System.out.println(a>b*7 || a-10>b); // 산술연산>비교연산>논리연산이 일어남
	}
}
 */

/*
//ex7)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 변수 사용 방법

		//1)
		int a; // "컴퓨터야 4byte 메모리 주세요. 그 이름을 a라고 할께"
		a=10; // 
		System.out.println(a);

		//2)
		int b, c, d; // 변수를 일괄적으로 한 줄에 사용할 수 있음
		b=1;
		c=2;
		d=3;
		System.out.println(b);
		System.out.println(b+c); // 더해져버림
		System.out.println(b+""+c); // 붙어서 출력됨
		System.out.println(b+" "+c); // 띄워서 출력됨
		System.out.println(b+" "+c+" "+d); // 띄워서 출력됨

		//3)
		int e=10; // 초기값 설정
		int f=20, g=30; // 변수 두개를 선언하면ㅅ, 초기값 설정
		int h,i=40,j; // 초기화 안된것도 할 수 있음, 대신 밑에서 초기화 해야함 (i=40, h=j)
		h=50;
		j=60;
		System.out.println(e+" "+j+" "+h);

		//4)
		int a10; // 변수 이름은 숫자랑 같이 사용할 수 있음. 대신 숫자가 앞에오면 안됨
		a10=10;
		System.out.println(a10);
		a10=20; // 재대입 : 과거값은 지움, 최근값을 가진다.
		System.out.println(a10);

		//5)
		int aa=88, bb=99;
		int temp; // temp 임시라는 뜻의 변수로 많이 사용
		System.out.println(aa+" "+bb);
		// 교환 프로그램 or swap program (단 이 3줄만으로!) ~ 자연스럽게 외워주세요
		temp=aa; // temp=88
		aa=bb; // aa=99
		bb=temp; // bb=88
		System.out.println(aa+" "+bb);

		//6) - 5번 예제와 같지만, 한 줄이 줄었다.
		int cc=100, dd=200;
		System.out.println(cc+" "+dd);
		int tt=cc;
		cc=dd;
		dd=tt;
		System.out.println(cc+" "+dd);

	}
}
 */

/*
//ex6)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 메모리를 요구할 수 있는 타입 - 총 8가지


		// (1)정수 메모리 할당하기 (1, 2, 4, 8) byte - (byte, short, int, long)
		byte apple; // 1byte : "컴퓨터야 1바이트 줘, 그 메모리를 apple로 할께"
		apple=100; // = 대입연산 : 메모리에 숫자를 기억시키는 것 (오른쪽껄 왼쪽이 기억함)
		System.out.println(apple); // Apple을 변수라고 하고, 변수명을 지칭함 메모리에 값을 저장할 수 있는 것을 변수라고 함
		System.out.println(Byte.MIN_VALUE); // byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Byte.MAX_VALUE); // byte가 가질 수 있는 최대값을 알려줌

		// short Apple; // 변수명은 동일하게 작명할 수 없음
		short banana; // 2byte
		banana=-32000;
		System.out.println(banana);
		System.out.println(Short.MIN_VALUE); // 2byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Short.MAX_VALUE); // 2byte가 가질 수 있는 최대값을 알려줌

		int orange; // 4byte
		orange=-2147483648;
		System.out.println(orange);
		System.out.println(Integer.MIN_VALUE); // int는 약자이기 때문에, Integer로 적어줘야함. 4byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Integer.MAX_VALUE); // 4byte가 가질 수 있는 최대값을 알려줌

		long melon; // 8byte
		melon=0;
		System.out.println(melon);
		System.out.println(Long.MIN_VALUE); // 8byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Long.MAX_VALUE); // 8byte가 가질 수 있는 최대값을 알려줌



		// (2)실수 메모리 할당하기 (4, 8) byte - (float, double)
		float tiger; // 4byte
		tiger=3.14f; // 반드시 f를 넣어야함
		System.out.println(tiger);
		System.out.println(Float.MIN_VALUE); // 4byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Float.MAX_VALUE); // 4byte가 가질 수 있는 최대값을 알려줌

		double lion; // 8byte
		lion=3.14; // f가 없으므로 double를 가리킴
		System.out.println(lion);
		System.out.println(Double.MIN_VALUE); // 8byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Double.MAX_VALUE); // 8byte가 가질 수 있는 최대값을 알려줌



		// (3)문자 메모리 할당하기 2byte - char
		char cat; // 2byte, char는 유일하게 음수를 사용할 수 없음 > 문자 하나를 기억하기 위해 사용함
		// cat=1234; // 이런식으로 절대 사용하지 않음. 사용할 순 있으나 안함
		cat='한'; // 글자 하나만 들어감
		System.out.println(cat);
		System.out.println((int)Character.MIN_VALUE); // 2byte가 가질 수 있는 최소값을 알려줌
		System.out.println((int)Character.MAX_VALUE); // 2byte가 가질 수 있는 최대값을 알려줌
		// character같은 경우는 값을 보려면, (int)를 붙여줘야 보임.



		// (4)true, false만 담는것
		boolean dog; // 1byte
		dog=true;
		System.out.println(dog);
		//boolean은 MIN_VALUE, MAX_VALUE가 없다. true, false만 담기기 때문에

	}
}
 */

/*
//ex5)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(10); // 숫자
		System.out.println('한'); // 문자 (싱클 커테이션('') 사용)
		System.out.println("호랑이"); // 문자열 (더블 커테이션("") 사용)
		System.out.println("1000"); // 문자열 (더블 커테이션이("") 우선순위기 때문에)


		System.out.println(10+20); // 숫자+숫자 (산술 연산이 일어남)
		System.out.println(10+"호랑이"); // 숫자+문자열 (문자열 연결 - 결과적으로 문자열로 취급)
		System.out.println("호랑이"+10); // 문자열+숫자 (문자열 연결 - 결과적으로 문자열로 취급)
 		System.out.println("호랑이"+"코끼리"); // 문자열+문자열 (문자열 연결 - 결과적으로 문자열)

 		//좌측에서 우측으로 연산이 일어남
		System.out.println(10+"호랑이"+20); //(숫자+문자열)+숫자=문자열+숫자=문자열
		System.out.println(10+20+"호랑이"); //(숫자+숫자)+문자열=숫자+문자열=문자열
		System.out.println("호랑이"+10+20); //(문자열+숫자)+숫자=문자열+숫자=문자열
		System.out.println(10+" "+20); //숫자 두개를 한 라인에 출력하고 싶을때 사용
	}
}
 */

/*
//ex4)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 논리 연산자 (논리 and, 논리 or, 부정 연산자) - 총4가지 

		// 논리 or - 하나라도 참이면 참
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);

		// 논리 and - 전부 참이여야 참
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);

		// 연습
		System.out.println(true && true && false);
		System.out.println(false || false || true);

		System.out.println(false || true && true); // 어떤 식으로는 잘못된 코드
		System.out.println(false || (true && true)); // 괄호를 하면, 해결
		System.out.println(3>2 || false || 6<=3);

		// 부정 연산자 - 그 결과에 대해서 부정한다
		System.out.println(!true);
		System.out.println(!(3>2));

	}
}
 */

/*
//ex3)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 관계 연산 or 비교 연산 (>, >=, <, <=, ==, !=) - 총 6가지
		System.out.println(5>3); // 크냐
		System.out.println(5>=3); // 크거나 같냐
		System.out.println(5<3); // 작냐
		System.out.println(5<=3); // 작거나 같냐
		System.out.println(5==3); // 같냐
		System.out.println(5!=3); // 다르냐
	}
}
 */

/*
//ex2)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 산술연산자 (+, -, *, /, %) - 총 5가지
		System.out.println(20+3);
		System.out.println(20-3);
		System.out.println(20*3);
		System.out.println(20/3); // 몫을 구함
		System.out.println(20%3); // 나머지를 구함

		// 산술연산자 우선순위
		System.out.println(3+2*4); // *,/  >  +,-
		System.out.println((3+2)*4); // 괄호 우선순위가 더 높음

	}
}
 */

/*
// ex1)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("douzone");
	}
}
 */