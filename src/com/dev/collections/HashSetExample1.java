package com.dev.collections;

import java.util.HashSet;

import com.dev.Demo.Employee;

public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e = new Employee();
		e.setName("Ashwini");
		e.setId(1);
		e.setEmail("ashu@gmail.com");
		e.setPassword("ashwr");
		
		Employee e1 = new Employee();
		e1.setName("Asmita");
		e1.setId(2);
		e1.setEmail("asmita@gmail.com");
		e1.setPassword("ahjaisau");
		
		Employee e2 = new Employee();
		e2.setName("Dipika");
		e2.setId(3);
		e2.setEmail("dipika@gmail.com");
		e2.setPassword("kjxjhxbxbisau");

		boolean b = hs.add(e);
		boolean b1 = hs.add(e1);
		boolean b2 = hs.add(e2);
		System.out.println("output of add() "+b);
		System.out.println("output of add() "+b1);
		System.out.println("output of add() "+b2);
		System.out.println(hs.size());
		System.out.println(hs);
		
		e1.setEmail("piya@gmail.com");
		System.out.println("after update = "+hs);

		boolean d1 = hs.remove(e2);
		System.out.println("output of remove(): "+d1);
		System.out.println(hs.size());
		System.out.println("after removing = "+hs);
		
		hs.clear();
		System.out.println(hs.size());

	}

}
