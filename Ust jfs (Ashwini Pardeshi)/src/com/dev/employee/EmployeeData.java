package com.dev.employee;

public class EmployeeData {

	public static void main(String[] args) {
		
		EmployeeClass ec = new EmployeeClass();
		
		Employee e = new Employee();
		e.setEmpid(11);
		e.setEmail("ashu@gmail.com");
		e.setEname("Ashwini");
		e.setPassword("ashpar");
		e.setSalary(100000);
		
		Employee e1 = new Employee();
		e1.setEmpid(12);
		e1.setEmail("ashutosh@gmail.com");
		e1.setEname("Ashutosh");
		e1.setPassword("ashumoh");
		e1.setSalary(200000);
		
		Employee e2 = new Employee();
		e2.setEmpid(13);
		e2.setEmail("pranali@gmail.com");
		e2.setEname("Pranali");
		e2.setPassword("prashi");
		e2.setSalary(1000001);
		
		//inserting the employee data
		System.out.println("first element inserted: "+ec.insertEmp("1", e));
		System.out.println("first element inserted: "+ec.insertEmp("2", e1));
		System.out.println("first element inserted: "+ec.insertEmp("3", e2));
		
		//retrieve the data
		System.out.println(ec.getEmp("1"));
		System.out.println(ec.getEmp("2"));
		System.out.println(ec.getEmp("3"));
		
		//Updating the data
		ec.updateEmp("1", e2);
		System.out.println(ec.updateEmp("1", e2));
		
		//removing the data
		System.out.println(ec.removeEmp("1"));
		
		
		System.out.println(ec.getEmp("1"));
		
		


	}

}
