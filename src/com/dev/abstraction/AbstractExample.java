package com.dev.abstraction;

public abstract class AbstractExample {

	// this is a constructor of abstract class
	public AbstractExample() {
		System.out.println("Constructor of AbstractExample class");
	}

	public static void main(String[] args) {

	}

	// this is a abstract method of abstract class
	abstract void display();

	abstract void view();

	// this is a concrete method of abstract class
	public void show() {
		System.out.println("This is a concete method of abstract class");
	}

}

//we can have constructor of abstract class but we can not create object of abstract class