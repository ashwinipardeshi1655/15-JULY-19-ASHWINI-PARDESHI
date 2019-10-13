package com.dev.inheritence;

public class Daughter extends Father {
	
	static String name = "Ashwini";
	static GrandFather d = new Daughter();

	
	public static void main(String[] args) {
		d.printName();	
	}

	@Override
	public void printName() {
		System.out.println(name+ " " +super.name+ " " +d.lastname);
	}
}

