package com.dev.threads;

public class Thread3method2 implements Runnable {

	@Override
	public void run() {
		System.out.println("T3 thread started...");
		
		System.out.println("Thread3method2 prints the value of k");
		
		for(int k = 1; k<=10; k++) {
			System.out.println("k = "+k);
		}
		
		System.out.println("T3 thread terminated...");

		
	}

}
