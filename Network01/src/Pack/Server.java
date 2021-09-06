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

class ClientThread extends Thread{ // 읽는 처리를 하는 스레드
	Socket socket;
	ClientThread(Socket socket){
		this.socket=socket;
	}
	public void run() { // 데이터를 읽는 작업
		try {
			InputStream inputstream = socket.getInputStream(); // 통신 소켓 ss가 우리한테 없다.
			
			while(true) {
				byte[] data = new byte[512]; // 512byte로
				int size = inputstream.read(data);// ---> blocking 된다.----------------------------
				
				String s = new String(data, 0, size);
				System.out.println(s+"데이터 받음"); // 종료하지 않고 계속 받곘다.
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ConnectThread extends Thread{ // 접속만 하는 스레드
	public void run(){
		try {
			//서버 메인 소켓
			ServerSocket mss = new ServerSocket();		
			System.out.println("메인 서버 소켓 생성");
			
			mss.bind(new InetSocketAddress("localhost", 5001));  //바인딩
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));  //바인딩
			System.out.println("바인딩 완료");
			
			while(true) { // 접속한 후, 읽는 스레드 만들고 다시 접속 기다리러 여기서 기다림
				Socket ss = mss.accept(); //블로킹 함수 --> 통신 소켓---------------------------------------
				System.out.println("누군가 접속하였습니다.");
				// 리딩처리를 한다. -- > blocking (리딩 처리를 하는 스레드를 만들어야함)
				new ClientThread(ss).start(); // 통신 소켓 인수로 받음			
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
		VBox root = new VBox(); //vertical Hor 외각 레이아웃
		root.setPrefSize(400, 300); //ui 세로, 가로 길이
		root.setSpacing(15); //버튼사이의 간격
		
		//----------------------------------------------
		Button btn1 = new Button("서버오픈"); //버튼 객체 생성
		Button btn2 = new Button("테스트2"); //버튼 객체 생성
				
		btn1.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			@Override
			public void handle(ActionEvent arg0) {
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Server"); //창 제목
		arg0.setScene(scene); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(); //blocking
		System.out.println("Server Exit");
	}
}

/*
class ClientThread extends Thread{ // 읽는 처리를 하는 스레드
	Socket socket;
	ClientThread(Socket socket){
		this.socket=socket;
	}
	public void run() { // 데이터를 읽는 작업
		try {
			InputStream inputstream = socket.getInputStream(); // 통신 소켓 ss가 우리한테 없다.
			
			while(true) {
				byte[] data = new byte[512]; // 512byte로
				int size = inputstream.read(data);// ---> blocking 된다.----------------------------
				
				String s = new String(data, 0, size);
				System.out.println(s+"데이터 받음"); // 종료하지 않고 계속 받곘다.
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ConnectThread extends Thread{ // 접속만 하는 스레드
	public void run(){
		try {
			//서버 메인 소켓
			ServerSocket mss = new ServerSocket();		
			System.out.println("메인 서버 소켓 생성");
			
			mss.bind(new InetSocketAddress("localhost", 5001));  //바인딩
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001));  //바인딩
			System.out.println("바인딩 완료");
			
			while(true) { // 접속한 후, 읽는 스레드 만들고 다시 접속 기다리러 여기서 기다림
				Socket ss = mss.accept(); //블로킹 함수 --> 통신 소켓---------------------------------------
				System.out.println("누군가 접속하였습니다.");
				// 리딩처리를 한다. -- > blocking (리딩 처리를 하는 스레드를 만들어야함)
				new ClientThread(ss).start(); // 통신 소켓 인수로 받음			
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
		VBox root = new VBox(); //vertical Hor 외각 레이아웃
		root.setPrefSize(400, 300); //ui 세로, 가로 길이
		root.setSpacing(15); //버튼사이의 간격
		
		//----------------------------------------------
		Button btn1 = new Button("서버오픈"); //버튼 객체 생성
		Button btn2 = new Button("테스트2"); //버튼 객체 생성
				
		btn1.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread().start();
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭 했을때의 이벤트
			@Override
			public void handle(ActionEvent arg0) {
			}
		});
		
		
		root.getChildren().addAll(btn1, btn2);		
		//----------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("Server"); //창 제목
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
// 소켓 두개 필요(main, 통신)
public class Server { // main 소켓 : 접속 받아들이는 용도, 통신 소켓 : 통신하기 위한 소켓

	public static void main(String[] args) {
		System.out.println("Server Start");
		
		try {
			// 서버의 메인 소켓 ///////////////////////////////////////////////////////////////////////////
			ServerSocket mss = new ServerSocket(); // mss:main server socket
			System.out.println("메인 서버 소켓 생성");
			
			// localhost : 현재 나의 PC에 있는 주소다.
//			mss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 5001)); // IP주소, port -- port개방함
			mss.bind(new InetSocketAddress("localhost", 5001)); // IP주소, port -- port개방함
			System.out.println("바인딩 완료"); // 서버는 주소를 직접 기록하지 않는다. 서버는 PC 자체가 바뀔 수 있기 때문에 스스로 주소를 알도록 해야한다.
			
			// 이제 누가 접속할때까지 기다리기만 하면 된다.
			// 접속이 일어나면, 통신 소켓이 개설이 된다.
			Socket ss = mss.accept(); // blocking 함수 - 접속할떄까지 죽을떄까지 기다림
			System.out.println("누군가 접속 함");
			InputStream inputstream = ss.getInputStream();
			
			byte[] data = new byte[512]; // 512byte로
			int size = inputstream.read(data);// blocking 함수
			
			String s = new String(data, 0, size);
			System.out.println(s+"데이터 받음");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new Scanner(System.in).nextInt(); // 의도적인 blocking
		System.out.println("Server End");
	}
}
*/
