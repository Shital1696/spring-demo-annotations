package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	//define beans and inject dependencies
@Bean
public Coach swimCoach()
{
	SwimCoach myCoach=new SwimCoach(sadFortuneService());
	return myCoach;
}

@Bean
public FortuneService sadFortuneService()
{
	return new SadFortuneService();
}

}
