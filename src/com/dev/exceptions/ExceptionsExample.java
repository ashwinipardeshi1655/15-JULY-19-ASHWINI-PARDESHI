package com.dev.exceptions;

public class ExceptionsExample {

	public static void main(String[] args) {

		System.out.println("print statement before");
		exceptioncaller(); 		                          //exception
		System.out.println("print statement after");

	}

	public static void exception() {

		StringBuffer sb = new StringBuffer(-1);         //exception

	}

	public static void exceptioncaller() {

		exception();

	}
}
