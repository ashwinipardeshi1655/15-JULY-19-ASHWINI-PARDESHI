package com.ust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.mywebapp.dao.EmployeeDAO;
import com.ust.mywebapp.dao.EmployeeDAOJpaImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/loginjsp")
public class LoginServletJSP extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/loginjsp.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		
		//Hibernate code for validation
		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		EmployeeInfoBean employeeInfoBean = dao.login(Integer.parseInt(id), password);
		
		String url = null;
		if(employeeInfoBean!= null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("emp", employeeInfoBean);
			url = "./homepagejsp.jsp";
		}else {
			url = "./loginjsp.jsp";
		}
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}

}
