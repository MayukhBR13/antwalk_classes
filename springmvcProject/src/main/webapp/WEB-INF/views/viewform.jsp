<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	
	<c:forEach var="empl" items="${list}">
		<tr>
			<td>${empl.id}</td>
			<td>${empl.name}</td>
			<td>${empl.salary}</td>
			<td>${empl.designation}</td>
			<td><a hreaf="editempl/${empl.id}">Edit</a></td>
			<td><a hreaf="deleteempl/${empl.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<a href="emplform">Add New Employee</a>