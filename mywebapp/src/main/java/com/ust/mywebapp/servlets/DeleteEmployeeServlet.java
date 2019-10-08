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

@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAOJpaImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		boolean delete = dao.deleteEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		if(delete) {
			out.println("<h2>data deleted successfully</h2>");
		}else {
			out.println("<h2>data not deleted</h2>");

		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
