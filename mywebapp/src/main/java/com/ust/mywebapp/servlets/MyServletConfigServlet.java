package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletConfig config = getServletConfig();
		String myParamVal = config.getInitParameter("name");
		
		ServletContext context = getServletContext();
		String myParamVal1 = context.getInitParameter("name1");
		
		String myParamVal2 = context.getInitParameter("name2");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>My output from config is = " +myParamVal+ "</h2>");
		out.println("<h2>My output from context is = " +myParamVal1+ "</h2>");
		out.println("<h2>My output from context is = " +myParamVal2+ "</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
