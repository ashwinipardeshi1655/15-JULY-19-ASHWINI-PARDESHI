package com.ust.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dao.EmployeeDAO;
import com.ust.mywebapp.dao.EmployeeDAOJpaImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/addEmp")
public class AddEmployeeServlet extends HttpServlet {
	
	private EmployeeDAO dao = new EmployeeDAOJpaImpl();
	EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		employeeInfoBean.setEmpId(empId);
		
		String empName = req.getParameter("empName");
		employeeInfoBean.setEmpName(empName);
		
		String sage = req.getParameter("age");
		int age = Integer.parseInt(sage);
		employeeInfoBean.setAge(age);
		
		boolean add = dao.addEmployee(employeeInfoBean);
		

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		if(add) {
			out.println("<h2>data inserted</h2>");
		}else {
			out.println("<h2>data not inserted</h2>");

		}
		out.println("</body>");
		out.println("</html>");
	}
}
