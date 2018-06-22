
package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach=context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		//call method to get a daily fortune
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
