package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			exception();

		}catch(Exception e) {

			System.out.println("Exception occured");
			e.printStackTrace();                                      //it will show exception
			
		}finally {                                                    //it is optional block
			
			System.out.println("This is Finally block");
			
		}
		
		System.out.println("code after exception");                    //it will print only if there is a catch block is present

	}

	public static void exception() {

		StringBuffer sb = new StringBuffer(-1);                        //exception

	}
}
