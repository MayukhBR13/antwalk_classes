<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.error {
    color: red;
    font-style: italic;
}.
</style>
<h1>Add New Employee</h1>
<form:form method="post" action="save"  modelAttribute="empl"> 
	<table>
		<tr>
			<td>Enter ID: </td>
			<td><form:input path="id"/>
			<form:errors path="id" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Enter Name: </td>
			<td><form:input path="name"/>
			<form:errors path="name" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Enter Salary: </td>
			<td><form:input path="salary"/>
			<form:errors path="salary" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Enter Designation: </td>
			<td><form:input path="designation"/>
			<form:errors path="designation" cssClass="error"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Save"/></td>
		</tr>
	</table>
</form:form>