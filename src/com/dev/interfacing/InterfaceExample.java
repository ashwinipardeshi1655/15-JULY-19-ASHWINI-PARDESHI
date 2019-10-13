package com.dev.interfacing;

public interface InterfaceExample {

	void display();                              // this is a abstract method ...as all the methods in interface are abstract methods

	default void view() {                        // this is a concrete method as it is declred with default or public
		System.out.println("view the method");
	}

	public static void print() {
		System.out.println("this is concrete method");
	}

}
