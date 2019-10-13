package com.dev.Demo;

import java.util.HashMap;

public class HashMapExample2 implements EmployeeInterface{
	
	static HashMap<String , Dog> hm = new HashMap<String, Dog>();
	

	public static void main(String[] args) {

}

	@Override
	public boolean putDog(String k, Dog v) {
		hm.put(k, v);
		return true;
	}

	@Override
	public Dog getDog(String k) {
		return hm.get(k);
	}
}
