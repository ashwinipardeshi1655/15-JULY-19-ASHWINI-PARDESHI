package com.dev.Demo;

import java.util.HashSet;

import com.dev.Demo.Dog;

public class ForEach {
	
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
		
		for(Dog dog : hs) {
			System.out.println(dog);
		}
	}}