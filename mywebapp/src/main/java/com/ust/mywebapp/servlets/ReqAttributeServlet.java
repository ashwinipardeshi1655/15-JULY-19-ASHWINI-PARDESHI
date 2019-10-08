package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/reqAttribute")
public class ReqAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) req.getAttribute("employee");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Employee Details are following ");
		
		out.println("<h2> id : "+employeeInfoBean.getEmpId()+"</h2>");
		out.println("<h2> name : "+employeeInfoBean.getEmpName()+"</h2>");
		out.println("<h2> Age : "+employeeInfoBean.getAge()+"</h2>");
		out.println("<body>");
		
		out.println("</body>");
		out.println("</html>");
	}
}
