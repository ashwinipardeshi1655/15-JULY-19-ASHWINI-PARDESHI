package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookieServlet")
public class ReadCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html");
	
		out.println("<html>");
		out.println("<body>");
		
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				out.print("<h3>Cookie Name = " +cookie.getName()+ "</h3>");
				out.print("<h3>Cookie Value = " +cookie.getValue()+ "</h3>");
			}
		} else {
			out.println("Cookie not found");

		}
		out.println("</body>");
		out.println("</html>");
	}

}
