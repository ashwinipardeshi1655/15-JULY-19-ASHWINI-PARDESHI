package com.dev.inheritence;

public class GrandFather {
	
	String name = "Narayan";
	static GrandFather g = new GrandFather();
	static String lastname = "Pardeshi";

	public static void main(String[] args) {
		g.printName();
	}

	
	public void printName() {
		System.out.println(name+ " " +g.lastname);
	}
}
