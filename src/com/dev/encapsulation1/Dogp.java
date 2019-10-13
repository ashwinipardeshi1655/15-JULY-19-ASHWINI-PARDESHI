package com.dev.encapsulation1;

public class Dogp {

	public static void main(String[] args) {
		Pets d1 = new Pets();
		Pets d2 = new Pets();
		Pets d3 = new Pets();

		d1.setType("Dog");
		d1.setAge(1);
		d1.setName("Shiro");
		d1.setColor("brown");

		d2.setType("Cat");
		d2.setAge(2);
		d2.setName("Dora");
		d2.setColor("white");

		d3.setType("Rabbit");
		d3.setAge(1);
		d3.setName("moti");
		d3.setColor("white");

		Pets[] pets = { d1, d2, d3 };

		for (int i = 0; i < pets.length; i++) {
			System.out.println(pets[i].getType());
			System.out.println(pets[i].getName());
			System.out.println(pets[i].getAge());
			System.out.println(pets[i].getColor());
			System.out.println("***************************");
			System.out.println();
		}
	}

}
