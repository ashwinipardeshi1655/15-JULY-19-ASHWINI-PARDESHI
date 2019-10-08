package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeServlet
 */
@WebServlet("/GetEmployeeServlet")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("empID");
		int empID = Integer.parseInt(empIdVal);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");


		if(empID == 101) {
			out.println("<h2>EmpDetails for emp id " +empID+ " - </h2");
			out.println("id = 101 <br/>");
			out.println("name = Ashwini <br/>");
			out.println("Age = 21 <br/>");
			out.println("Phone = 9374978238 <br/>");
			out.println("Salary = 30000 <br/>");
		} else {
			out.println("<h2 style = \"color:red\"> Record not founf for empID" +empID+ "</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}// End of doGet

}// End of class
