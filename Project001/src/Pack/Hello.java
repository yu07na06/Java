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

/*********************************************************** 21.9.2(��) *************************************************************/
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
class ConnectThread  extends Thread{ // ���� ������
//	Button button;
	Hello hello;
	ConnectThread(Hello hello) {
		this.hello=hello;
	}
	
	public void run() {
		System.out.println(2);
		Platform.runLater(
				()->{
					hello.btn1.setText("ȣ����"); // ���⼭�� btn1�� �������� ���Ѵ�. �����ڿ��� �޾ƿ��� �ȴ�.
				});
	}
}

//ex69-2)
public class Hello extends Application
{
	Button btn1=new Button("�ؽ�Ʈ1"); // ��ο� ��� ������
	Button btn2=new Button("�ؽ�Ʈ2");
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15);
		// -------------------------------------------------------------------------

		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // ��ư�� ������ �����尡 �ߵ��Ǿ��ٰ� �׾��ٰ� �����尡 �ߵ��Ǿ��ٰ� ������
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(
								()->{
									btn2.setText("ȣ����");
								});
					}
				}.start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				new ConnectThread(btn1).start(); // ��ü �ߵ� ��, start �Լ� ����ϰڴ�.
				new ConnectThread(Hello.this).start(); // ���� ������.
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");
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

		Button btn1=new Button("�ؽ�Ʈ1");
		Button btn2=new Button("�ؽ�Ʈ2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // ��ư�� ������ �����尡 �ߵ��Ǿ��ٰ� �׾��ٰ� �����尡 �ߵ��Ǿ��ٰ� ������
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(
								()->{
									btn2.setText("ȣ����");
								});
					}
				}.start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() { // ��ư�� ������ �����尡 �ߵ��Ǿ��ٰ� �׾��ٰ� �����尡 �ߵ��Ǿ��ٰ� ������
					@Override
					public void run() {
						System.out.println(2);
//						btn2.setText("ȣ����");
					}
				}.start();
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");
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

		Button btn1=new Button("�ؽ�Ʈ1");
		Button btn2=new Button("�ؽ�Ʈ2");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("ȣ����");// ���� �ٲ��ִ� �Լ�
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				btn1.setVisible(false); // ����� ���� �����ٱ� ������ �Լ�
				btn1.setDisable(true);
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
		
		// -------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");
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
//ex67) - ������ �̾
public class Hello extends Application
{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(15); // ��ư ���� ���� ����
		// ----------------------------
		
		// ���1
//		Button btn1=new Button("�׽�Ʈ1");
//		root.getChildren().add(btn1);
//		
//		Button btn2=new Button("�׽�Ʈ2");
//		root.getChildren().add(btn2);
		
		// ���2
//		Button btn1=new Button("ȣ����");
//		Button btn2=new Button("����");
//		root.getChildren().addAll(btn1, btn2); // �ѹ��� �����Ű�� ��

		Button btn1=new Button("ȣ����");
//		Button btn2=new Button("����");
		
		// ����1
		// ���콺�� ��ư Ŭ�� ��, Ŭ�� �̺�Ʈ �߻�, �׼� �߻�, �޽��� �߻� �ߴٰ� ����.
		btn1.setOnAction(new EventHandler<ActionEvent>() { // �̺�Ʈ�� �ɷ�����, �̺�Ʈ�� ó���ϴ� �Լ�
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
			}
		});
		
//		btn2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("����");
//			}
//		});
		
		// �ؽ�Ʈ�� ���� �� �ִ� ����
		TextArea textarea = new TextArea();
		
		// �ؽ�Ʈ�� ���� �� �ִ� �ʵ尡 �������
		TextField textfield = new TextField();
		textfield.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("�ڳ���");
				String s = textfield.getText(); // �ۼ��� �ؽ�Ʈ�� ������ �� �ִ� �Լ�
				textarea.appendText(s+"\n"); // ���� ������ + ���ο� �����͸� �߰��ϴ� ������ �Լ�
				textfield.setText(" "); // ���� ��, �ʵ� ���� ���� ����
			}
		});
		root.getChildren().addAll(btn1, textarea, textfield); // �ѹ��� �����Ű�� ��
		
		// ----------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");
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

/*********************************************************** 21.9.2(��) *************************************************************/
/*
//ex67)
public class Hello extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); // UI�� ���� ��ܿ� �ִ� : root
		root.setPrefSize(400, 300); // ������ ����
		//------------------------------------------- 
		
		// �� ������ ��� �ڵ尡 ��� ����.
		Button btn1 = new Button("������1");
		root.getChildren().add(btn1); // root ������ ����� �ؾ���, �ƴϸ� root�� �ƹ��� ������ ���� 
		Button btn2 = new Button("������2");
		root.getChildren().add(btn2); // root ������ ����� �ؾ���, �ƴϸ� root�� �ƹ��� ������ ���� 
		
		//-------------------------------------------
		Scene scene = new Scene(root); // ������� ��� ��Ű�� ���� ��ü ����
		arg0.setTitle("Server"); // ĸ��â�� ���� ����
		arg0.setScene(scene); // �����̺� ��? : arg0, setScene�� ������� ��Ͻ����� 
		arg0.show();
	}
	
	public static void main(String[] args) 
	{
		launch(); // ���⼭ blocking�� �Ǿ����
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
		launch(); // ���⼭ blocking�� �Ǿ����
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
		sc.nextInt(); // ������� �Է¹ް� ������� �ٸ� ������ �Ѱ� �Ʒ��� ����� ���� �ʴ� ���� Ȯ���� �� �ִ�.
		
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
		sc.nextInt(); // ���ŷ �Լ�
		
 		System.out.println("main end");
	}
}
/*

/*
class Tiger extends Thread{
	public void run() { // 2
		System.out.println(2);
		
		// �ݺ���
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ���� "+i);
			try {Thread.sleep(0);} catch (Exception e) {} // ���ŷ �Լ�
			// ��ǻ�� �ϰ� �� �� �ִ� �ð����� ���� �۰� ����� (�ּ����� �ð����� ��)
			// sleep 1�� ���ϴ� ������, ��ǻ�Ͱ� 1������ �ٸ� ���μ����� ���� ������ѳ���(�������Ѱ�...)
		}
		System.out.println("����");
	}
}

//ex63)
public class Hello 
{
	public static void main(String[] args) 
	{
		Thread t = new Tiger();
		// Thread�� start�� �ֱ� ������ �̰��� ������ �� �� �־���. ����, start�� run�� �־��� ������ �ڽ��� ������ �ִ� run�� ȣ��� ���̴�.
		t.start(); // 1
		System.out.println(1);
		// 1�� 2�� ��������� ������, �ü���� ��� ���� �����ؼ� �����ϴ����� �� -- thread�� �����Ǿ���.
		
		// �ݺ���
		for (int i = 0; i < 10; i++) {
			System.out.println("	�ڳ��� "+i);
			try {Thread.sleep(0);} catch (Exception e) {} // ���ŷ �Լ�
			// ��ǻ�� �ϰ� �� �� �ִ� �ð����� ���� �۰� ����� (�ּ����� �ð����� ��)
		}
		// ��ǻ�Ͱ� ������, �������� �� ����
		
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
	
	void run() { // �ڽĿ��� run�� �����Ƿ� upcasting������ �ڽ��� ���� ã�ƺ��Ƿ� A run�� ���� ���� �ȴ�.
		System.out.println("A run");
	}
}

class B extends A{
	void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ����");
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
class A<T>{ // �ܺο��� Ÿ���� �˷����״�, �װɷ� Ÿ���� ����ض�
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

//ex61-2) ���ʸ� ���� - �ڵ��� ���� �پ�� ���� �ƴ�. �������� �ϸ� ex61-1�� ������.
public class Hello 
{
	public static void main(String[] args) 
	{
		A<Integer> a = new A<Integer>();
		a.setData(100);
		System.out.println(a.getData());
		
		A<String> b = new A<String>();
		b.setData("ȣ����");
		System.out.println(b.getData());
		
		LinkedList<Integer> l = new LinkedList<Integer>(); // � Ÿ���� ������ �𸣴� ���ʸ� Ÿ���� ������ �����ϰ� �ִ�.
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

class C{ // Ÿ���� �ٸ��ٴ� ������ Ŭ������ ���� ����
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
		b.setData("ȣ����");
		System.out.println(b.getData());
	}
}
*/

/*
class Ŀ��{
	int ���� = 30;
	int ���() {
		System.out.println("Ŀ�� �ֹ�");
		return ����;
	}
}

class ���� extends Ŀ��{
	int ���� = 20;
	Ŀ�� a;
	����(Ŀ�� a){
		this.a=a;
	}
	int ���() {
		System.out.println("���� �߰�");
		return ���� + a.���();
	}
}

class ���� extends Ŀ��{
	int ���� = 10;
	Ŀ�� a;
	����(Ŀ�� a){
		this.a=a;
	}
	int ���() {
		System.out.println("���� �߰�");
		return ���� + a.���();
	}
}

//ex60-3) ���ڷ��̼� ���� Ȱ��
public class Hello 
{
	public static void main(String[] args) 
	{
		Ŀ�� a = new Ŀ��();
//		System.out.println(a.���());
		a = new ����(a);
		a = new ����(a); // ������ �ϳ� �� �ֹ��� �� �ִ�.
//		System.out.println(a.���());
		a = new ����(a);
		a = new ����(a);
		a = new ����(a); // �̰��� ���ڷ��̼� ������ �ŷ�
		System.out.println(a.���());
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

//ex60-2) ���ڷ��̼� ���� (����ؼ� ��������.-��ü�� ��ü�� ���ΰ� ��ü�� ��ü�� ���δ� �ڵ�)
public class Hello 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a = new B(a); // �� ����� ���� ��� ��Ҵ�.
		System.out.println(a.run());
		
		System.out.println("-------------------------");
		a = new C(a);
		System.out.println(a.run());
	}
}
*/

