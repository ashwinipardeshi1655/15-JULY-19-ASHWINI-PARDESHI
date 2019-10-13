package com.dev.inheritence.inheritence1;

public class SuperClass {
	
	public SuperClass() {
		System.out.println("Constructor with 0 argument");
	}
	public SuperClass(int a) {
		System.out.println("Constructor with 1 int argument");
	}
	public SuperClass(int a ,char b) {
		System.out.println("Constructor with 1 int and 1 char argument");
	}
	public SuperClass(char a , int b) {
		System.out.println("Constructor with 1 char and 1 int argument");
	}
	public SuperClass(int a , int b) {
		System.out.println("Constructor with 2 int argument");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
