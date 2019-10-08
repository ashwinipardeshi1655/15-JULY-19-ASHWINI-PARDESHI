<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>

		<form action="./loginjsp">
			<table>
				<tr>
					<td>User Id:</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>User Password:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><button type="submit"></button></td>
				</tr>
			</table>
		</form>
		
		<a href = "./registerjsp.jsp">SignUp</a>
	</fieldset>
</body>
</html>