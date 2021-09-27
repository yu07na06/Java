<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1 -->
	<a href="a.jsp?fullName=tiger">전송1</a>
	
	<!-- 2 인수를 변수로 던지기 -->
	<%
		String s1="lion";
	%>
	<a href="b.jsp?fullName=<%=s1 %>">전송2</a>
	
	<!-- 3 인수 두개 던지기 -->
	<a href="c.jsp?fullName=tiger&age=1000">전송3</a>
	
	<!-- 4 인수 두개 변수로 던지기-->
	<%
		String s2 = "cat";
		int num=999;
	%>
	<a href="d.jsp?fullName=<%=s2 %>&age=<%=num %>">전송4</a>
	
	<!-- 5 링크 -->
	<a href="http://www.daum.net">링크</a>
	
	<!-- 6 폼 -->
	<FORM action="e.jsp">
		<INPUT TYPE="text" NAME="tel" VALUE="호랑이"><p />
		<INPUT TYPE="hidden" NAME="age" VALUE="23"><p />
		<INPUT TYPE="submit" VALUE="다음단계"><p />
	</FORM>
	
	<!-- 7 폼 변수를 연결해서 -->
	<FORM action="f.jsp">
		<INPUT TYPE="text" NAME="tel" VALUE=<%=s2 %>><p />
		<INPUT TYPE="hidden" NAME="age" VALUE=<%=num %>><p />
		<INPUT TYPE="submit" VALUE="다음단계"><p />
	</FORM>
	
	<!-- 8 새로고침 -->
	<a href="index.jsp">새로고침</a>
</body>
</html>