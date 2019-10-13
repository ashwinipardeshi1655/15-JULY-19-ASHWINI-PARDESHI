package com.dev.threads;

public class Thread6 extends Thread {
	
	Printer1 p;
	
	public Thread6(Printer1 pref) {
		p = pref;

	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			System.out.println("exception solved");
			e.printStackTrace();
		}
		p.printNum(10, "thread6");

		
	}

}
