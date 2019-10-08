<%@page import="com.ust.mywebapp.dao.EmployeeDAOJpaImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="emp" class = "com.ust.mywebapp.dto.EmployeeInfoBean" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align = "right"><a href = "./deletejsp?id=<%=emp.getEmpId() %>">Delete Profile</a></div>
<div align = "right"><a href = "./logoutjsp">Logout Profile</a></div>
<h1>Welcome <%= emp.getEmpName() %> </h1>
</body>
</html>