package com.dev.employee;


public interface EmployeeInterface {
	
	boolean insertEmp(String s, Employee e);
	Employee getEmp(String t);
	Employee updateEmp(String s, Employee e);
	boolean removeEmp(String s);
	void getTax(double d);
	Employee getSal(Employee t);
	Employee getNetPay(double b);
	

}
