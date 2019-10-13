package com.dev.abstraction.abstact1;

public class Subarban extends Mumbai{

	static Subarban s = new Subarban();
	
	public static void main(String[] args) {
		s.increasePlants();
		s.increaseMetro();
		s.reduceCrowd();
		s.cleanCity();

	}

	@Override
	void reduceCrowd() {
		System.out.println("reducing the crowd");
		
	}

	@Override
	void increaseMetro() {
		System.out.println("increasing metro");
		
	}

}
