<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=3 align="center">
<tr>
<th>Id</th>
<th>Name</th>
</tr>

<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="system" password="Oracle_1" var="ds"></sql:setDataSource>
<sql:query dataSource="${ds}" var="rs"> select * from employee</sql:query>

<c:forEach items="${rs.rows}" var="row">
<tr>

<td><c:out value="${row.empid}"></c:out></td>
<td><c:out value="${row.firstname}"></c:out></td>
<br>

</tr>
</c:forEach>


</table>
</body>
</html>