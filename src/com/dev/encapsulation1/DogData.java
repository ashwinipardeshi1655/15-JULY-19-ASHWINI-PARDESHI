package com.dev.encapsulation1;

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
		
		d3.setAge(3);
		d3.setName("domy");
		d3.setBreed("Dobber Man");
		d3.setColor("black");
		
		Dog[] dog = {d1, d2, d3};
		
		for(int i=0; i <= dog.length-1 ; i++) {
			System.out.println(dog[i].getAge());
			System.out.println(dog[i].getName());
			System.out.println(dog[i].getBreed());
			System.out.println(dog[i].getColor());
			System.out.println("************************");
			System.out.println();
		}

	}

}
