<%@page import="com.ust.usttyspringmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	List<Employee> employees = (List) request.getAttribute("list");
	Employee emp = (Employee)session.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all Employees</title>
</head>
<body>
<div align="right">
		<span><a href="./update">Update Profile</a></span> 
		<span><a href="./delete?id=<%=emp.getId()%>">Delete Profile</a></span> 
		<span><a href="./logout">Logout</a></span>
	</div>
	<div>
	<a href="./home">Home</a>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>DOB</th>
			<th>EMAIL</th>
		</tr>
		<%
			for(Employee employee : employees){
		%>
		<tr>
			<th><%=employee.getId()%></th>
			<th><%=employee.getName() %></th>
			<th><%=employee.getDob() %></th>
			<th><%=employee.getEmail() %></th>
		</tr>
		
		<%
			} 
		%>
	</table>

</body>
</html>