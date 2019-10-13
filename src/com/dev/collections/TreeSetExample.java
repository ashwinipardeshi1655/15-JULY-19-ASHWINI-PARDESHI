package com.dev.collections;

import java.util.TreeSet;

import com.dev.Demo.Dog;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>();
		
		Dog d = new Dog();
		d.setAge(2);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("White");
		
		
		Dog d1 = new Dog();
		d1.setAge(3);
		d1.setBreed("Dalmation");
		d1.setName("Ronnie");
		d1.setColor("brown");
		
		Dog d2 = new Dog();
		d2.setAge(1);
		d2.setBreed("Dalmation");
		d2.setName("kivii");
		d2.setColor("B&W");
		
		boolean b = ts.add(d);
		boolean b1 = ts.add(d1);
		boolean b2 = ts.add(d2);
		System.out.println(ts);
	}

}
