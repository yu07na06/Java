<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
</head>
<body>
	<%=new Date()%>
	<h2>Hello World</h2>
	<a href="t1">링크1</a>
	<a href="t2">링크2</a>
	<a href="t3">링크3</a>
	<a href="t4?name=코끼리">링크4</a>
	<a href="t5?name=코끼리&age=30">링크5</a>
	<a href="t6?name=독수리&age=30">링크6</a>
	<a href="t7">링크7</a>
	<a href="t8?name=소나무&age=60">링크8</a>
	<a href="t9?name=소나무&age=60">링크9</a>
	<a href="t10?name=소나무&age=60">링크10</a>
	<a href="t11">링크11</a>
	<br />
	
	<FORM METHOD=POST action="t12">
		<INPUT TYPE="text" NAME="name" VALUE="apple"><p />
		<INPUT TYPE="text" NAME="age" VALUE=23><p />
		<INPUT TYPE="submit" VALUE="전송"><p />
	</FORM>
</body>