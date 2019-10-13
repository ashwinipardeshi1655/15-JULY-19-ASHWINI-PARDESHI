package com.dev.runtimepolymorphism;

public class RunTimePolymorphism1 extends RunTimePolymorphism{
	
	static RunTimePolymorphism1 rp1 = new RunTimePolymorphism1();

	public static void main(String[] args) {
		rp1.checkMethod();
	}
	
	@Override
	public void checkMethod() {
		System.out.println("This is similar to child method");
		rp.checkMethod();
	}

}
