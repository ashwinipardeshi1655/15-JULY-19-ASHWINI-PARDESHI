package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextAttribute")
public class MyContextAttrServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(1106);
		employeeInfoBean.setEmpName("Ashu");
		employeeInfoBean.setAge(1234);

		ServletContext context = getServletContext();
		context.setAttribute("emp", employeeInfoBean);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Context attribute are set...");
		out.println("</body>");
		out.println("</html>");
	}
}
