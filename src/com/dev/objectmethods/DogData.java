package com.dev.objectmethods;

public class DogData {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.setAge(1);
		d1.setName("Shiro");
		d1.setBreed("German shepard");
		d1.setColor("brown");
		
		d2.setAge(2);
		d2.setName("spike");
		d2.setBreed("Dobber Man");
		d2.setColor("white");
		
		d3.setAge(1);
		d3.setName("Shiro");
		d3.setBreed("German shepard");
		d3.setColor("brown");

		Dog [] dogs = {d1,d2,d3};
		
		for(int i=0; i<dogs.length; i++) {
			
			System.out.println(dogs[i]);
		}

		System.out.println(d1.equals(d3));
		System.out.println(d3.hashCode());
		System.out.println(d2.hashCode());
		
	
		
	}

}
