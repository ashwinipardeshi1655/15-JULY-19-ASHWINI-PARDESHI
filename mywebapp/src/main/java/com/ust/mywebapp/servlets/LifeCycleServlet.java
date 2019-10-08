package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifeCycleServlet")         //name of the file...starts with '/'
public class LifeCycleServlet extends HttpServlet {
	
	public LifeCycleServlet() {
		System.out.println("Instantiation");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		
		resp.setContentType("text/html");      // resp => to send response
		PrintWriter out = resp.getWriter();  //getWriter => It gives the object of printWriter
//
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h2>Current System Date & Time <br>");
		out.println(date);
//		out.println("<h2>");
//		out.println("<body>");
//		out.println("</html>");
		
		System.out.println("service");
		System.out.println("Changes");

	}// End of doGet()
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

}// End of class
