package com.dev.Demo;

public class Demo1 {

	public static int i = 10;
	public static String str = "Static String";
	final static int J = 8;
	
	public static void main(String[] args) {
		name();
	}
	
	public static void print() {
		System.out.println("print the method");
	}
	
	public static void name() {
		int J = 20;
		System.out.println("print name");
		System.out.println(J);
		//String s = new String("ashu");
		//s = null;
		//System.out.println(s);
	}

}