/*
class AA{} // ���� ó��
class BB extends AA{}
class CC extends AA{}

//ex60-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		AA a1 = new BB(); // a1�� AA Ÿ��
		System.out.println(a1.hashCode());
		a1 = new CC(); // ���� ��ü�� �������, ���ο� ��ü�� ����Ѵ�. 
		System.out.println(a1.hashCode());
		a1 = new BB();
		System.out.println(a1.hashCode());
		
		AA a2=a1; // ���
		a1 = new CC(); // ������ �ڱ� ��ü�� a2�� �����Ŵ
	}
}
*/

/*
//ex59-3)
public class Hello 
{
	public static void main(String[] args)�� 
	{
		try {
//			Reader r = new FileReader("test02.txt", Charset.forName("UTF-8")); // ���ڵ� : UTF-8
			Reader r = new FileReader("test02.txt"); // ���ڵ� : ANSI
			while(true) { // �����͸� �ϳ��� �д� �� �ӵ��鿡�� ���� ����.
				int data = r.read(); // ������ �б� - �Ѱ��� �����͸� �о��
				if (data==-1) { // ������ �� ������, data�� -1�� �޾ƿ�
					break;
				}
				System.out.print((char)data); // �����͸� ������ casting�� �Ͽ� ���ڷ� ��ȯ�� ���
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
class Tiger{ // extends Object �� ���� ������, �ڹٿ��� ���� ��� Ŭ������ �θ�� Object�� �������ҋ� ����
	
}

//ex59-2)
public class Hello 
{
	public static void main(String[] args) 
	{
		try {
			// ���� �ҷ����� ����Ҷ� ��¿ �� ���� try catch�� ����ؾ���
			// Unhandle ������ ������ �ڱⰡ �ذ����� �ʰ�, ����ڰ� �ذ��ض�
			Writer w = new FileWriter("test01.txt"); // upcasting -- ���ڰ�����
			
			w.write("apple"); // ���Ͽ� ��� �����
			w.write("\n");
			w.write("����ȭ\n\n");
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2==0? "O ":"X ");
				}
				w.write("\n");
			}
			
			w.close(); // ���� ����½� ���� ���� �ڿ� �ݵ�� ���� �ݱ⸦ �ۼ��ϱ�
			System.out.println("���� ����� ����"); // �׻� ���� ���� ������ ��Ȳ�� �������� Ȯ���ϵ��� ����
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
		
		// ü�� ���
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
	private static Tiger instance=null; // ��� ����
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

//ex58-1) - GOF�� �̱��� ����
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1=Tiger.getInstance();
		Tiger t2=Tiger.getInstance();
		System.out.println(t1.hashCode()); // ������ ��ü�̴�.
		System.out.println(t2.hashCode()); // ������ ��ü�̴�.
		t1.m1();
		t2.m1();
		
		t1.num=2000;
		System.out.println(t2.num); // ������ ��ü���� ����
	}
}
*/

/*
class Tiger{
	// ��ü�� ������� �ϴ� ��ũ���� ����. �����ڿ���
	private Tiger() {} // �����ڿ� private�� ������, �ܺο��� �ƿ� ��ü�� ������� �ȴ�. �ּ��� ������ ����� �ִ� ��õ���� ����� �����Ѵ�.
	
	// static �Լ��� static ������ ����ؾ� �ϹǷ� ������ static�� ����
	// ��ü�� �ƴϴٶ�� �ǹ̿� ��Ҹ� Ȯ���ҋ� null ���� �ֱ� ���� null�� ����
	static private Tiger t = null; // ��� ������ ��� - �ۿ��� ������� ���ϵ��� private�� �������
	static void m1() { // static�� ó������ class ������ ���ܳ��� �����Ƿ�
//		Tiger t = new Tiger(); // ��Ե� �� ���� ��ü�� �����ؾ� �ϹǷ� �޼ҵ� �ȿ� ��ü ����
		if(t == null) { // main���� ��ü�� �����ϸ�, �ٽô� ��ü�� �� �������� ����
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
		Tiger.m1(); // ��ü�� �� �� �����ߴ�.
		Tiger.m1(); // ��ü �ΰ� ���� ����
		
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
		t.setName("������");
		t.setAge(23);
		System.out.println(t.getName());
		System.out.println(t.getAge());
	}
}
*/

/*
class Tiger{
	private int a; // private : class ���ο����� ����� �� �ִ�. - �����͸� �����Ѵ�.
	// public : ������ ����� �� �ֵ�.
	public int b; // default�� �տ� �����Ǿ� �ִ�. ������ ������ - dafault�� �����ϰ� ���̴°� public�� ���¿����� �־���
	
	/////////////////////////////////////////////////////////////////////////////////////���� ����� �� ��!! get�Լ�, set�Լ���� ����
	private int num; // �ܺο��� ���� �����ϰ� �ʹٸ�, �Լ����� �����ϵ��� �Ѵ�.
	public void setNum(int num) { // ���� ����
		this.num = num;
	}
	public int getNum() { // �б� ����
		return this.num;
	}
	////////////////////////////////////////////////////////////////////////////////////MVC���� ���� ���鶧 �����̴�.	
	
	private void m1() { // �ܺο� ������ ��Ű�� �ʴ� �޼ҵ�
		
	}
}

//ex57)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.b=10;
//		t.a=10; // �̷��� ����� �� ����. a�� private���� ���� ������ �Ǿ��ֱ� ������
		
		t.setNum(100); // class ���� ������ �����Ҷ� ����ϴ� ��ȸ���� ���
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
		// ���� ��� ���
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
		// ex1) �͸� Ŭ������ ����ϱ�
		Test1 t1 = new Test1() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		
		// ex2) ���� ��� 
		Test1 t2=()->{
				System.out.println(2);
		};
		t2.m1();
		
//		// ex3) ���� �μ� ������ ������
//		Test1 t3=()->{ // �������̽����� ����߱� ������ �μ� ������ ��ȣ �ȿ� ���� ���� ����.
//			
//		};
		
		// ex3) ���� �μ� ������ ������ - �������̽��� �Լ��� �ϳ� �ִٴ� ���� �Ͽ� ���ٸ� ����� �� �ִٴ� ��!
		Test2 t3 = (n)->{ // �μ� ������ Ÿ�� ���� ������, interface�� ��õ� ������ ���� �ʿ� ����.
			System.out.println(n);
		};
		t3.m1(100);
		
		// ex4) ������ ������ ����
		Test3 t4 = () ->{
			System.out.println(3);
			return 100;
		};
		System.out.println(t4.m1());
		
		// ex5) ���� �μ� ������ 2�� �̻��϶�
		Test4 t5 = (n, s)->{
			return n+s;
		};
		System.out.println(t5.m1(100, "ȣ����"));
		
		// ex6) ���� ��ȯ �ڵ带 ���ٷ� �ۼ��� ��
		Test5 t6 = () -> 100; // return�� �ִ� �ڵ尡 �����϶�, �������� return�� �����ؼ� ���� ��쵵 �ִ�.
		System.out.println(t6.m1());
	}
}
*/

