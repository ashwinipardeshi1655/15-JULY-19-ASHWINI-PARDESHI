package com.dev.interfacing;

@FunctionalInterface
public interface FunctionalExample {

	void print();
	
	static void display() {
		System.out.println("display the method");
	}
	
	static void show() {
		System.out.println("show the method");
	}
}


//This is function interface