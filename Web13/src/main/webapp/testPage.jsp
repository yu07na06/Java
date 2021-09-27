<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Pack.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="recv" class="Pack.Person" scope="page" />
	<jsp:setProperty name="recv" property="*"/>
	
	<jsp:getProperty name="recv" property="id"/>
	<jsp:getProperty name="recv" property="pass"/>
	
	<%=recv.getId() %>
	<%=recv.getPass() %>

</body>
</html>