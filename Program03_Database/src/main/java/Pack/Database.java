package Pack;

import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) {
		Connection conn=null; //DB 커넥션 연결 객체
		String USERNAME = "root";//DBMS접속 시 아이디
		String PASSWORD = "1234";//DBMS접속 시 비밀번호
		String URL = "jdbc:mysql://localhost:3306/db01";//DBMS접속할 db명
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("연결 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println("연결 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}