package com.dev.abstraction;

public class Abstraction extends AbstractExample{

	static Abstraction ab = new Abstraction();
	
	public Abstraction() {
		System.out.println("Constructor of Absraction class");
	}
	
	public static void main(String[] args) {
		ab.display();
		ab.show();
		ab.view();

	}

	@Override
	void display() {
		System.out.println("This is a implemented abstract method");
		
	}

	@Override
	void view() {
		System.out.println("This is a view method");
		
	}
	

}
