<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Add new cat</title>
	</head>
	<body>
		<a href="list">Return to the list of cats</a><br />
		<form:form method="POST" modelAttribute="catDto">
			<table border="1">
				<tbody>
					<tr>
						<th>Name</th>
						<td><form:input type="text" path="name" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="name" /></c:if></td>
					</tr>
					<tr>
						<th>Birth date</th>
						<td><form:input type="text" path="birthDate" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="birthDate" /></c:if></td>
					</tr>
					<tr>
						<th>Weight</th>
						<td><form:input type="text" path="weight" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="weight" /></c:if></td>
					</tr>
					<tr>
						<th>Owners name</th>
						<td><form:input type="text" path="ownersName" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="ownersName" /></c:if></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Add!" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<br />
		<hr />
	
	</body>
</html>