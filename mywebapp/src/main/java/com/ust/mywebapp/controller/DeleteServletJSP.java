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

@WebServlet("/deletejsp")
public class DeleteServletJSP extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		dao.deleteEmpJSP(Integer.parseInt(id));
		
		HttpSession session = req.getSession(false);
		session.invalidate();
		
		resp.sendRedirect("./loginjsp");
		
		
		
	}

}