/*********************************************************** 21.9.1(��) *************************************************************/
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
		
		
		// ��� 1 : ���� �����Ѵ�.
		for (int i = 0; i < mm.size();) { // �������� ��� - ������ �� �Ⱦ���.
			int num=mm.get(i);
			if(num%2==0) {
				mm.remove(i);
			}else {
				i++;
			}
		}
		System.out.println(mm);
		
		
		// ��� 2 : Iterator �̿�
		// Iterator<Integer> it = mm.iterator() : ù��° �����͸� ����Ű�� ������ it
		// hasNext() : �����̰� ����Ű�� �ִ� ���� �����Ͱ� �ִ��� true, false�� ��ȯ
		mm.remove(0);
		for (Iterator<Integer> It = mm.iterator(); It.hasNext();) { 
			Integer num=It.next(); // ������ ������ ��
			if (num%2==0) {
				It.remove();
				System.out.println(It);
			}
		}
		
		System.out.println(mm);
		
		
		// ��� 3 : removeIf �̿� - ���� �ڵ忡���� ���������� �̿�
		// ���ǿ� ���� ����
		// removeIf ���� �ڵ� > Predicate Ŭ����
		mm.removeIf(new Predicate<Integer>() { // �͸�
			@Override
			public boolean test(Integer t) {
				return t%2==0; // ���� ������ ���ڴ� �Ÿ� ���ǹ��� �־��
			}
		});
		System.out.println(mm);
		
		// ��� 4 : Lamda �Լ� ��� 
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
//			System.out.println(num); // �׻� �����Ҷ� ����ؼ� Ȯ���ϴ� ������ ������ ���� ����
			if (num==100) {
				System.out.println(i+"��° ã�Ҵ�.");
				break;
			}
			
			if(i==mm.size()-1) {
				System.out.println("��ã��");
			}
		}
		
		for (int i = 0; i < mm.size(); i++) {
			int num=mm.get(i);
			if (num==55) {
				mm.remove(i);
				System.out.println("55 ������");
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
		
		// �����̳ʿ� �ڷ����� �־��ָ�, �ش� �ڷ����� �����
		// <>���� ������ class�� �� - primitive �� ���� ����
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		// C(Create) �ܰ� /////////////////////////////////////////////////////
		mm.add(10);
		System.out.println(mm.size()); // �����ϰ� �ִ� ������ ����
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		// R(Read)�ܰ� /////////////////////////////////////////////////////
		// 1.
		System.out.println(mm);
		
		// 2. -- �̷��� ���� ���� Ȱ�뵵�� ����
		int size=mm.size(); // �̷��� ���� ���ͼ� ������ ����ؾ��� ����� ������ �� �ִ�.
		for (int i = 0; i < size; i++) { // mm.size() �Լ� ȣ�������� ����� ��� �ִ�.-- ����ȭ������ ū�ϳ��� �ڵ�
			int data=mm.get(i); // class�� primitive��! int(primitive)���� integer(class)�־�ȴ�.
			System.out.print(data+" "); // ������ ��½� �׻� ln���� ��¹��� �־��ִ°� ����.
		}System.out.println(); // �׸��� ���� ���� ������ֱ�
		
		// 3. - (x, item, data, value)�� ���� ���� ��
		for (Integer x : mm) {
			System.out.print(x+" ");
		}System.out.println();
		
		// U(Update) /////////////////////////////////////////////////////
		mm.set(5, 999);
		System.out.println(mm);
		
		// D(Delete) /////////////////////////////////////////////////////
		mm.remove(5); // �ش� �ε��� ����
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

		return s1.toString(); // String���� �ٲ㼭 ��ȯ
	}
	
	public static void main(String[] args) 
	{
		int a=0x3b12cd5a;
		int b=0x0000ff00; // ���͸� �ҋ� ����ϴ� '����ũ'��� ��
		int c=0x0ff00000;
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(a&b));
		System.out.println(hexaToBinary((a&b) >> 8)); // ���� ������ �Ͼ�� ������ ��ȣ�� ǥ���ϴ� ���� �Ϲ����� ����̴�.
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
		String[] elec=new String[] {"������", "��ǳ��", "�����", "��Ź��", "TV", "���������̱�", "��Ʈ��", "��ǻ��"};
		for (int i = 0; i < 8; i++, mask>>=1) {
			System.out.println((c5 & mask)==mask? elec[i]+" : ON": elec[i]+" : OFF");
		}
	}
}
*/

/*********************************************************** 21.8.30(��) *************************************************************/
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
		return s1.toString(); // String���� �ٲ㼭 ��ȯ
	}
	
	public static void main(String[] args) 
	{
//		int a=1234; // 10����
//		int b=0x1234; // 16���� ǥ�� (2������ ǥ�� : 0001 0010 0011 0100)
//		System.out.println(a);
//		System.out.println(b); // ����ϰ� �Ǹ�, 10������ ���
//		System.out.println(Integer.toBinaryString(a)); //2������ ������ִ� �����Լ�
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
		String s="����ȭ�����Ǿ����ϴ�";
		// 1.
		System.out.println(s.length());
		
		// 2. char charAt(int index)
		System.out.println(s.charAt(3));
		
		// 3.
		System.out.println(s.indexOf("ȭ����")); // ���� ���� ������,
		System.out.println(s.indexOf("�����"));
		
		int n=s.indexOf("ȭ����");
		if(n!=-1){
			System.out.println(n+"�������� find");
		}else {
			System.out.println("not found");
		}
		
		// 4.
		// ���� : ����ŷ���� ������ ���� �Ұ�
		System.out.println(s.replace("����", "������"));
		System.out.println(s);
//		s="���ѹα�";
//		System.out.println(s);
		
		// 5.slicing
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		
		// 6.
		String s2="   App   le   ";
		System.out.print(s2.trim()); // trim ���� ���� (ex. ���̵�, �н�����)
		System.out.println("ȣ����");
		
		// 7.
		String s3="APple";
		System.out.println(s3.toUpperCase()); // �빮�� ������ֱ�
		System.out.println(s3.toLowerCase()); // �ҹ��� ������ֱ�
		
		// 8. �����͸� �޾�����
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4=new String(data, 0, data.length); // �迭, ��ġ, ����
		System.out.println(s4);
		// �����͸� �����Ҷ�
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
//		}finally { // Exception�� �߻� �ϵ��� ���ϵ��� finally�� ����.
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
			try {Thread.sleep(2000);} catch (Exception e) {} // �ڵ� ���� ó�� ���� ��
		}
		// 2�ʵ��� holding
	}
}
*/

/*
class Tiger{
	void m1() {
		System.out.println(1);
		try {
			throw new Exception(); // ���ܰ� �ǵ������� �߻��� ����
		} catch (Exception e) {
			System.out.println("Exception �߻���");
		}
	}
	
	void m2() throws Exception{ // �� �Լ��� ȣ���� ����� ã�Ƴ���-����ڿ��� å���� ���ѱ�(���� ���ѱ��)
		System.out.println(2);
		throw new Exception(); // ���ܰ� �ǵ������� �߻��� ����
		
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
		
		String s="����ȭ�����Ǿ����ϴ�";
		System.out.println(s.length());
		s=null; // ��ü�� �ƴϴ�. 
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
		System.out.println("�뱹�� �����մϴ�.");
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

class Alphago implements Ai{ // ���ۿ��� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("���İ� ���� ����� �մϴ�.");
	}
}

class Bephago implements Ai{ // �Ƹ������� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
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
		System.out.println("�뱹�� �����մϴ�.");
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

class Alphago implements Ai{ // ���ۿ��� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("���İ� ���� ����� �մϴ�.");
	}
}

class Bephago implements Ai{ // �Ƹ������� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
	}
}

//ex45-4) �Լ��� ȣ���ҋ����� �Լ��� �μ��� �ΰ������� �����ؾ��ϴ� ���ŷο��� �ִ�.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // �Ϲ������� ��ü�� �ϳ� �̻� ������ �ʴ´ٴ� ���� �Ͽ� �ҹ��ڷ� Ŭ������ �̸��� �����ϰ� ����
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
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	void play(Ai ai) {
		ai.play();
	}
}

interface Ai{
	void play();
}

class Alphago implements Ai{ // ���ۿ��� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

class Bephago implements Ai{ // �Ƹ������� ����
	@Override
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}

//ex45-3)
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // �Ϲ������� ��ü�� �ϳ� �̻� ������ �ʴ´ٴ� ���� �Ͽ� �ҹ��ڷ� Ŭ������ �̸��� �����ϰ� ����
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/


/*
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	void play(Alphago alphago) {
		alphago.play();
	}
	
	void play(Bephago bephago) {
		bephago.play();
	}
}

class Alphago{ // ���ۿ��� ����
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

class Bephago{ // �Ƹ������� ����
	void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}

//ex45-2) ������ : ���ο� �ΰ������� ���拚���� �ٵ� play�� �μ��� �޸��Ͽ� ��������.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // �Ϲ������� ��ü�� �ϳ� �̻� ������ �ʴ´ٴ� ���� �Ͽ� �ҹ��ڷ� Ŭ������ �̸��� �����ϰ� ����
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

//ex45-1) �� ���α׷��� ������ : �ΰ������� �ٲ�ٸ�, ��� �� ���ΰ�?
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // �Ϲ������� ��ü�� �ϳ� �̻� ������ �ʴ´ٴ� ���� �Ͽ� �ҹ��ڷ� Ŭ������ �̸��� �����ϰ� ����
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
		
		// �͸� Ŭ����
		Animal t3 = new Animal() { // Ŭ���� ���� ���� ���
			@Override
			public void m1() {
				System.out.println(2);
			}
		};
		t3.m1();
		
		// �͸� ��ü
		new Animal() {
			@Override
			public void m1() {
				System.out.println(3);
			}
		}.m1();
		
		// �Լ� �μ��� �ڵ带 �����Ѵ�.
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			@Override
			public void m1() {
				System.out.println(4);
			}
		});
		
		t4.m1(t1); // �μ� ���޷� upcasting�� ������
	}
}
*/

/*
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		this(); // �μ� ������ ���� �����ڸ� ���Ѵ�.
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		this(a+b); // ������ ȣ���ҋ� ���
		System.out.println(a+" "+b);
	}
}

//ex43-4) this�� �̿��Ͽ� �ڱ� class �ȿ��� �ٸ� �����ڸ� ȣ���ҋ� ����Ѵ�.
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
		if (t.marry(this)) { // ���⼭ "this=ȣ���� �ڽ�"
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�Ф�");
		}
	}
	
	int m2() {
		System.out.println("���� ������ �ִ� ����� 50�Դϴ�.");
		return 50;
	}
	
	String m3() {
		return "�¼�";
	}
}

class Lion{
	boolean marry(Tiger t) {
		if (t.m2()>=80) { // ȣ���� ����� Ȯ��
			return true;			
		}else {
			String s=t.m3();
			switch (s) {
			case "�¼�":
				return true;
			case "����":
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
	Tiger m1() { //Tiger Ÿ�� �޼ҵ忡�� return�� 3���� ���
		
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

//ex43-3) - this �뵵 : �Լ� ü�̴�
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = t1.m1();
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		
		t2.m2();
		t1.m1().m2().m1().m2().m3(); // Chaining : �� ��ü�� �پ��� �޼��带 ������ �̾ ����� �� �ִ�.
		
		System.out.println("---------------------------------------");
		t1.m1().m2().m3();
		t1.m1();
		t1.m2();
		System.out.println("ȣ����"); // �ڵ尡 �����ߴ�.
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
		this.a=a; // �ʵ��� a=����� a, ��� a=�μ�����a
		this.b=b;
		this.size=size; // ������ ���鿡���� �������� �ڵ�
	}
	
	void show() {
		System.out.println(this.a+" "+this.b); // ����� a,b�� �����
	}
}

//ex43-2) - this �뵵 : Ŭ���� �ʵ�� �޼ҵ� �μ� ���� ������ ������ ����
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20, 30);
		
		int num=10;
		num=num; // ���� ���� : �ڱ� ���� ���� �ڱ� ������ �����ϴ� �� --> �ϵ ������� �ڵ�
		
		t1.show();
	}
}
*/

