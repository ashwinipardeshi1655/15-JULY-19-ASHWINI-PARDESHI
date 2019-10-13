package com.dev.methods;

public class MethodExample1 {

	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();
		
		MethodExample.calcArea(4);                       //calling a static method
		me.calcArea1(3, 5);                              //calling a non-static method using object
		
	}

}
