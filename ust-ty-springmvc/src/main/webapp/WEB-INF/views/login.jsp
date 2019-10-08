<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" required="required"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Sign In"></td>
				</tr>
			</table>
		</form>
		<a href="./register">Sign Up</a>
		<h3>${ msg }</h3>
	</fieldset>

</body>
</html>