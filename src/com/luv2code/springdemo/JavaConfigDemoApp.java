
package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		//1. Default bean id
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		//2. Explicit bean id
		//Coach theCoach=context.getBean("thatCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		//call method to get a daily fortune
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
