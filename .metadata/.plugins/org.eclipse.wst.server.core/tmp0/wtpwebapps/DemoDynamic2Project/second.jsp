<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int n=100; %>
<%! int sq(int n){return n*n;} %>
<!--  <%
int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
int result=i+j;
out.println("Result is: "+i);
out.println("<br>n is: "+n);
out.println("<br>sq(n) is: "+sq(n));
try{
	int a=7/0;
}catch(Exception e){}
//int b=9/0;
%> 
<%="Expression tag Working" %><br>
<%="value of n is: "+n %><br>
<%="square is: "+sq(25) %><br>
<%= "value of num1: "+request.getParameter("num1") %><br>
<%= new Date()%>-->

</body>
</html>