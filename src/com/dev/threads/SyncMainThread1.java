package com.dev.threads;

public class SyncMainThread1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("SyncMainThread1 started.....");
		
		Printer1 p = new Printer1();
		
		Thread6 t6 = new Thread6(p);
		t6.start();
		t6.join();

		new Thread7(p).start();
		
		
		
		System.out.println("SyncMainThread1 terminated.....");

	}

}
