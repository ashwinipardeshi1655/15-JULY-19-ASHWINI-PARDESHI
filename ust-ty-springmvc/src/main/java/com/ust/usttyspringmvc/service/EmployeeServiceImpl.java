package com.ust.usttyspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.usttyspringmvc.dao.EmployeeDAO;
import com.ust.usttyspringmvc.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public Employee auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (employee.getName() == null || employee.getEmail() == null || employee.getPassword() == null)
			return false;
		return dao.registerEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if (employee.getName() == null || employee.getEmail() == null || employee.getPassword() == null)
			return false;
		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
