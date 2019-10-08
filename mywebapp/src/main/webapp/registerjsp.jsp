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
		<form action="./registerjsp" method="post">
			<table>
				<tr>
					<td>Emp Id :</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>Emp name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				
				<tr>
					<td>Emp Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Emp Age</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="number" name="salary"></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation"></td>
				</tr>
				<tr>
				<td><input type="submit"></td>
			</tr>
				

			</table>
		</form>
	</fieldset>
</body>
</html>