/*
class Tiger{
	
	// ������ ��
//	Tiger this;
//	Tiger(Tiger t, int a, int b){
//		this=t;
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode()); // this�� TigerŸ������ ����Ǿ� ����
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
//	Tiger this; �̰� �����Ǿ� ����
//	void m2(Tiger t) { // ��� �Լ��� �� �μ��� �����Ǿ� ����
//		this.t; // ��� �Լ��� �� �ڵ尡 �����Ǿ� ����
//	}
	
}

//ex43-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20); // 10�� 20�� a, b�� �Ѿ
		// �̶� t1�� t�� �μ������ؼ� �Ѿ
	
//		t1.m1();
		System.out.println(t1.hashCode()); // ������ �ؽ��ڵ�� ��ü ������ �ؽ� �ڵ尡 ����.
		
		Tiger t2 = new Tiger(30, 40); // t2, 30, 40 �μ��� ���޵ȴ�.
		System.out.println(t2.hashCode());
	}
}
*/

/*
final class Animal{ // ����� ���� �� ���� Ŭ������ ǥ��
	final int NUM=10; // ���̻� ���� ������ �� ����.�� �ǹ� --> ����� �� �ִ� �޸𸮸� ���ȭ��Ų��.
	// ���� �Һ��� ���� �����ϰ� ������ ���
	
	final void m1() { // ���� �ڵ� ���ĺ��ʹ� �������̵��� �������̴�.
		
	}
}

class Tiger extends Animal{ // ����� ���� �� ���� Ŭ������ ��ӹ��� �� ����.
//	void m1() { // �θ� Ŭ�������� m1�� final�� �ٿ��� ������ m1�� �������̵��Ͽ� ����� �� ����.
//		
//	}
}

//ex42)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal();
//		t1.NUM=20; // ������ ���� �ʴ� �ڵ�(final�� �����߱� ������)
		System.out.println(Math.PI); //  Math�� PI�� final �� �������ִ�.
		String s1=null; // String�� final�� �����ֱ⿡ ����� �� ����.
	}
}
*/

/*********************************************************** 21.8.27(��) *************************************************************/
/*
class A{
	void m1(){
		System.out.println(1);
	}
}

interface B{
	void m2(); // �Լ� ����/������Ÿ�� - �ڵ尡 ������ ������
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

@FunctionalInterface // �ݵ�� �Լ� ������ 1���� �־���Ѵ�. ��� ���Ѵ�.
interface E{ // �������̽� �Լ� ������ �־�޶� ������
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
		
//		Thread t2=null; // t2: ��ü�� �ޱ� ���� ������ �� - ��ü �޸𸮸� �Ҵ����� �������� null�� ���� ������ ������
//		String s=null;
//		StringBuffer sf=null;
	}
}
*/

/*
interface �ѱ�����{
	void �Ա�();
	void ���();
	void ��ü();
	void ����();
}

class �������� implements �ѱ�����{
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void �Ա�() {
		// TODO Auto-generated method stub
		System.out.println("�������� 3%�Դϴ�.");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
}

class �츮���� implements �ѱ�����{
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void �Ա�() {
		// TODO Auto-generated method stub
		System.out.println("�������� 4%�Դϴ�.");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
}

//ex40)
public class Hello 
{
	public static void main(String[] args) 
	{
		�������� t1=new ��������();
		�츮���� t2=new �츮����();
		
		t1.�Ա�();
		t2.�Ա�();
		
	}
}
*/

/*
class ������{
	void Į() { // Į �� ����
		System.out.println("Į�� �� ����ϴ�.");
	}
	
	void ����() {}; // ���� �� ������-�ڽ� �ϰ� ������
}

class ���׳�1 extends ������{ // ������ ���и� ��������
	void ����() {
		System.out.println("���� �� ����ϴ�.");
	}
}

//@Override // Annotation(������̼�) - ���α׷��Ӱ� �Ǽ��� �� �ִ� ��Ȳ�� �����ϱ� ���� ����ϰ� �ȴ�.
class ���׳�2 extends ������{ // ������ ���и� ��������
	@Override
	void ����() {
		// TODO Auto-generated method stub
		super.����();
	}
}


//ex39)
public class Hello 
{
	public static void main(String[] args) 
	{
		���׳�1 t1 = new ���׳�1();
		t1.Į();
		t1.����();
		
		���׳�2 t2 = new ���׳�2();
		t2.Į();
		t2.����();
	}
}
*/

/*
// �� Ŭ������ �ڵ尡 �̿ϼ��Ǿ����ϴ�.
// abstract class Animal{ // abstract : �߻�(�̿ϼ�)
//	abstract void m1(); // {} �������� ���� �ڵ带 �̿ϼ� �ڵ�
//}

interface Animal{ // abstract : �߻�(�̿ϼ�)
	abstract void m1(); // {} �������� ���� �ڵ带 �̿ϼ� �ڵ�
	// interface�� abstract�� �ڹٿ��� �ڵ����� �ٿ���
	// abstract�� �Լ��� ���� �� ������, interface�� �Լ��� ����� �ȵǰ� ���̵常 �����ؾ���.
}

// extends - �θ� ����� �߰������� ����Ѵٴ� Ȯ�� ����
// implements - �θ� ������ ���� �ڽ��� �ض��
// ��������� interface�� �ٲ� �� �ִٸ�, �ٲٴ°� �� ����
class Tiger implements Animal{ // �̿ϼ� �ڵ带 ����ϸ�, �θ� �ϼ����� ���ϴ� ���� �ڽ��� �ϼ����ѳ����ϱ� ������ Tiger�� �ݵ�� m1�� �ʿ�
	public void m1() { // �θ� �����޶�� ���̵带 ������ �Լ��� �ݵ�� public�� �տ� ���������(�߿�)
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
//		Animal t2=new Animal(); // �̿ϼ� �ڵ�� ��ü�� ������ �� ����
	}
}
*/

/*
// ������ ���α׷��̴�. - ��ĳ������ ���ٸ�, �������� ���� �� ����. ��� ��ĳ������ �ϴ� �� ��ü�� ������ ���α׷��̶�� �Ѵ�.
class Animal{
	void cry() { // ¢��, ���
		System.out.println("...");
	}
}

class Dog extends Animal{
	void cry() { // ¢��, ���
		System.out.println("�۸�!");
	}

}

class Cat extends Animal{
	void cry() { // ¢��, ���
		System.out.println("�߿�~");
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
		} // ��ĳ������ �̿��ϸ�, ����ġ���� �ʿ䰡 �������� ���� �Ʒ����� Ȯ���� �� �ִ�.
		
		System.out.println("-------------------------");
		Animal[] t3=new Animal[] {new Dog(), new Cat(), new Snake()};// animal Ÿ������ �迭�� �ްڴٴ� ��
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry(); // ��ĳ������ �̿��ϸ�, ����ġ���� ������� �ʰ� �̷������� ����� �� �ִ�.			
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
		System.out.println(rn.nextInt()); // int ���� �ȿ� ���� �����´�.
		for (int i = 0; i < 10; i++) {
//			int num=rn.nextInt(10); // ���� ���� ���� -1 ���� random���� ����
//			System.out.println(num);

			System.out.println(rn.nextInt(10)); // ������ ���ٷ� ó���� ��

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
		int a=10; // 4����Ʈ ��� �Ѱ� �ּ���

		// �ڹ� �迭 ���� ���(3����)
		int[] ar = new int [5]; // ������ ����ϴ� ����
		int[] br = new int [] {1,2,3,4,5};  
		int[] cr = {10,20,30,40,50};

		System.out.println(ar.length); // �迭�� ������ �ִ� ������ �˷��ش�.
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println(); // ����ó��������, �������� �ٹٲ� �ڵ带 ����Ѵ�.

		// i���� ��ſ� x, data, value �� �����. (i�� �ε��� ������ ���ؼ�, �ε����� ��µ� �� ���Ƽ� �׷���)
		for (int x : cr) { // ����ȭ�� for��
			System.out.print(x+" ");
		} System.out.println(); // ���� : �ε��� ��ȣ�� ��

		//cr���� ���, �޸𸮸� 5�� �޶�� ����. �迭�� ��ȿ���� �ε��� ũ��� '�迭�� ����-1' ��
		cr[0]=100;
		cr[4]=200;
//		cr[5]=300; // ��ȿ������ ����� ������ ������ ����.

//		ar[-1]=400;
		int num=3;
		ar[num]=500;
		ar[num*3-5]=600; // num*3=9-5=4 �̹Ƿ� �̰� �۵��غ��� �ȴ�.
		ar[2]=3;
		ar[ar[2]]=999;

		System.out.println(ar[2]+" "+ar[3]);

		ar[ar[3]-998]=888; // ��ȿ���� �ȿ� ���� ������ ���� ����
		for (int x : ar) {
			System.out.print(x+" ");
		} System.out.println();

		System.out.println("----------------------");
		boolean[] dr={true, true, false, true};
		for (boolean x : dr) {
			System.out.print(x+" ");
		} System.out.println();

		System.out.println("----------------------");
		String[] ss=new String[4]; // String Ÿ������ ���� 4���� ���������.
		ss[0]="ȣ����";
		ss[1]="�ź���";
		ss[2]="�ڳ���";
		ss[3]="����";
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]+" ");
		} System.out.println();
		for (String data : ss) {
			System.out.print(data+" ");
		} System.out.println();

		String[] st=new String[] {"�عٶ��", "�ײ�", "ƫ��"};
		String s1="ȣ����"; // ���
		String s2=new String("������"); // ����
		String[] su=new String[] {new String("�ε鷹"), new String("�ڽ��ڽ�"), new String("���")}; // st�� ������ �����ϰ� ����
	}
}
 */

