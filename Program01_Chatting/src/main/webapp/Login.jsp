<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>������ �Ϸ�Ǿ����ϴ�.</h1>
<div><%= request.getParameter("id") %> ���� ������ �Ϸ�Ǿ����ϴ�</div>

<%
	Connection conn;	
	String USERNAME = "root";//DBMS���� �� ���̵�
	String PASSWORD = "1234";//DBMS���� �� ��й�ȣ
	String URL = "jdbc:mysql://localhost:3306/Project";//DBMS������ db��

		try {
			System.out.println("[ ������ ]");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("[ ����̹� �ε� ���� ]");

			String sql = "insert into table01 values(?)";
			String id = request.getParameter("id");

			PreparedStatement pstmt = null;
			try{
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);

				int result = pstmt.executeUpdate();
				if(result == 1) {
					System.out.println("[ Create �޼��� ���� ���� ]");
				}

			}catch (Exception e) {
				System.out.println("[ Create �޼��� ���� ���� ]");
			} 
			
			
		}
	
		catch (Exception e) {
			System.out.println("[ ����̹� �ε� ���� ]");
		}

%>

</body>
</html>