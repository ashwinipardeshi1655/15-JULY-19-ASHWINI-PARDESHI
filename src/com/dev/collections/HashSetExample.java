package com.dev.collections;

import java.util.HashSet;

import com.dev.Demo.Dog;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();
		
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
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("Ronnie");
		d2.setColor("brown");


		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b5 = hs.add(d2);
		System.out.println("output of add(): "+b);
		System.out.println("output of add(): "+b1);
		System.out.println("output of add(): "+b5);
		System.out.println(hs);
		System.out.println("size of HashSet hs before removing element : "+hs.size());
		
		d.setAge(5);
		d1.setColor("B&W");

		
		boolean b2 = hs.remove(d1);
		System.out.println("output of remove(): "+b2);
		System.out.println(hs);
		
		System.out.println("output of contains(): "+hs.contains(d1));
		
		System.out.println("size of HashSet hs after removing element: "+hs.size());
		
		hs.clear();
		System.out.println("size of HashSet hs after clear(): "+hs.size());
	}

}