/*
class Animal{
	void cry() { // ¢��, ���
		System.out.println("...");
	}
}

class Dog extends Animal{
	void cry() { // ¢��, ���
		System.out.println("�۸�!");
	}

}

class Cat extends Animal{
	void cry() { // ¢��, ���
		System.out.println("�߿�~");
	}

}

class Snake extends Animal{

}

class Zoo{ // ���� �����Ҹ��� ������������ ����ؼ� �����ε� �Լ��� �־��־���ϴ� ������ �ִ�. ��� Ŭ������ �����ϴ� �ͺ��� ��ĳ������ ����Ѵ�.
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
		// ��ĳ�������� ����
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Snake();

		// �θ�� ���� �ڽ��� �Ĵٺ��� ��� �ִ� �ְ� �ִ��� Ȯ���ϰ�, �ڽ��� ��� ������ �ڽĲ��� ȣ���Ѵ�.
		t1.cry();
		t2.cry();
		t3.cry(); // ���� ���� �ʱ� ������ �θ𲨷� ����� �ȴ�.

		//////////////////////////////////////// ��, �Ʒ� ����� ������ �� ��ĳ������ ���� //////////////////////////////////////////////////

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
} // ȭ�忡 �����ְ�, �ڵ� ���濡�� �����ִ�. : ��������Ģ
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
		Animal t3 = new Tiger(); // �� ĳ����(���ڰ���)
//		Tiger t4 = new Animal(); // �ٿ� ĳ���� / �ڹٿ����� �������� �ʴ� ����

		t3.m1(); // Ÿ���� �θ��̱� ������, ���� ��ü�� �θ𲨸� �� �� ���� - �ڽĲ��� ������. ������ �޸𸮰� �ִ� ��

		// ���ڰ���� ������ �ڽ��� ���� ����. ���� �ڽ��� �Ĵٺ��� ������ �ڽĲ��� ȣ���ϰ� ����, ������ �ڱⲨ ȣ���ϰ� ����
		t3.m3();  // �ڽĿ� �ִ� m3�� �ִ� ���� Ȯ���ϰ�, �ڽĲ��� ȣ���Ѵ�.
	}
}
 */

/*
class Animal{ // �θ�
	Animal(){
		System.out.println("�θ� ������ ��");
	}
	Animal(int n){
		System.out.println(n);
	}
}

class Tiger extends Animal{ // �ڽ�
	Tiger(){
		// ���� ���ο� �ڵ尡 �� �� �����Ǿ��ִ�. --> �ڹٿ��� �ڵ����� super();�� �θ�, ���� ������ �ڵ� �����ȴ�.
//		super(); // �θ��� �����ڸ� �� �Ѵ�.
		System.out.println("�ڽ� ������ ��");
	}
	Tiger(int num){ 
		// �̰͵� super�� ����
		super(num+100); // ��������� ������
		System.out.println(num);
	}
	Tiger(int a, int b){ 
		super(a*b); // ���۴� �ڵ��� �� ó���� �־���Ѵ�.
		System.out.println("����° ������");
	}

}

//ex32)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ���, �ڽ� �����ڰ� ���� ���� �Ǿ���, �� ������ �θ� �����ڰ� ���� �Ǿ���.
		// �ڽ� ��ü�� �����Ǿ������� ����������, �ڽ��� �����ڸ� ���� �� �ϴ� ���� �´�.
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(100);
		Tiger t3 = new Tiger(3,4);
		// ��������δ� �ڽ� �����ڰ� ���� ȣ��� ���̴�. �ڽ� �����ڿ� super�� �־ �θ�� ����
	}
}
 */

/*
// ��� ����
class Animal{ // �θ�
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

class Tiger extends Animal{ // �θ�(Animal) �ڽ�(Tiger) ����
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
	void m4() {
		m3(); // �޼ҵ尡 �޼ҵ带 �θ� �� �ִ�.
		System.out.println(4);
		super.m3(); // �θ� �θ��� �������� ���
	}
}

//ex31)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal(); // ��Ӱ� �ƹ��� ���谡 ���� - Animal�� ������ ��ü�� ������ �� ��
		Tiger t2 = new Tiger(); // �̰� ��Ӱ� ������ ����

		t2.m1(); // �ڱⲨ�� �������� �־, �ڱⲨ�� ���
		t2.m2(); // �ڱ����� m2�� ���, �θ����� m2�� �ִ°� �߰��ϰ� �����
		t2.m3(); // �θ����� m3�� ������, �ڱ� �ڽ����׵� m3�� �ֱ� ������ / �ڱ� �ڽŲ��� ����.

		t2.m4(); // �ڱ� �ڽſ��� �ִ� m3�� �θ��� m3�� ������ ���� ���� ����� �������� ����� �ִ�. (super ���)
	}
}
 */

/*
//ex30 - å p.533
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
		Tiger t=new Tiger(); // �̰� �����ϴ���? ���� �Ѵ�. �ڱ� Ŭ���� ������ ��ü ������ �����ϴ�.
		t.m1(); // ���� ������ ���� �ʴ´�.
//		m1(); // �ȵ� ������ ����.
	}

	void m1() {
		System.out.println(111);
	}
}

//ex29)
public class Hello // �׷��� ���� �̰� Ŭ��������, hello �̸��� Ŭ������ ������̾���
{
	// �Ʒ��� static�� ��������
	// void main - entry point (main �� �Լ� �̸�)
	// �̰� ���� �ҷ����� ��ó���� �˾ƾ���. �̰� �ü������ �θ�
	// static�� ������ �̰� ��ü �����Ƚ�Ű��, ��� ���� - �ü���� �� main�� ����� �� ����. ����� ���� �ü�� ���� ���� ��ü�� �����ϸ� �ȴ�.
	static int num=10; // ���������� ���� ���ڰ� ����

	Hello(){ // �����ڴ� ������ Ŭ���� �̸��� �����ؾ���

	}
	static void m1() { // �Լ��� �����ص� ���� ������ ���� ����
		System.out.println(1);
	}

	public static void main(String[] args) 
	{
		System.out.println(num); // static �Լ� �ȿ����� �ݵ�� static ����� �� �� �ִ�.
		m1(); // �̰� ���� ������, �޼ҵ忡 static�� ����ϸ� �ȴ�.
		Hello h=new Hello();
		h.m1();
		h.m2();
		Hello.m1();
//		Hello.m2(); // ����� �� ����
	}

	void m2() { // main �Ʒ��� �޼ҵ带 ��� ���� ������ �߻����� �ʴ´�.
		System.out.println(2);
	}
}
 */

/*
// static ������ �ִ� ����� ������ �Ǿ������� ���
// static�� �ʵ峪 �Լ��� ���� �� ����.
// static�� ��ü�� ������Ű�� �ʾƵ� ����� �� �ִٰ� �ٽ�
// �ʵ忡 static�� ���״� ���� = ��ü���� ���� ����, ���� ������ ���Ǵ� ����
class Tiger{
	int num1;
	static int num2=100; // static�� ó������ ���� �ʱ�ȭ�ϴ°� ��Ģ�̴�.

	static void m1() {
		System.out.println("static �Լ� ��");
	}
}

//ex28)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		System.out.println(t2.num2); // Ŭ���� ���� �̸����� �����ϸ�, ���α׷� ������ ȥ���� ���� (��Ģ���� ��߳�)
		t2.num2=200;
		System.out.println(t1.num2); // ����ž�� �ٰ��� ���� ������ �ٸ� ��ü ������ �����ؼ� �����ϸ� �� �ٸ� ��ü���� ����� �� ����� ���� ����ϰ� �ȴ�.
		System.out.println(Tiger.num2); // ����ž�� Ŭ���� �̸����� �����ϴ°� ��Ģ
		Tiger.m1();

		//ex - math ǥ�� Ŭ����
		System.out.println(Math.abs(-10)); // ���� �Լ�
		String a;
		a.length();
		// abs�� static���� ������� �� - ó������ ������� ��
	}
}
 */

