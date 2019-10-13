package com.dev.exceptions;

public class ExceptionHandling2  {

	public static void main(String[] args)
			throws CustomException {                        //use throws in the calling method as well as called method.

		try {
			exception();
			System.out.println("no exception in exception()");
			int res = divide(10,0);
			System.out.println("no exception for divide()");
			System.out.println(res);
			//System.exit(0);                                      //it will halt the execution of program

		} catch (NegativeArraySizeException e) {
			//new NegativeArraySizeException().printStackTrace();

			//throw new NegativeArraySizeException("demo");               //if you write throw then program will halt here 
			//new NegativeArraySizeException().printStackTrace();
			System.err.println("exception caught in catch block");
			System.err.println("get message = "+e.getMessage());
			//e.printStackTrace();
			
		} catch (ArithmeticException e) {     //if you have multiple catch blocks then you should not give exception as a parameter in first block
			throw new CustomException(1);      //in this way you can write your own customexception
			//System.err.println("exception caught in catch block in arithmetic way");
			//System.err.println("get message = "+e.getMessage());

		} finally {
			System.out.println("finally block");
		}

	}

	public static void exception()  {

		StringBuffer sb = new StringBuffer(-1);                        //exception

	}  
	
	
	

	public static int divide(int i , int j)  {                             //called method

		int res = i/j;                                                      //exception
		return 1;
	}


}
