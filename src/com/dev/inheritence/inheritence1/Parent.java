package com.dev.inheritence.inheritence1;

public class Parent {

	String name = "Suresh";
	String lastname = "Pardeshi";
	static Parent p = new Parent();

	public static void main(String[] args) {

		p.printName();
	}

	public void printName() {
		System.out.println(name+ " " +p.lastname);
	}

}
