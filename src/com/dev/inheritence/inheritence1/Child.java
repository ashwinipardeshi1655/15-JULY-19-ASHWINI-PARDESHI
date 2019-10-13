package com.dev.inheritence.inheritence1;

public class Child extends Parent{

	String name = "Yadnesh";
	static Child c = new Child();

	public static void main(String[] args) {
		c.printName();

	}
	@Override
	public void printName() {
		System.out.println(name+ " " +super.name+ " " +c.lastname);
		super.printName();

	}

}
