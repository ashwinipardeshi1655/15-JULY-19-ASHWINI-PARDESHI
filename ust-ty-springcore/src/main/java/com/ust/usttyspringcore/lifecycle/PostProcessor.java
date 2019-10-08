package com.ust.usttyspringcore.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(beanName.equals("obj")) {
			System.out.println("Hello world before Init");
		}else if(beanName.equals("dog")) {
			System.out.println("Dog before Init");
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(beanName.equals("obj")) {
			System.out.println("Hello world after Init");
		}else if(beanName.equals("dog")) {
			System.out.println("Dog after Init");
		}
		return bean;
	}

}
