package com.dev.inheritence.inheritence1;

public class Father1 extends GrandFather1{

	String name = "Suresh";
	static Father1 f = new Father1();

	@Override
	public void printName() {
		System.out.println(name+ " " + super.name+ " " +f.lastname);
		super.printName();
	}

	public static void main(String[]args) {
		f.printName();
	}
}
