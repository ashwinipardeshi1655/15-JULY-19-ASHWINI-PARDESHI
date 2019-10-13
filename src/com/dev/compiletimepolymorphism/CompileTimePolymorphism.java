package com.dev.compiletimepolymorphism;

public class CompileTimePolymorphism {

	static CompileTimePolymorphism cp = new CompileTimePolymorphism();
	
	public static void main(String[] args) {
		cp.add(1 ,2);
		cp.add(2, 3, 4);
		add(1,2,3,4);
		
	}
	
	public void add(int i , int j) {
		int k = i + j;
		System.out.println(k);
	}
	
	private int add(int i , int j ,int k) {
		int m = i + j + k;
		System.out.println(m);
		return m;
	}
	
	public static int add(int i , int j , int k , int l) {
		int m = i + j + k + l;
		System.out.println(m);
		return m;
	}

}
