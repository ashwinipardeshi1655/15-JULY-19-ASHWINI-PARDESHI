package com.ust.mywebapp.dao;

import com.ust.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean searchEmployee(int id);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int id);
	public EmployeeInfoBean login(int empId , String password);
	public boolean updateEmployee(int id);
	public void addEmpJSP(EmployeeInfoBean employeeInfoBean);
	public void deleteEmpJSP(int id);
}
