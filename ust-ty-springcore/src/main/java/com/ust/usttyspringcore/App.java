package com.ust.usttyspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.usttyspringcore.beans.Animal;
import com.ust.usttyspringcore.beans.HelloWorld;
import com.ust.usttyspringcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// before spring
		HelloWorld obj1 = new HelloWorld();
		obj1.setMsg("Hello World!!");
		System.out.println(obj1.getMsg());

		// after spring we set value in bean.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // getting access to bean.xml
		HelloWorld obj2 = context.getBean(HelloWorld.class); // getBean method will return the object according to
																// parameter pass inside it...We can give parameter as
																// class name or id which is given inside bean.xml
		System.out.println(obj2.getMsg()); 
		System.out.println(obj2.getCount());
		obj2.getAnimal().makeSound();
		//System.out.println(obj2.getMap());
		//System.out.println(obj2.getList());
		//System.out.println(obj2.getSet());
		//System.out.println(obj2.getArraylist());

//		Animal animal = (Animal) context.getBean("dog");
//		animal.makeSound();
		

		Animal animal1 = (Animal) context.getBean("dog");
		animal1.makeSound();
		
		Pet pet = (Pet) context.getBean("pet");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		
	}
}
