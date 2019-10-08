package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.mywebapp.dao.EmployeeDAO;
import com.ust.mywebapp.dao.EmployeeDAOJpaImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/searchEmp")
public class SerchEmployeeServlet extends HttpServlet {

	private EmployeeDAO dao = new EmployeeDAOJpaImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the form data

		HttpSession session = req.getSession(false);

		if (session != null) {
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			EmployeeInfoBean emp = dao.searchEmployee(empId);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (emp != null) {
				out.println("<h3>Employee Data for Employee Id " + empId + "</h3>");
				out.println("<br/>Employee Id : " + emp.getEmpId());
				out.println("<br/>Employee Name : " + emp.getEmpName());
				out.println("<br/>Employee Age : " + emp.getAge());
				out.println("<br/>Employee Salary : " + emp.getSalary());
				out.println("<br/>Employee Designation : " + emp.getDesignation());

			} else {
				out.println("<h2>Employee Record for id " + empId + " Not Foumd!!!!<h2/>");

			}
			out.println("</body>");
			out.println("</head>");

		} else {
			resp.sendRedirect("./login.html");
		}

	}
}
