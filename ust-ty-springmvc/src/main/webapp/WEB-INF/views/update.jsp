<%@page import="com.ust.usttyspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<% 
	Employee employee = (Employee) session.getAttribute("emp");
%>
</head>
<body>
<div>
	<span><a href = "./home">Home</a></span>
	<span style="float: left"><a href = "./logout">Logout</a></span>
</div>
	<fieldset>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>ID :</td>
					<td><input type="number" name="id" required="required" readonly="readonly"
						value="<%=employee.getId()%>"></td>
				</tr>

				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" required="required"
						value="<%=employee.getName()%>"></td>
				</tr>
				<tr>
					<td>DOB :</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required="required"
						value="<%=employee.getPassword()%>"></td>
				</tr>
				<tr>
					<td><input type="submit" value="update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>