<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테스트 확인</h1>
	
	<%-- 스크립트릿 사용 --%>
	<%
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		out.println(name+" "+pass);
	%><br/>
	
	<%-- 표현식 사용 --%>
	<%= request.getParameter("name") %><br/>
	<%= request.getParameter("pass") %><br/>
</body>
</html>