package Pack;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class ClientThread extends Thread{ // �д� ó���� �ϴ� ������
	Socket socket;
	ClientThread(Socket socket){
		this.socket=socket;
	}
	public void run() { // �����͸� �д� �۾�
		try {
			InputStream inputstream = socket.getInputStream(); // ��� ���� ss�� �츮���� ����.
			
			while(true) {
				byte[] data = new byte[512]; // 512byte��
				int size = inputstream.read(data);// ---> blocking �ȴ�.----------------------------
				
				String s = new String(data, 0, size);
				System.out.println(s+"������ ����"); // �������� �ʰ� ��� �ށٴ�.
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ConnectThread extends Thread{ // ���Ӹ� �ϴ� ������
	public void run(){
		try {
			//���� ���� ����
			ServerSocket mss = new ServerSocket();		
			System.out.println("���� ���� ���� ����");
			
			mss.bind(new InetSocketAddress("localhost", 5001));  //���ε�
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));  //���ε�
			System.out.println("���ε� �Ϸ�");
			
			while(true) { // ������ ��, �д� ������ ����� �ٽ� ���� ��ٸ��� ���⼭ ��ٸ�
				Socket ss = mss.accept(); //���ŷ �Լ� --> ��� ����---------------------------------------
				System.out.println("������ �����Ͽ����ϴ�.");
				// ����ó���� �Ѵ�. -- > blocking (���� ó���� �ϴ� �����带 ��������)
				new ClientThread(ss).start(); // ��� ���� �μ��� ����			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Server extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor �ܰ� ���̾ƿ�
		root.setPrefSize(400, 300); //ui ����, ���� ����
		root.setSpacing(15); //��ư������ ����
		
		//----------------------------------------------
		Button btn1 = new Button("��������"); //��ư ��ü ����
		Button btn2 = new Button("�׽�Ʈ2"); //��ư ��ü ����
				
		btn1.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Server"); //â ����
		arg0.setScene(scene); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(); //blocking
		System.out.println("Server Exit");
	}
}

/*
class ClientThread extends Thread{ // �д� ó���� �ϴ� ������
	Socket socket;
	ClientThread(Socket socket){
		this.socket=socket;
	}
	public void run() { // �����͸� �д� �۾�
		try {
			InputStream inputstream = socket.getInputStream(); // ��� ���� ss�� �츮���� ����.
			
			while(true) {
				byte[] data = new byte[512]; // 512byte��
				int size = inputstream.read(data);// ---> blocking �ȴ�.----------------------------
				
				String s = new String(data, 0, size);
				System.out.println(s+"������ ����"); // �������� �ʰ� ��� �ށٴ�.
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ConnectThread extends Thread{ // ���Ӹ� �ϴ� ������
	public void run(){
		try {
			//���� ���� ����
			ServerSocket mss = new ServerSocket();		
			System.out.println("���� ���� ���� ����");
			
			mss.bind(new InetSocketAddress("localhost", 5001));  //���ε�
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));  //���ε�
			System.out.println("���ε� �Ϸ�");
			
			while(true) { // ������ ��, �д� ������ ����� �ٽ� ���� ��ٸ��� ���⼭ ��ٸ�
				Socket ss = mss.accept(); //���ŷ �Լ� --> ��� ����---------------------------------------
				System.out.println("������ �����Ͽ����ϴ�.");
				// ����ó���� �Ѵ�. -- > blocking (���� ó���� �ϴ� �����带 ��������)
				new ClientThread(ss).start(); // ��� ���� �μ��� ����			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Server extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor �ܰ� ���̾ƿ�
		root.setPrefSize(400, 300); //ui ����, ���� ����
		root.setSpacing(15); //��ư������ ����
		
		//----------------------------------------------
		Button btn1 = new Button("��������"); //��ư ��ü ����
		Button btn2 = new Button("�׽�Ʈ2"); //��ư ��ü ����
				
		btn1.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Server"); //â ����
		arg0.setScene(scene); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(); //blocking
		System.out.println("Server Exit");
	}
}
*/

/*
// ���� �ΰ� �ʿ�(main, ���)
public class Server { // main ���� : ���� �޾Ƶ��̴� �뵵, ��� ���� : ����ϱ� ���� ����

	public static void main(String[] args) {
		System.out.println("Server Start");
		
		try {
			// ������ ���� ���� ///////////////////////////////////////////////////////////////////////////
			ServerSocket mss = new ServerSocket(); // mss:main server socket
			System.out.println("���� ���� ���� ����");
			
			// localhost : ���� ���� PC�� �ִ� �ּҴ�.
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001)); // IP�ּ�, port -- port������
			mss.bind(new InetSocketAddress("localhost", 5001)); // IP�ּ�, port -- port������
			System.out.println("���ε� �Ϸ�"); // ������ �ּҸ� ���� ������� �ʴ´�. ������ PC ��ü�� �ٲ� �� �ֱ� ������ ������ �ּҸ� �˵��� �ؾ��Ѵ�.
			
			// ���� ���� �����Ҷ����� ��ٸ��⸸ �ϸ� �ȴ�.
			// ������ �Ͼ��, ��� ������ ������ �ȴ�.
			Socket ss = mss.accept(); // blocking �Լ� - �����ҋ����� ���������� ��ٸ�
			System.out.println("������ ���� ��");
			InputStream inputstream = ss.getInputStream();
			
			byte[] data = new byte[512]; // 512byte��
			int size = inputstream.read(data);// blocking �Լ�
			
			String s = new String(data, 0, size);
			System.out.println(s+"������ ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new Scanner(System.in).nextInt(); // �ǵ����� blocking
		System.out.println("Server End");
	}
}
*/
