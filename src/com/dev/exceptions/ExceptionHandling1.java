package com.dev.exceptions;

public class ExceptionHandling1 {
	
	public static void main(String[] args)
			throws Exception, NegativeArraySizeException {     //use throws in the calling method as well as called method.
		
		exception();
		System.out.println("Code after the execution");

	}

	public static void exception() 
			throws Exception, NegativeArraySizeException {             //called method

		StringBuffer sb = new StringBuffer(-1);         //exception

	}

}


//"throws" keyword tells us that it might throw an exception.It is not mandatory to throw exception.It doesn't handle exception.