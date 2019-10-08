<%@page import="com.ust.usttyspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<% 
	Employee employee = (Employee)session.getAttribute("emp");
%>
</head>
<body>
	<div align="right">
		<span><a href="./update">Update Profile</a></span> 
		<span><a href="./delete?id=<%=employee.getId()%>">Delete Profile</a></span> 
		<span><a href="./logout">Logout</a></span>
	</div>
<h1>Welcome <%=employee.getName()%></h1>
<a href="./show-all">Show all Employees</a>
<h3>${msg}</h3>
</body>
</html>