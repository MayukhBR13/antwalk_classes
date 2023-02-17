<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.error{color:red;}
</style>
</head>
<body>
	<form:form action="submit" modelAttribute="emp">
		Username:<form:input path="name"/>
		<form:errors path="name" cssClass="error"/><br>
		Password:<form:input type="password" path="password"/>
		<form:errors path="password" cssClass="error"/><br>
		Age:<form:input path="age"/>
		<form:errors path="age" cssClass="error"/><br>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>