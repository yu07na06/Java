<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Pack.Person"%>
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
	<jsp:useBean id="person" class="Pack.Person" scope="page" />
	<jsp:setProperty name="person" property="*"/>
	
	<jsp:getProperty name="person" property="name"/>
	<jsp:getProperty name="person" property="age"/><br/>
	<%
		System.out.println(person.getName());
	    System.out.println(person.getAge());
		
		String podb = "jdbc:postgresql://localhost:5432/test";
		String url = podb;
		String id = "postgres";
		String pw = "a123";
		PreparedStatement psmt = null; //쓰기용
		Connection con = null; //DB연결용
		ResultSet rs = null; //읽기용
		//String sql = "INSERT INTO test VALUES(?,?)";
		String sql = "INSERT INTO user_info VALUES(?,?)";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
			psmt = con.prepareStatement(sql);
			psmt.setString(1, person.getName());
			psmt.setInt(2, person.getAge());
			int result = psmt.executeUpdate();
			if (result == 1) {
				out.println("<p>정상적으로 입력 되었습니다.</p>");
			} else {
				out.println("<p>정상적으로 입력되지 못했습니다.</p>");
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	%>
</body>
</html>