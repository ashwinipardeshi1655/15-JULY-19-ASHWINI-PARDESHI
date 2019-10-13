package com.dev.threads;

public class Thread7 extends Thread{
	
	Printer1 p;
	
	public Thread7(Printer1 pref) {
		p = pref;
	}

	@Override
	public void run() {
		p.printNum(8, "thread7");
		
		
	}

}
