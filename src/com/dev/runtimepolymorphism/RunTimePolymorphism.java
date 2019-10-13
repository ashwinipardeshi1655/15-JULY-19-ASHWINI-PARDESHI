package com.dev.runtimepolymorphism;

public class RunTimePolymorphism {

	static RunTimePolymorphism rp = new RunTimePolymorphism();
	public static void main(String[] args) {
		rp.checkMethod();

	}
	
	public void checkMethod() {
		System.out.println("this is similar to parent class");
	}

}
