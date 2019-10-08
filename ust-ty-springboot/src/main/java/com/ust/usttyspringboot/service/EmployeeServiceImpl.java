package com.ust.usttyspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.usttyspringboot.dao.EmployeeDAO;
import com.ust.usttyspringboot.dto.Employee;

//@Service("hibernate")
public class EmployeeServiceImpl implements EmployeeService {
	
	//@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public boolean removeEmployee(int id) {
		return dao.removeEmployee(id);
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		return dao.modifyEmployee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return dao.getEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeesByEmail(String Email) {
		// TODO Auto-generated method stub
		return null;
	}



}
