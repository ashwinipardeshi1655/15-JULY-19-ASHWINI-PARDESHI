package com.dev.collections;

import java.util.HashMap;

import com.dev.Demo.Dog;

public class HashMapExample {
	
	public static void main(String[]args) {
		
		HashMap<String , Dog> hm = new HashMap<String, Dog>();
		
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
		
		hm.put("1",d);
		Dog b = hm.put("1",d1);
		System.out.println(hm);
		
		hm.put("2", d1);
		hm.put("3", d2);
		System.out.println(hm);

		Dog f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("output of containsKey(): "+hm.containsKey("1"));
		System.out.println("output of containsKey(): "+hm.containsKey("9"));
		System.out.println("output of containsValue(): "+hm.containsValue(d2));
		

	}

}
