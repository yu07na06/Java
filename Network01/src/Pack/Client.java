package Pack;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Client extends Application{
	Socket cs; // ������ �Լ����� ����ϵ���
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor �ܰ� ���̾ƿ�
		root.setPrefSize(400, 300); //ui ����, ���� ����
		root.setSpacing(15); //��ư������ ����
		
		//----------------------------------------------
		Button btn1 = new Button("����"); //��ư ��ü ����
		Button btn2 = new Button("������ ����"); //��ư ��ü ����		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
				try {
					cs = new Socket();
//					cs.connect(new InetSocketAddress("115.22.11.155", 5001));
					cs.connect(new InetSocketAddress("localhost", 5001));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			int count=0;
			@Override
			public void handle(ActionEvent arg0) {
				try {
					OutputStream outputstream = cs.getOutputStream();
					String s = "applie"+count++;
					byte[] data = s.getBytes(); // String�� byte�� �ٲ�
					outputstream.write(data);
					System.out.println("������ ����");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Client"); //â ����
		arg0.setScene(scene); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(); //blocking
		System.out.println("Client Exit");
	}
}

/*
public class Client extends Application{
	Socket cs; // ������ �Լ����� ����ϵ���
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor �ܰ� ���̾ƿ�
		root.setPrefSize(400, 300); //ui ����, ���� ����
		root.setSpacing(15); //��ư������ ����
		
		//----------------------------------------------
		Button btn1 = new Button("����"); //��ư ��ü ����
		Button btn2 = new Button("������ ����"); //��ư ��ü ����		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			@Override
			public void handle(ActionEvent arg0) {
				try {
					cs = new Socket();
//					cs.connect(new InetSocketAddress("115.22.11.155", 5001));
					cs.connect(new InetSocketAddress("localhost", 5001));
					
				} catch (Exception e) {
					
				}
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //��ư Ŭ�� �������� �̺�Ʈ
			int count=0;
			@Override
			public void handle(ActionEvent arg0) {
				try {
					OutputStream outputstream = cs.getOutputStream();
					String s = "applie"+count++;
					byte[] data = s.getBytes(); // String�� byte�� �ٲ�
					outputstream.write(data);
					System.out.println("������ ����");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Client"); //â ����
		arg0.setScene(scene); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(); //blocking
		System.out.println("Client Exit");
	}
}
*/

/*
// ���� �Ѱ� �ʿ�(��� ����)
public class Client { // ��� ���� : ����� �ϱ� ���� ����

	public static void main(String[] args) {
		System.out.println("Client Start");
		
		try {
			Socket cs = new Socket(); // ��� ������ Socket
			
			System.out.println("���ڸ� �Է��ϸ� ������ �õ��մϴ�.");
			new Scanner(System.in).nextInt(); // �ǵ����� blocking --> �Է� ������ ���� �ϴ� �ɷ� ����� �;
//			cs.connect(new InetSocketAddress("115.22.11.155", 5001)); // �츮�� ���� PC���� ���ư��Ƿ� IP�� ���� ���� �ʿ� ����
			cs.connect(new InetSocketAddress("localhost", 5001)); // �츮�� ���� PC���� ���ư��Ƿ� IP�� ���� ���� �ʿ� ����
			System.out.println("���ڸ� �Է��ϸ� ������ �����͸� �����մϴ�.");
			new Scanner(System.in).nextInt();
			OutputStream outputstream = cs.getOutputStream();
			String s = "me log";
			byte[] data = s.getBytes(); // String�� byte�� �ٲ�
			outputstream.write(data);
			System.out.println("������ ����");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		new Scanner(System.in).nextInt(); // �ǵ����� blocking --> �Է� ������ ���� �ϴ� �ɷ� ����� �;
		System.out.println("Client End");
	}
}
*/
