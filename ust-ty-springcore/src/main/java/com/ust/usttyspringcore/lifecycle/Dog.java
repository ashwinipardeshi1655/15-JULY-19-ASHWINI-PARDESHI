package com.ust.usttyspringcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {
	
	public Dog() {
		System.out.println("Dog Object created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Dog Init Method");

	}

	@PreDestroy
	public void destroy() {
		System.out.println("Dog Destroy method");
	}

	@Override
	public void makeSound() {
		System.out.println("Baooooooooooo............");
		
	}

}