/*
// �ʵ� ���� > ������ ���� > �޼ҵ� ����
class Car{
	// ���
	int fuel=100; // ����
	String name;

	// ������
	Car(){
		System.out.println("����Ʈ ������ ���");
		name="����";
	} // default ������

	Car(String n, int f){
		name=n;
		fuel=f;
		System.out.println("�μ� ���� ������ ���");
	}

	// �޼ҵ�
	void move() { // �ڵ��� �޸��� ���ᰡ �Һ�Ǵ� �޼ҵ�
		if (fuel<40) {
			System.out.println("�ڵ��� ���ᰡ �����մϴ�. ���� ���� ���� :"+fuel);
			return;
		}
		System.out.println(name+" �ڵ����� �޸���");
		fuel-=30;
	}
	
	boolean moveR() {
		if (fuel<40) {
			System.out.println("�ڵ��� ���ᰡ �����մϴ�. ���� ���� ���� :"+fuel);
			return true;
		}
		System.out.println(name+" �ڵ����� �޸���");
		fuel-=30;
		return false;
	}

	void stop() { // �ڵ��� ���⶧, ���ᰡ �Һ�Ǵ� �޼ҵ�
		System.out.println(name+" �ڵ����� �����");
		fuel-=10;
		if (fuel<40) {
			System.out.println(name+"�ڵ��� ���ᰡ "+fuel+" ��ŭ ���ҽ��ϴ�.");
		}
	}

	void inject() { // ���Ḧ �����Ѵ�. (inject : �����ϴ� (�������))
		fuel+=100;
		System.out.println(name+" ���Ḧ "+100+" ��ŭ �����մϴ�.");
		System.out.println("���� ����� "+fuel+" �Դϴ�.");
	}

	void inject(int f) { // ���Ḧ �����Ѵ�. (inject : �����ϴ� (�������))
		if (fuel+f>300) {
			System.out.println(name+" �ʹ� ���� ������ �Ұ����մϴ�."+"\n"+"���� ������ ���� : "+ (300-fuel));
			System.out.println("���� ������ ���� : "+ (300-fuel));
			return;
		}
		System.out.println(name+" ���Ḧ �����Ѵ�.");
		fuel+=f;
		if (fuel==300) {
			System.out.println(name+" �������� ���� á���ϴ�.");
		}
	}

	void show() { // �ڵ��� ���� Ȯ�� �޼ҵ�
		System.out.println(name+" ���� : "+fuel);
		System.out.println(name+" ���� ���� ���� : "+(300-fuel));
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
		Car car2 = new Car("���������", 200);
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
// ���� �����ڸ� �����, Ŭ�������� �����ڸ� �ȸ������
class Tiger{
	Tiger(){} // ���α׷��ӵ��� ���α׷��Ҷ�, ����Ʈ �����ڸ� ���� �Ⱦ��� �׳� �ϴ� ���� ����. �̷� ������ ������.

	Tiger(int a, int b){

	}
}

//ex26)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); //���� �����ڸ� �����, default �����ڸ� �ȸ������
		Tiger t2 = new Tiger(10, 20);

	}
}
 */

/*
//1) �����ڴ� �Լ��̴�. --> �׷��� ������ �Լ���� �Ѵ�.
//2) �Լ� �̸��� Ŭ���� �̸��� �ݵ�� �����ؾ� �Ѵ�.
//3) ������ �Լ��� ���ϰ��� ���� �� ����. �׷��� void ������ �����Ѵ�.
//4) ������ �Լ��� �����ε��� �����ϴ�.
//5) ������ �Լ��� ��ü�� �����ɶ�, �� �ѹ� ȣ��ȴ�. (���Ƿ� ȣ���� �� ����.)
//6) �����ڸ� ����ϴ� ������ ���, �޼ҵ带 �ʱ�ȭ�ϴ� �������� ���ȴ�.
//7) ������ �Լ��� �ۼ����� ���� �ÿ��� �ڵ����� default �����ڰ� ���������.
class Tiger{
	int age=20; // ����� ù�ڰ� �Ҹ��ڷ� ����
	String name="ȫ�浿";

	// �μ� ������ ���� �����ڸ� "default ������"��� �Ѵ�.
	Tiger(){ // �̰� ������ - ���� ������ ����� �ʱ�ȭ�ϴ� ���� ����
		System.out.println("������ ��");
		age=20;
		name="ȫ�浿";
	} // ��ü�� �����Ǹ鼭, ����� �ʱ�ȭ ����

	Tiger(int a, String n){
		age=a;
		name=n;
	}

	// �̷� ��� �Լ��� ����ϸ�, �۾��� �ξ� ��������
	void showInfo() { // ��Ÿ ǥ������� ����
		System.out.println(age+" "+name);
	}

}

//ex25)
public class Hello 
{
	public static void main(String[] args) 
	{
		// Tiger()�� �ݵ�� new �ڿ����� ȣ���� �ǰ�, ���� ���Ƿ� ������ �� ����.
		Tiger t1 = new Tiger(); // ������ �Լ��� ȣ���� �ȴ�. --> Tiger() �̰��� �����ڸ� ȣ���� ��
		Tiger t2 = new Tiger(); // ��ü�� ������ ������ ȣ���� �ȴ�.
		Tiger t3 = new Tiger(100, "������"); // ������ �����ε����� �μ��� ������ �� �ִ�.
		Tiger t4 = new Tiger(200, "�޹���");

		t1.showInfo();
		t2.showInfo();
		// ����� ó������ �ʱ�ȭ�ؼ� �����ϸ� �ȵǳ���? �´�. ������ ������ �����ε����� ���̰� ����. �Ʒ��� ����!!!
		t3.showInfo();
		t4.showInfo();
	}
}
 */

/*********************************************************** 21.8.26(��) *************************************************************/
/*
//ex24)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=100;
		String s1=Integer.toString(a); // ���ڿ��� ��ȯ�ϰ� ������ toString�� ���
		System.out.println(s1+200); // ���ڿ�+���ڿ� �̹Ƿ� ������ �Ͼ�� ����
		String s2=""+a; // Sugar code
		System.out.println(s2+200);
		String s3="456";
		int b=Integer.parseInt(s3); // ���ڷ� ��ȯ�ϰ� ������ parseInt�� ���
		System.out.println(b+1); // ����+���� �̹Ƿ� ������ �Ͼ
	}
}
 */

/*
class Tiger{ // Ŭ���� �ȿ� ���� �Լ� �̸��� Ư���� ���Ǹ� �����ϸ�, ������ �̸����� ����� �� �ִ�. (Ư�� ���� 1. �μ� ������ �ٸ���, 2. Ÿ���� �ٸ���,)
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
	int getArrayRECT(int w, int h) { // getArrayRECT <-- ��Ÿ ǥ���
		return w*h;
	}
	int getArrayRECT(int length) {
		return length*length;
	}
}

//ex23) - �����ε�
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(1);
		t1.method01(1,2);
		t1.method01("ȣ����",1);
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
		for (int i = 0; i < 10; i++) { // continue �� break�� �����ϸ�, �������
			if(i<3) {
				continue; // ����� ������, for���� ���� i++ ���� ����.
			}
			System.out.println(i);
			if (i==7) {
				break; // �ڱ� �ڽ��� ���ΰ� �ִ� �ݺ��� �߿��� ���� ����� �ݺ����� Ż���Ѵ�.
			}
		}
		System.out.println("ȣ����");

		int num=0;
		while(true) {
			num++;
			if (num%2!=0) {
				System.out.println("ȣ����"+num);
				continue;
			}
			if (num==10) {
				System.out.println("�ڳ���"+num);
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
		}else { // else���� return�� ������ �� �ֱ� ������ ������ ����
			// �ذ� ��� 1. else���� return�� �����ش�.
			// �ذ� ��� 2. else ������ ���� return�� �����ش�.
			System.out.println("ȣ����");
		}
		return 0;
	}

	void m2() {
		System.out.println(1);
		return; // �Լ��� ���� �ߴܵǾ��ٸ� �ǹ�
//		System.out.println(2); // Unreachable Code
	}

	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if (i==num) {
				System.out.println("ã�Ҵ�");
				return; // ã������ �� �̻� ã�� ������ ����. ���� ����
			}
		}
		System.out.println("�˻� ������ ã�� ����");
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
	String m1() { // ���ڿ��� ���ϵǴ� ��ü
		return "������";
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

//ex20) - �� ������ �����ϰ� ���̸� �ȵȴٰ� �Ͻó�
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
	// �Լ� ���� 4�������� �Ļ��� ���� ����

	// �Լ� ���� 1)
	// ���� void m1(int a, b)�� �ȵȴ�. - �ڱ� �ڽ��� Ÿ���� ������ ����Ǿ�� ��
	void m1(int a, int b) { // �μ� ������ ������ �� �� �ִ�.
		System.out.println(a+" "+b);
		System.out.println(a*b+a);
	}

	// �Լ� ���� 2)
	void m2(int a, char b, boolean c, float d, String e) { // �μ��� Ÿ���� �پ��ϰ� ����� �� �ִ�. ����, ��ü�� �μ��� ���� �����ϴ�.
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}

	// �Լ� ���� 3)
	void m3(Lion a) { // ����ڰ� ������ Ŭ������ �޾� ��밡���ϴ�.
		System.out.println(a.hashCode());
		a.sound(); // ���޹��� Ŭ������ ��ü�� ����� �� �ִ�.
	}
}

class Lion{
	void sound(){
		System.out.println("����");
	}
}

//ex19)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s1="ȣ����"; // String : �ڹٿ��� ������� Ŭ����
		System.out.println(s1);
		System.out.println(s1.length());

		Tiger t1 = new Tiger(); // ��ü ����
		t1.m1(3, 4);
		t1.m2(10, '��', false, 3.14f, "ȣ����");

		Lion t2 = new Lion();
		System.out.println(t2.hashCode()); // ���� ���� ��ȣ Ȯ��
		t1.m3(t2); // �μ��� Ÿ�԰� ���� Ÿ���� �����ؾ��Ѵ�.
		t1.m3(new Lion()); // Lion a=new Lion() �̷��� �μ� ������ �Ϸ�Ȱ��̴�.
	}
}
 */

