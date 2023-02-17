<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE h1 PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>Employee List</h1>
	<table border="3">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>DESIGNATION</th>
			<th>EDIT</th>
			<th>DELETE</th>	
		</tr>
		<!--  c:out value="${list}"/>-->
		<c:forEach var="empl" items="${list}">
			<tr>
				<td><c:out value="${empl.id}"/></td>
				<td><c:out value="${empl.name}"/></td>
				<td><c:out value="${empl.salary}"/></td>
				<td><c:out value="${empl.designation}"/></td>
				<td><a href="editempl/${empl.id}">Edit</a></td>
				<td><a href="deleteempl/${empl.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="emplform">Add New Employee</a>
</body>
</html>