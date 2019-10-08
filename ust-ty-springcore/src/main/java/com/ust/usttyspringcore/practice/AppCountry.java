package com.ust.usttyspringcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCountry {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscounty.xml");
		CountryBean country = context.getBean(CountryBean.class);
		
		System.out.println(country.getName());
		country.getIndia().clean();
	}

}
