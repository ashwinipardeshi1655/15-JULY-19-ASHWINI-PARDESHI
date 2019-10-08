package com.ust.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpId(1234);
		employeeInfoBean.setEmpName("Ashwini");
		employeeInfoBean.setAge(1234);
		
		req.setAttribute("employee", employeeInfoBean);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/mySecondServlet");
		dispatcher.forward(req, resp);
		
		
	}
}
