package com.dev.Demo;

public class DogData {

	public static void main(String[] args) {
		
		HashMapExample2 hm = new HashMapExample2();
		
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
		
		System.out.println(hm.putDog("1", d));
		System.out.println(hm.putDog("2", d1));
		System.out.println(hm);
		
		Dog dog = hm.getDog("1");
		System.out.println(dog);
		
		
	}

}
