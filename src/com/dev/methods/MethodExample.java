package com.dev.methods;

public class MethodExample {
	
	static MethodExample me = new MethodExample();
	
	public static int calcArea(int side) {
		int area =  side * side;
		System.out.println(area);
		return area;
	}
	
	public int calcArea1(int l , int b) {
		int area1 = l * b;
		System.out.println(area1);
		return area1;
	}
	
	public static void main(String[] args) {
		calcArea(2);
		me.calcArea1(2, 3);
	}
	
	

}
