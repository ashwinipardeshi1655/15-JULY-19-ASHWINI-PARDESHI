package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {

		Student s = new Student();

		s.setRegno(001);
		s.setName("Ashwini");
		s.setEmail("ashuparu55@gmail.com");
		s.setPassword("12er");

		System.out.println(s.getRegno());
		System.out.println(s.getName());
		System.out.println(s.getEmail());

	}

}
