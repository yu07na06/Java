<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
</head>
<body>
	<h1>Hello</h1>
	<FORM METHOD=POST action="t1">
		<INPUT TYPE="text" NAME="fullname" VALUE="yuna"><p />
		<INPUT TYPE="text" NAME="age" VALUE="23"><p />
		<INPUT TYPE="submit" VALUE="전송"><p />
	</FORM>
</body>