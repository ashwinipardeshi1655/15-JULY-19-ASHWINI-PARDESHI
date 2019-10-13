package com.dev.inheritence;

public class Son extends Father {
	
	static String name = "Yadnesh";
	static Son s = new Son();

	public static void main(String[] args) {
		s.printName();

	}
	@Override
	public void printName() {
		System.out.println(name+ " " +super.name+ " " +s.lastname);
	}

}

