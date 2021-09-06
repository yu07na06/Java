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
	Socket cs; // 각각의 함수들이 사용하도록
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor 외각 레이아웃
		root.setPrefSize(400, 300); //ui 세로, 가로 길이
		root.setSpacing(15); //버튼사이의 간격
		
		//----------------------------------------------
		Button btn1 = new Button("접속"); //버튼 객체 생성
		Button btn2 = new Button("데이터 보냄"); //버튼 객체 생성		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
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
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			int count=0;
			@Override
			public void handle(ActionEvent arg0) {
				try {
					OutputStream outputstream = cs.getOutputStream();
					String s = "applie"+count++;
					byte[] data = s.getBytes(); // String을 byte로 바꿈
					outputstream.write(data);
					System.out.println("데이터 보냄");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Client"); //창 제목
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
	Socket cs; // 각각의 함수들이 사용하도록
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox(); //vertical Hor 외각 레이아웃
		root.setPrefSize(400, 300); //ui 세로, 가로 길이
		root.setSpacing(15); //버튼사이의 간격
		
		//----------------------------------------------
		Button btn1 = new Button("접속"); //버튼 객체 생성
		Button btn2 = new Button("데이터 보냄"); //버튼 객체 생성		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
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
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			int count=0;
			@Override
			public void handle(ActionEvent arg0) {
				try {
					OutputStream outputstream = cs.getOutputStream();
					String s = "applie"+count++;
					byte[] data = s.getBytes(); // String을 byte로 바꿈
					outputstream.write(data);
					System.out.println("데이터 보냄");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Client"); //창 제목
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
// 소켓 한개 필요(통신 소켓)
public class Client { // 통신 소켓 : 통신을 하기 위한 소켓

	public static void main(String[] args) {
		System.out.println("Client Start");
		
		try {
			Socket cs = new Socket(); // 통신 소켓은 Socket
			
			System.out.println("숫자를 입력하면 접속을 시도합니다.");
			new Scanner(System.in).nextInt(); // 의도적인 blocking --> 입력 받으면 접속 하는 걸로 만들고 싶어서
//			cs.connect(new InetSocketAddress("115.22.11.155", 5001)); // 우리는 동일 PC에서 돌아가므로 IP를 따로 적을 필요 없음
			cs.connect(new InetSocketAddress("localhost", 5001)); // 우리는 동일 PC에서 돌아가므로 IP를 따로 적을 필요 없음
			System.out.println("숫자를 입력하면 서버에 데이터를 전송합니다.");
			new Scanner(System.in).nextInt();
			OutputStream outputstream = cs.getOutputStream();
			String s = "me log";
			byte[] data = s.getBytes(); // String을 byte로 바꿈
			outputstream.write(data);
			System.out.println("데이터 보냄");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		new Scanner(System.in).nextInt(); // 의도적인 blocking --> 입력 받으면 접속 하는 걸로 만들고 싶어서
		System.out.println("Client End");
	}
}
*/
