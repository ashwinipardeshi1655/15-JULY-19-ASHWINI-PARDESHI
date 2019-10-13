package com.dev.methods;

public class MethodOverloading1 {

	static MethodOverloading1 mo = new MethodOverloading1();

	public static void operation1(int a ,int b) {
		int d = a + b;
		System.out.println(d);
	}

	public static void operation1(int a ,int b, double c) {
		double d = a + b + c;
		System.out.println(d);
	}

	public void operation1(double a , int b , int c , int d) {
		double d1 = a + b + c + d;
		System.out.println(d1);
	}

	public void operation2(int a , int b) {
		int d = a - b;
		System.out.println(d);
	}

	public int operation2(int a, int b , int c) {
		int d = a - b - c ;
		System.out.println(d);
		return d;
	}

	final double operation2(double a , double b , double c , double d) {
		double d1 = a - b - c - d ;
		System.out.println(d1);
		return d1;
	}

	static void operation3(int a, double b) {
		double d = a * b;
		System.out.println(d);
	}

	private void operation3(int a, int b , int c) {
		int d = a * b * c;
		System.out.println(d);
	}

	protected int operation3(int a, int b, int c, int d) {
		int d1 = a * b * c * d;
		System.out.println(d1);
		return d1;
	}

	public static void main(String[] args) {
		operation1(2,3);
		operation1(2,3,0.5);
		mo.operation1(0.5,2,4,3);
		mo.operation2(4,3);
		mo.operation2(8, 2, 2);
		mo.operation2(10 , 1.5 , 1.5 , 1.0);
		mo.operation3(2,3,4);
		operation3(2, 3.0);
		mo.operation3(1, 2, 3, 4);

	}

}