/*
class Tiger{
	// "�޽�� = �Լ� = function" �� �� ������

	// �Լ����� 1) �μ� ������ ����.
	void merry() { // ������ �Ѹ��� �о� ����(�Լ� ����) - ������ �̸��� 'merry'
		System.out.println("��!");
	} // �Լ� : ���� ����ϴ� �ڵ带 ������ ��, �ҷ��� ����Ѵ�.

	// �Լ� ���� 2) �ʿ信 ���� �μ��� �����Ѵ�.
	// int num = 3
	void happy(int num) { // happy ������ �Ѹ��� �� �о� ���� - happy��� �θ��� 3�� ¢����
		for (int i = 0; i < num; i++) {
			System.out.println("��!");
		}
	}

	// �Լ� ���� 3) ���� �����ִ� return
	// void �� return �� ���� ����. ������ �����ٲ��� int�� ���´�.
	int turtle() {
		System.out.println("�ź��� ��");
		return 15; // �����شٰ� ���������, �ݵ�� ���𰡸� �����ֱ� ���ؼ� return �� �׻� �ʿ�
	}

	// �Լ� ���� 4) �μ� �����ϸ� ���� ������
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
		t.merry(); // �Լ��� ���Ѵ�. �Լ��� �θ���. �� ������ ����.

		for (int i = 0; i < 10; i++) { // ������ 10�� �θ���
			t.merry();
		}

		System.out.println("---------------------------"); // ���� ����� �򰡸��� �ʰ�, �������� ����ؼ� �и����ָ� ����.
		Tiger t2 = new Tiger();
		t2.happy(3);

		int num=t.turtle(); // ������ �޾Ƽ� ����ϰų�
		System.out.println(num);
		System.out.println(t.turtle()); // �ٷ� ����ϴ� ����� ����

		int ct=t.fish(7);
		System.out.println(ct);
		System.out.println(t.fish(7));
		// �Լ� ���� 4����
		// ���� ��   �μ� ����
		//   X        X
		//   X        O
		//   O        X
		//   O        O
	}
}
 */

/*
//ex17)
class Tiger{ //ù�ڸ��� �빮�ڷ� �Ϲ����� ����� ����
	// �ʵ� : ����
	int a; // <---"���, ����, �ʵ�" �� ���� �����
	int b=20;
	int c, d=30;

	// ������

	// �޽��

}

public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");

		Tiger t1=new Tiger(); // ���赵�� �̿��� ���������� �������� ����� �̸� : t1 (��ü�� �̸�)
		Tiger t2=new Tiger(); // "��ü�� �������״�." ��� ������

		t1.a=100; //�ȿ� ����ִ� ����� ����Ѵ�.
		t1.c=t1.a+30;
		System.out.println(t1.a+" "+t1.b+" "+t1.c+" "+t1.d);
		System.out.println(t2.c);

		System.out.println(t1.hashCode()); // ������ �ĺ� ��ȣ(�ø��� ��ȣ) ==> "������ȣ"��� ����
		System.out.println(t2.hashCode()); // ���� t1�� �ߺ��� �� ����.

		Tiger t3;
		t3=t2; // ���� �����ڴ� �ֹ��� Ÿ���� ������, �����Ѵ�.
		System.out.println(t3.hashCode()); // t3�� ������ȣ�� t2�� ����. "�� ������ �����Ѵ�." "�޸𸮸� �����Ѵ�." ��� ����. �޸� ������ �Ͼ��.
		// �����̿� ȫ�浿�� ���� ����̶�� ��������.
		t3.a=999; // �����̰� 999�� ������,
		System.out.println(t2.a); // ȫ�浿�� 999�� ������. �ֳĸ� ȫ�浿�� �������̱� ������ (���� �޸𸮸� �����Ѵ�.)

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
		b=a++; // ���� : ���� -> ����
		System.out.println(a+" "+b);

		int c=10, d=0;
		d=++c; // ���� : ���� -> ����
		System.out.println(d+" "+c);

		int a1=10, a2=10;
		System.out.println(a1++); // ��� ���� 1�����ǹǷ�
		System.out.println(++a2);
		System.out.println(a1); // ���⼭�� 1������ ������ ���
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
		//å ���� �ϰ� ���
		int a=10; // int : Ÿ��, a : ����, = : ���Կ�����, 10 : ���� ���ͷ�
		int b=20;
		short c=30;
		// ��Ģ�� ��� ����
//		b=c;
//		c=a;

		// ���� Ÿ�� ��ȯ : type casting
		b=(int)c; // ������ Ÿ���� ������ : type casting
		c=(short)a;

		int num=10;
		num=num+3;
		num+=3; // num=num+3�� ����(���� �ӵ��� ����, ������ �ӵ��� ����(����� �����ϴ� �ӵ��� ����)) ==> ���� ���� ������

		int a1=0, a2=0;
		a1=a2+3; // ���� ���� �����ڿ� �ƹ��� ������ ����

		// �Ʒ��� ��츦 �����ؾ���
		int t= +1; // ���� ������, ���¿� �����ڷ� ������� ����Ŵ
		int u= -1; // �̷� ��� ���¿� �����ڸ� ����� (�ǵ����� �ڸ� ������ ���� ����� ���¿� �����ڸ� �����)
		int k=10;
		k+=3; // ���� ����
		System.out.println(k);
		k=+3; // ���� ����
		System.out.println(k);

		int d=0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d=d+1; // ���� �ӵ��� ����
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
		while(true) { // ��ڼ�(Collatz) ��� ���α׷� : ��� ����� ���ó�� �Դٰ��� �ŷ���
			System.out.println(n);

//			if (n%2==0) { // ¦�� �϶�,
//				n=n/2;
//			}else { // Ȧ�� �϶�,
//				n=n*3+1;
//			}

			n = (n%2 == 0) ? n/2 : n*3+1; // ���� if else ���� ���� �������� ����� �� ����

			if(n==1) {
				System.out.println(n);
				System.out.println("Ż���ϱ� ����");
				break;
			}
		}

		//2)
		int n2=1234;
		int sum=0;
		while(true) {
			int r=n2%10;// ������ ���ڷ� r �� ���� ��
			n2=n2/10;
			System.out.println(n2+" "+r);

			sum=sum+r;

			if(n2==0) {
				System.out.println("Ż���ϱ� ����");
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
		// for : ���α׷��Ӱ� �ݺ�Ƚ���� �˰� ����ϴ� ��
		// while : ���α׷��Ӱ� �ݺ�Ƚ���� �𸣰� ����ϴ� ��
		int num=0;
//		while(true) { // ���� ���� �ڵ�
//			num++;
//			System.out.println(num+" "); // ��� ���� �� �ٲ� ����
//		}// System.out.print(); ��� ���� �� �ٲ� ����

		int n=0;
		while(n<10) { // ���� �ڵ忡���� �ݺ�ȸ���� �˰� �ֱ� ������, �̷��� ������� �ʴ´�.
			System.out.println(n);
			n++;
		}
		System.out.println("tiger");

		int a=0;
		while(true) { // ������ �ݺ��Ѵ�.
			System.out.println(a);
			if(a==5) {
				System.out.println("Ż���ϱ� ����");
				break; // ������ �ݺ����� Ż����
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
		for (int i = 1; i <= 10; i++) { // 10�� �ݺ�
			sum=sum+i;
			System.out.println(sum); // �α׸� 
		}

		// ������ ����ϱ�
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
		// for��
		System.out.println(1000);
		int num=10;
		num=num+3;
		System.out.println(num);
		num=num+1;
		System.out.println(num);

		// ���� ����
		num++; // num=num+1�� ����
		System.out.println(num);
		num--; // num=num-1�� ����
		System.out.println(num);

		// ���� ����
		++num;
		System.out.println(num); // ���⼭ ���� �������ذ� ��� ������ ������ ����� ����

		// for(�ʱ�; ����; ����)
		for (int i = 0; i < 3; i++) { // ���⼭ 3�� �ݺ� Ƚ���̴�.
			System.out.println("tiger"+i);
		}

//		// �����ؾ��ϴ� �ڵ�
//		// �ǹ����� int i=0 �Ǵ� int i=1 ����� ������� ����
//		for (int i = 5; i < 4; i++) {
//
//		}
//		// �ǹ����� ���ǽ� i>4�� �ε�ȣ�� �ٲ��� ���� 
//		for (int i = 0; i > 4; i++) {
//
//		}
//		// i=i+3�� ���� ������ 1�����ϴ� �ڵ尡 �ƴ϶��, �߸��� �ڵ�
//		for (int i = 0; i < 3; i=i+3) {
//
//		}
//		//��� ����� for�� �ȿ��� ����ؾ���
//
//		//for���� ����ϴ� 3���� ����
//		//(1)
//		for (int i = 0; i < 5; i++) {
//
//		}
//		for (int i = 1; i <= 5; i++) { // i���� ���� 5���� �۰ų� ������, �ݺ�Ƚ�� 5��
//
//		}
//		int n=5;
//		for (int i = -n; i <= n; i++) { // ����, ����� ��ǥ�� ����� ��, ���ȴ�.
//			// �ݺ�Ƚ�� : 5*2+1
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
		// switch��
		// 1. case �ڿ� ������ �� �� ����.
		// 2. switch �ȿ��� ������ �� �� �ִ�.
		// 3. default break�� �ʿ� ���ο� ���� ������ �� �ִ�.
		// 4. �ǵ����� ���, break�� ������ �� �ִ�.
		// 5. case�б⹮���� ����Ǵ� ������ �� ���� �̻��϶��� �Ϲ������� ��� ó���� �ع�����.

		int n=10;
		switch (10) {
		case 10:
			System.out.println(1);
			//break;
		case 20:{ // switch������ ��� ó���� ǥ���� ������ ����.
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

		//���α׷� �ӵ��� ����ȭ�� �� ����
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

		// �б�Ǵ� ������ �ٷ� �����ϱ� ������, ���� �ӵ��� ����ȭ
		// ������ 3���� �̻��� ��, switch�� ��� 
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
	// ���(if, for, switch, while, (do-while�� ����))
	public static void main(String[] args) 
	{	
		//if��

		//1)
		System.out.println(1);
		if(true) { // if(����-��/����) 
			System.out.println(2);
			System.out.println(4);
		}; // ; ��������
		System.out.println(3);

		if(false) // unreachable code: ������ �� ���� �ڵ�� ����� ���� ����
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
		// if�� ���� else�� ���� �޴� ������ ���ٸ�, ���� ������ ���°� ����
		if (a>b) {
			c=7;
		}else {
			c=8;
		}
		System.out.println(c);
		c=a>b?7:8; // ����� �ӵ��ʹ� ���̰� ����, �� �ڵ����� ª���� --> ���� �ڵ�
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

/*********************************************************** 21.8.25(��) *************************************************************/
/*
//ex8)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ������ ������ ��Ģ������ ����� �� �ִ�. - ������ ����ϸ�, ������ ���ڸ� �������� �ʾƵ� �ȴ�.
		int a=17, b=3; // b�� ���� 0�� ���� �ʴ´ٴ� �����Ͽ� (������ ������)
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

		// ���� �켱���� : ���>��>�� (�ܿ���!)
		System.out.println(a>b*7); // �������� �񱳿����� ���� �Ͼ�� ����
		System.out.println(a>b*7 || a-10>b); // �������>�񱳿���>�������� �Ͼ
	}
}
 */

