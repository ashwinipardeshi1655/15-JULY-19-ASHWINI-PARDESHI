package com.dev.threads;

public class MainThread {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");

		Thread2 t2 = new Thread2();
		t2.setName("Thread T2");
		t2.setPriority(3);
		t2.start();
		// or
		// new Thread2().start(); //we have created a object of class T2.After that we
		// call start method. Start method will implicitly call the method we have
		// written in T2 class

		// new Thread(new Thread3method2()).start(); //here we are calling T3method
		// class which is created by implementing the runnable interface
		// or
		Thread3method2 t3 = new Thread3method2();
		Thread t = new Thread(t3);
		t.start();
		t.setName("thread 3");
		t.setPriority(9);

		Thread.currentThread().setName("Main thread");
		Thread.currentThread().setPriority(7);

		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("Thread2 name: " + t2.getName());
		System.out.println("Thread2 id: " + t2.getId());
		System.out.println("Thread2 priority: " + t2.getPriority());

		System.out.println("Thread3 name: " + t.getName());
		System.out.println("Thread3 id: " + t.getId());
		System.out.println("Thread3 priority: " + t.getPriority());

		System.out.println("MainThread name: " + Thread.currentThread().getName());
		System.out.println("MainThread id: " + Thread.currentThread().getId());
		System.out.println("MainThread priority: " + Thread.currentThread().getPriority());

		System.out.println("Main thread terminated");
	}

}

//here output of this particular class will always show different output as those both methods are running simultaneously.