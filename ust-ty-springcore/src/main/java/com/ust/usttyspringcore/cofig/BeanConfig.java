package com.ust.usttyspringcore.cofig;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ust.usttyspringcore.lifecycle.Animal;
import com.ust.usttyspringcore.lifecycle.Dog;
import com.ust.usttyspringcore.lifecycle.HelloWorld;
import com.ust.usttyspringcore.lifecycle.Human;

@Configuration
public class BeanConfig {

	@Bean(name = "obj")// , autowire = Autowire.BY_TYPE
	public HelloWorld getHelloWorld() {

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello World!!!!!!!!!!");
		helloWorld.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 789);
		helloWorld.setMap(map);
		//Animal animal = getDog();
		
		//helloWorld.setAnimal(getDog());
		return helloWorld;
	}
	
	@Bean(name = "dog")
	@Scope("prototype")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "human")
	public Human getHuman() {
		return new Human();
	}
}
