package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dao.EmployeeDAO;
import com.ust.mywebapp.dao.EmployeeDAOJpaImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/updateEmp")
public class UpdateEmployeeServlet extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAOJpaImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (employeeInfoBean != null) {
			String empName = req.getParameter("empName");
			employeeInfoBean.setEmpName(empName);
			
			String sage = req.getParameter("age");
			int age = Integer.parseInt(sage);
			employeeInfoBean.setAge(age);
			
			boolean update = dao.updateEmployee(empId);
			
			if (update) {
				out.println("Update Successfully");
			} else {
				out.println("Update can not be complete");
			}
			

		} else {
			out.println("<h2>Employee Record for id " + empId + " Not Foumd!!!!<h2/>");

		}
		
	}
}
