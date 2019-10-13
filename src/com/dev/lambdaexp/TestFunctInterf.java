package com.dev.lambdaexp;

public class TestFunctInterf {

	public static void main(String[] args) {
		FunctInterference f = () -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println("i = "+i);
			}
		};
		
		f.printVal();
		
		FunctInterface f1 = () -> System.out.println("Ashwini");
		
		f1.print();
		
		
		FunctInterfaceExcp f2 = () -> {
			try {
				int j = 10/5;
				System.out.println("j = "+j);	
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
				
		};
	
		f2.divide();
	}
	
	
	

}
