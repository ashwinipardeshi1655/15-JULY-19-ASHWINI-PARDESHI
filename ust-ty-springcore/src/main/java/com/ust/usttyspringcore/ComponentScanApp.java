package com.ust.usttyspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.usttyspringcore.cofig.SpringConfig;
import com.ust.usttyspringcore.lifecycle.HelloWorld;

public class ComponentScanApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	}

}
