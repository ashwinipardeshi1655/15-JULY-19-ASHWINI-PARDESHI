package com.ust.usttyspringcore.beans;

public class Pet {
	
	private String name;
	private Animal animal;
	

	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
