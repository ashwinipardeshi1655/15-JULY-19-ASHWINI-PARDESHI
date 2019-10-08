package com.ust.usttyspringcore.lifecycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld implements InitializingBean, DisposableBean{
	
	private String msg;
	private int count;
	@Autowired
	@Qualifier("human")                               //this will only take human obj in case of byName
	private Animal animal;
	private Map<String, Integer> map;
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public HelloWorld() {
		System.out.println("object created");
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
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hello World Destroy ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet From Helloworld init");
	}
	


		
	

	
	

}
