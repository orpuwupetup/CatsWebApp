<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Cats details</title>
	</head>
	<body>
		<a href="list">Return to the list of cats</a><br />
		<table border="1">
			<tbody>
				<tr>
					<th>Name</th>
					<td>${cat.name}</td>
				</tr>
				<tr>
					<th>Birth date</th>
					<td><fmt:formatDate pattern="yyyy.MM.dd" value="${cat.birthDate}" /></td>
				</tr>
				<tr>
					<th>Weight</th>
					<td>${cat.weight}</td>
				</tr>
				<tr>
					<th>Owners name</th>
					<td>${cat.ownersName}</td>
				</tr>
			</tbody>
		</table>
		<br />
		<hr />
	</body>
</html>