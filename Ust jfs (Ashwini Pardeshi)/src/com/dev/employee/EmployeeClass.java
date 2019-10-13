package com.dev.employee;

import java.util.HashMap;

public class EmployeeClass implements EmployeeInterface{

	static HashMap<String, Employee> hm = new HashMap<String, Employee>();


	@Override
	public boolean insertEmp(String s, Employee e) {
		hm.put(s, e);
		return true;
	}

	@Override
	public Employee getEmp(String t) {
		return hm.get(t);
	}

	@Override
	public Employee updateEmp(String s, Employee e) {
		return  hm.put(s, e);
	}

	@Override
	public boolean removeEmp(String s) {
		hm.remove(s);
		return true;
	}

	@Override
	public void getTax(double d) {
		if(d>1000000) {
			double i = (9.35/100)*d;
			System.out.println(i);
		}
		else if(d>860000 && d<1000000) {
			double i = (8.87/100)*d;
			System.out.println(i);
		}
		else if(d>540000 && d<860000 ) {
			double i = (8.19/100)*d;
			System.out.println(i);
		}
		else if(d>380000 && d<540000) {
			double i = (7.34/100)*d;
			System.out.println(i);

		}
		else if(d>160000 && d<380000) {
			double i = (5.4/100)*d;
			System.out.println(i);
		}
		else {
			System.out.println("no output");
		}
	}

	@Override
	public Employee getSal(Employee e) {
		Employee e1 = hm.get(e.getEmpid());
		return e1;
	}

	@Override
	public Employee getNetPay(double b) {
		return null;
	}





}
