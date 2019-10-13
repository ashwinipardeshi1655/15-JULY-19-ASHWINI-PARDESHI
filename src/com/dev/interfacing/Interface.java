package com.dev.interfacing;

public class Interface implements InterfaceExample{
	
	static Interface i = new Interface();
	public static void main(String[]args) {
		InterfaceExample.print();
		i.view();
		i.display();
	}

	@Override
	public void display() {
		System.out.println("implemented method from interface");
		
	}

}
