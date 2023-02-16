<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Add New Employee</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Enter ID: </td>
			<td><form:input path="id"/></td>
		</tr>
		<tr>
			<td>Enter Name: </td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>Enter Salary: </td>
			<td><form:input path="salary"/></td>
		</tr>
		<tr>
			<td>Enter Designation: </td>
			<td><form:input path="designation"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Save"/></td>
		</tr>
	</table>
</form:form>