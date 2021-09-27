<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<!-- <h1>호랑이</h1> -->
	<%-- 예제2 --%>
	<%
		int num1=0;
		String s = "호랑이";
		out.println(num1+"<br/>");
		out.println(s+"<br/><br/>");
	%>
	
	<%-- 예제3 --%>
	<%
		int num=100;
		String s2="코끼리";
	%>
	출력1:<%= num%><br/>
	출력2:<%= s2%>
	
	<!-- <br/><br/> -->
	<%-- 예제4 --%>
	<%!
		void f1(javax.servlet.jsp.JspWriter out){
			try{
				out.println("함수콜<br/><br/>");
			}catch(Exception e){}
		}
	
		int f2(){
			return 999;
		}
	%>
	
	<%
		f1(out);
	%>
	
	<%= f2() %>
	
	<%-- 예제5(개발용으로 지우지 말고 사용하자[날짜 뽑아주는 객체]) --%>
	<% java.util.Date date = new java.util.Date(); %>
	<%=date%>
	
	<%-- 예제6 --%>
	<table border="1" width="200">
		<tr>
			<td><%=1 %></td>
			<td><%="호랑이"%></td>
		</tr>
		<tr>
			<td><%=2 %></td>
			<td><%="코끼리"%></td>
		</tr>
		<tr>
			<td><%=3 %></td>
			<td><%="독수리"%></td>
		</tr>
	</table><br/>
	
	<%-- 예제7 --%>
	<%
		String[] name = {"호랑이", "코끼리", "독수리"};
	%>
	
	<table border="1" width="200">
	<% 
		for(int i=0; i<name.length; i++){ 
	%>
		<tr>
			<%
				int temp=i*10;
			%>
			<td><%= i %></td>
			<td><%= name[i] %></td>
		</tr>
	<% 
		} 
	%>
	</table>
	
	<%-- 예제8 --%>
	<%! int func() {return 100;} %>
	<%= 1 %>
	<%= "tiger" %>
	<%= func() %>
	<% int a=10, b=5; %>
	<%= (a>b)?"1":"2" %>
	
	<%-- 예제9 --%>
	<button>호랑이</button>
	<hr/>
	<button>호랑이</button><p/>
	<input type="text" value="호랑이"/><p/>
	<input type="submit" value="전송"/>
	
	<%-- 예제10 --%>
 	<SELECT NAME="color">
		<option value="red" selected>빨강</option>
		<option value="green">초록</option>
		<option value="blue">파랑</option>
	</SELECT>
	
	<%-- 예제11 --%>
	<hr/>
	<h1>구구단을 외우자!</h1>
	<table border="1" width="800">
	<% 
		for(int j=1; j<=9; j++){
			out.println("<tr>");
			for(int i=2; i<=9; i++){
				out.println("<td>"+i+" X "+j+" = "+i*j+"</td>");
			}
		out.println("</tr>");
	}%>
	</table>

	<fieldset>
		<legend>제목</legend>
		<FORM METHOD=POST action="testPage.jsp">
			<INPUT TYPE="text" NAME="name" VALUE="apple">
			<p />
			<INPUT TYPE="submit" VALUE="전송">
			<p />
		</FORM>
	</fieldset>

	<table width="80%" border="1" align="center">
		<tr>
			<td align="center" bgcolor="#ffff00">
				<FORM METHOD=POST action="testPage.jsp">
					<table width="80%" border="1" cellpadding="10" cellspacing="1">
						<tr>
							<td colspan="3">회원가입</td>
						</tr>
						<tr>
							<td>아이디</td>
							<td><input type="text" name="name"></td>
							<td>아이디를 적어주세요</td>
						</tr>
						<tr>
							<td>패스워드</td>
							<td><input type="text" name="pass"></td>
							<td>패스워드를 적어주세요</td>
						</tr>
						<tr>
							<td colspan="3"><input type="submit" value="가입"></td>
						</tr>
					</table>
				</FORM>
			</td>
		</tr>
	</table>
	
	<%
		for(int i=0; i<10; i++){
			out.println("<a href=a.jsp?num="+i+"> ["+i+"] </a>");
		}
	%><br/><br/>
	
	<a href="a.jsp">확인1</a>
	<a href="dog/b.jsp">확인2</a>
	<a href="dog/sub/c.jsp">확인3</a>

</body>

</html>