/*
//ex7)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ���� ��� ���

		//1)
		int a; // "��ǻ�;� 4byte �޸� �ּ���. �� �̸��� a��� �Ҳ�"
		a=10; // 
		System.out.println(a);

		//2)
		int b, c, d; // ������ �ϰ������� �� �ٿ� ����� �� ����
		b=1;
		c=2;
		d=3;
		System.out.println(b);
		System.out.println(b+c); // ����������
		System.out.println(b+""+c); // �پ ��µ�
		System.out.println(b+" "+c); // ����� ��µ�
		System.out.println(b+" "+c+" "+d); // ����� ��µ�

		//3)
		int e=10; // �ʱⰪ ����
		int f=20, g=30; // ���� �ΰ��� �����ϸ餵, �ʱⰪ ����
		int h,i=40,j; // �ʱ�ȭ �ȵȰ͵� �� �� ����, ��� �ؿ��� �ʱ�ȭ �ؾ��� (i=40, h=j)
		h=50;
		j=60;
		System.out.println(e+" "+j+" "+h);

		//4)
		int a10; // ���� �̸��� ���ڶ� ���� ����� �� ����. ��� ���ڰ� �տ����� �ȵ�
		a10=10;
		System.out.println(a10);
		a10=20; // ����� : ���Ű��� ����, �ֱٰ��� ������.
		System.out.println(a10);

		//5)
		int aa=88, bb=99;
		int temp; // temp �ӽö�� ���� ������ ���� ���
		System.out.println(aa+" "+bb);
		// ��ȯ ���α׷� or swap program (�� �� 3�ٸ�����!) ~ �ڿ������� �ܿ��ּ���
		temp=aa; // temp=88
		aa=bb; // aa=99
		bb=temp; // bb=88
		System.out.println(aa+" "+bb);

		//6) - 5�� ������ ������, �� ���� �پ���.
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
		// �޸𸮸� �䱸�� �� �ִ� Ÿ�� - �� 8����


		// (1)���� �޸� �Ҵ��ϱ� (1, 2, 4, 8) byte - (byte, short, int, long)
		byte apple; // 1byte : "��ǻ�;� 1����Ʈ ��, �� �޸𸮸� apple�� �Ҳ�"
		apple=100; // = ���Կ��� : �޸𸮿� ���ڸ� ����Ű�� �� (�����ʲ� ������ �����)
		System.out.println(apple); // Apple�� ������� �ϰ�, �������� ��Ī�� �޸𸮿� ���� ������ �� �ִ� ���� ������� ��
		System.out.println(Byte.MIN_VALUE); // byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Byte.MAX_VALUE); // byte�� ���� �� �ִ� �ִ밪�� �˷���

		// short Apple; // �������� �����ϰ� �۸��� �� ����
		short banana; // 2byte
		banana=-32000;
		System.out.println(banana);
		System.out.println(Short.MIN_VALUE); // 2byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Short.MAX_VALUE); // 2byte�� ���� �� �ִ� �ִ밪�� �˷���

		int orange; // 4byte
		orange=-2147483648;
		System.out.println(orange);
		System.out.println(Integer.MIN_VALUE); // int�� �����̱� ������, Integer�� ���������. 4byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Integer.MAX_VALUE); // 4byte�� ���� �� �ִ� �ִ밪�� �˷���

		long melon; // 8byte
		melon=0;
		System.out.println(melon);
		System.out.println(Long.MIN_VALUE); // 8byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Long.MAX_VALUE); // 8byte�� ���� �� �ִ� �ִ밪�� �˷���



		// (2)�Ǽ� �޸� �Ҵ��ϱ� (4, 8) byte - (float, double)
		float tiger; // 4byte
		tiger=3.14f; // �ݵ�� f�� �־����
		System.out.println(tiger);
		System.out.println(Float.MIN_VALUE); // 4byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Float.MAX_VALUE); // 4byte�� ���� �� �ִ� �ִ밪�� �˷���

		double lion; // 8byte
		lion=3.14; // f�� �����Ƿ� double�� ����Ŵ
		System.out.println(lion);
		System.out.println(Double.MIN_VALUE); // 8byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println(Double.MAX_VALUE); // 8byte�� ���� �� �ִ� �ִ밪�� �˷���



		// (3)���� �޸� �Ҵ��ϱ� 2byte - char
		char cat; // 2byte, char�� �����ϰ� ������ ����� �� ���� > ���� �ϳ��� ����ϱ� ���� �����
		// cat=1234; // �̷������� ���� ������� ����. ����� �� ������ ����
		cat='��'; // ���� �ϳ��� ��
		System.out.println(cat);
		System.out.println((int)Character.MIN_VALUE); // 2byte�� ���� �� �ִ� �ּҰ��� �˷���
		System.out.println((int)Character.MAX_VALUE); // 2byte�� ���� �� �ִ� �ִ밪�� �˷���
		// character���� ���� ���� ������, (int)�� �ٿ���� ����.



		// (4)true, false�� ��°�
		boolean dog; // 1byte
		dog=true;
		System.out.println(dog);
		//boolean�� MIN_VALUE, MAX_VALUE�� ����. true, false�� ���� ������

	}
}
 */

/*
//ex5)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(10); // ����
		System.out.println('��'); // ���� (��Ŭ Ŀ���̼�('') ���)
		System.out.println("ȣ����"); // ���ڿ� (���� Ŀ���̼�("") ���)
		System.out.println("1000"); // ���ڿ� (���� Ŀ���̼���("") �켱������ ������)


		System.out.println(10+20); // ����+���� (��� ������ �Ͼ)
		System.out.println(10+"ȣ����"); // ����+���ڿ� (���ڿ� ���� - ��������� ���ڿ��� ���)
		System.out.println("ȣ����"+10); // ���ڿ�+���� (���ڿ� ���� - ��������� ���ڿ��� ���)
 		System.out.println("ȣ����"+"�ڳ���"); // ���ڿ�+���ڿ� (���ڿ� ���� - ��������� ���ڿ�)

 		//�������� �������� ������ �Ͼ
		System.out.println(10+"ȣ����"+20); //(����+���ڿ�)+����=���ڿ�+����=���ڿ�
		System.out.println(10+20+"ȣ����"); //(����+����)+���ڿ�=����+���ڿ�=���ڿ�
		System.out.println("ȣ����"+10+20); //(���ڿ�+����)+����=���ڿ�+����=���ڿ�
		System.out.println(10+" "+20); //���� �ΰ��� �� ���ο� ����ϰ� ������ ���
	}
}
 */

/*
//ex4)
public class Hello 
{
	public static void main(String[] args) 
	{
		// �� ������ (�� and, �� or, ���� ������) - ��4���� 

		// �� or - �ϳ��� ���̸� ��
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);

		// �� and - ���� ���̿��� ��
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);

		// ����
		System.out.println(true && true && false);
		System.out.println(false || false || true);

		System.out.println(false || true && true); // � �����δ� �߸��� �ڵ�
		System.out.println(false || (true && true)); // ��ȣ�� �ϸ�, �ذ�
		System.out.println(3>2 || false || 6<=3);

		// ���� ������ - �� ����� ���ؼ� �����Ѵ�
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
		// ���� ���� or �� ���� (>, >=, <, <=, ==, !=) - �� 6����
		System.out.println(5>3); // ũ��
		System.out.println(5>=3); // ũ�ų� ����
		System.out.println(5<3); // �۳�
		System.out.println(5<=3); // �۰ų� ����
		System.out.println(5==3); // ����
		System.out.println(5!=3); // �ٸ���
	}
}
 */

/*
//ex2)
public class Hello 
{
	public static void main(String[] args) 
	{
		// ��������� (+, -, *, /, %) - �� 5����
		System.out.println(20+3);
		System.out.println(20-3);
		System.out.println(20*3);
		System.out.println(20/3); // ���� ����
		System.out.println(20%3); // �������� ����

		// ��������� �켱����
		System.out.println(3+2*4); // *,/  >  +,-
		System.out.println((3+2)*4); // ��ȣ �켱������ �� ����

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