package com.ust.usttyspringcore.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloWorld {
	
	private String msg;
	private int count;
	private Animal animal;
	private Map<String, Integer> map;
	private List<String> list;
	private Set<Integer> set;
	private ArrayList<String> arraylist;


	public ArrayList<String> getArraylist() {
		return arraylist;
	}

	public void setArraylist(ArrayList<String> arraylist) {
		this.arraylist = arraylist;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

	
	

}
