<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Pack01.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<h1>사자</h1>
	<h1>${name}</h1>
	<h1>${age}</h1> --%>
	<%-- <%
	String name=(String)request.getAttribute("name");
	int age=(int)request.getAttribute("age");
	%>
	
	<%=name %>
	<%=age %> --%>
	
	<%
	Person name=(Person)request.getAttribute("ppp");
	%>
	<%=name.getName() %>
	
	<h1>${mmm.get(0)}</h1>
</body>
</html>