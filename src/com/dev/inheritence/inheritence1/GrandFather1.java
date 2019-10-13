package com.dev.inheritence.inheritence1;

public class GrandFather1 {

	String name = "Narayan";
	static GrandFather1 g = new GrandFather1();
	String lastname = "Pardeshi";

	public void printName(){
		System.out.println(name+" " +g.lastname);

	}

	public static void main(String[]args) {
		g.printName();
	}

}
