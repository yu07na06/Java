<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("name")%>
	<%=request.getParameter("age")%>
	
	<%
		Connection conn=null; //DB 커넥션 연결 객체
		String USERNAME = "root";//DBMS접속 시 아이디
		String PASSWORD = "1234";//DBMS접속 시 비밀번호
		String URL = "jdbc:mysql://localhost:3306/A";//DBMS접속할 db명
		PreparedStatement pstmt = null;
		
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
		
		String name=null;
		String sql = "select * from ab;";
		try{
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("여기 지나감");
			
			while (rs.next()) {
				name = rs.getString("FullName");
				int age = rs.getInt("Age");
				System.out.println(name);
				System.out.println(age);
			}
		}catch(Exception e) {
			System.out.println("[ select 메서드 예외발생 ]");
		}    finally {
			try {
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
					return;
				}
			} catch (Exception e2) {
				System.out.println("여기");
			}
		}
		
		try {
			conn.close();
			System.out.println("연결 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("저기");
		}
	%>
</body>
</html>