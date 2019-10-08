package com.ust.usttyspringcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class AppLifeCycle {
	public static void main(String[] args) {
		
		// after spring we set value in bean.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanslifecycle.xml"); // getting access to bean.xml
		HelloWorld obj2 = context.getBean(HelloWorld.class); // getBean method will return the object according to
																// parameter pass inside it...We can give parameter as
																// class name or id which is given inside bean.xml
		System.out.println(obj2.getMsg()); 
		System.out.println(obj2.getCount());
		obj2.getAnimal().makeSound();
		

		Animal animal1 = (Animal) context.getBean("dog");
		animal1.makeSound();
		
		context.close();
		
		
	}
}
