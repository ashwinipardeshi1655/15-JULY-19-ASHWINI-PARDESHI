package com.dev.inheritence;

public class Father extends GrandFather {
	
	String name = "Suresh";
	static Father f = new Father(); 
	
	
	public static void main(String[]args) {
		f.printName();

	}
	
	@Override
	public void printName() {
		System.out.println(name+ " " +super.name+" " +f.lastname);
		
	}

}

