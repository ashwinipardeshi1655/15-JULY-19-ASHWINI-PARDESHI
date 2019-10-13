package com.dev.exceptions;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("Custom Exception");
	}
	
	public CustomException(int i) {
		System.out.println("Custom Exception with int");
	}
	
	public CustomException(String str) {
		System.out.println("Custom Exception with string");
	}

	@Override
	public String getLocalizedMessage(){
		
		return "custom exception";
	}
	
}
