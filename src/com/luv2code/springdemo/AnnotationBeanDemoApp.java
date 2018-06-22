package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		Coach theCoach1=context.getBean("tennisCoach", Coach.class);
		Coach theCoach2=context.getBean("tennisCoach", Coach.class);
		boolean res= (theCoach1==theCoach2);
		System.out.println("Pointing to the same object: "+res);
		System.out.println("Memory location for theCoach1: "+theCoach1);
		System.out.println("Memory location for theCoach2: "+theCoach2);

	}

}
