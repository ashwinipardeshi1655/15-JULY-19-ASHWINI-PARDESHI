package com.ust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dao.EmployeeDAO;
import com.ust.mywebapp.dao.EmployeeDAOJpaImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/registerjsp")
public class RegisterServletJSP extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("./registerjsp.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		String salary = req.getParameter("salary");
		String designation = req.getParameter("designation");
		
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(Integer.parseInt(id));
		employeeInfoBean.setEmpName(name);
		employeeInfoBean.setPassword(password);
		employeeInfoBean.setAge(Integer.parseInt(age));
		employeeInfoBean.setSalary(Double.parseDouble(salary));
		employeeInfoBean.setDesignation(designation);
		
		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		dao.addEmpJSP(employeeInfoBean);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("./loginjsp.jsp");
		dispatcher.forward(req, resp);
	}
}
