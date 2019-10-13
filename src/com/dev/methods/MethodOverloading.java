package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();


	public void print() {
		System.out.println("this is print method with no arg");
	}


	public int print(int i) {
		System.out.println("this is print method with in arg");
		return 1;
	}


	static String print(String str) {
		System.out.println("this is a print method with String str");
		return "A";
	}


	public static void main(String[] args) {
		mo.print(1);
	}
}
