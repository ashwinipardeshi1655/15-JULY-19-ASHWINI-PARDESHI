package com.dev.abstraction.abstact1;

public class Kalyan extends Thane{

	static Kalyan k = new Kalyan();
	
	public static void main(String[] args) {
		k.increaseJobs();
		k.increaseHouses();
		k.increaseMetro();
		k.increasePlants();
		k.reduceCrowd();
		k.cleanCity();
		

	}

	@Override
	void increaseJobs() {
		System.out.println("increase jobs");
		
	}

	@Override
	void increaseHouses() {
		System.out.println("increase houses");
		
	}

	@Override
	void reduceCrowd() {
		System.out.println("Reduce crowd");
		
	}

}
