<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Add new cat</title>
	</head>
	<body>
		<a href="list">Return to the list of cats</a><br />
		<form method="POST">
			<table border="1">
				<tbody>
					<tr>
						<th>Name</th>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr>
						<th>Birth date</th>
						<td><input type="text" name="birthDate" /></td>
					</tr>
					<tr>
						<th>Weight</th>
						<td><input type="text" name="weight" /></td>
					</tr>
					<tr>
						<th>Owners name</th>
						<td><input type="text" name="ownersName" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Add!" /></td>
					</tr>
				</tbody>
			</table>
		</form>
		<br />
		<hr />
	
	</body>
</html>