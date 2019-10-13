package com.dev.threads;

public class Thread4 extends Thread{

	Printer p;

	public Thread4(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			System.out.println("solve exception");
		}
		p.printVal(10, "Thread4");
	}

}


