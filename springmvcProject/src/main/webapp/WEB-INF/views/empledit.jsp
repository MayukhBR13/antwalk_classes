<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Update Employee Information</h1>

<form:form method="post" action="editsave">
	<table>
		<tr>
			<td><form:hidden path="id"/></td>
		</tr>
		<tr>
			<td>Enter Updated Name:</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>Enter Updated Salary:</td>
			<td><form:input path="salary"/></td>
		</tr>
		<tr>
			<td>Enter Updated Designation:</td>
			<td><form:input path="designation"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Update"/></td>
		</tr>
	</table>
</form:form>