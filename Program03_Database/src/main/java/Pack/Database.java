package Pack;

import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) {
		Connection conn=null; //DB Ŀ�ؼ� ���� ��ü
		String USERNAME = "root";//DBMS���� �� ���̵�
		String PASSWORD = "1234";//DBMS���� �� ��й�ȣ
		String URL = "jdbc:mysql://localhost:3306/db01";//DBMS������ db��
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("���� �Ϸ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println("���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}