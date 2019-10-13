package com.dev.collections;

import java.util.ArrayList;

import com.dev.Demo.Dog;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<Dog> arl = new ArrayList<Dog>();
		
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("White");
		
		
		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("Ronnie");
		d1.setColor("brown");
		
		Dog d2 = new Dog();
		d2.setAge(3);
		d2.setBreed("Dalmation");
		d2.setName("kivii");
		d2.setColor("B&W");
		
		System.out.println(arl.size());
		
		arl.add(d);
		arl.add(d1);
		arl.add(d2);
		
		System.out.println(arl.size());
		
		arl.trimToSize();
		System.out.println(arl.size());
		
		System.out.println(arl);
	}

}
