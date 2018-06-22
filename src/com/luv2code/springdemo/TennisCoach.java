package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //default scope is singleton: shares same ref
@Scope("prototype")	//creates new instance every time
//@Component("thatCoach")
public class TennisCoach implements Coach {
	@Autowired				// no need for constructor/setter injection
	private FortuneService fortuneService; //field injection
	/*@Autowired
	//@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; */
	//default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	/*@Autowired		//constructor injection
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}*/
	/*
	//define a setter method
	@Autowired			//setter injection
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("TennisCoach: inside setFortuneService() method.");
	}
	
	//define a method
	@Autowired			//method injection
	public void doSomeStuff(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
		System.out.println("TennisCoach: inside doSomeStuff() method.");
	}
	
	/*
	//@Autowired
	public void doSomeExtraStuff()
	{
		//fortuneService = theFortuneService;
		System.out.println("TennisCoach: inside doSomeExtraStuff() method.");
	}*/
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("TennisCoach: inside doMyStartUpStuff() method");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("TennisCoach: inside doMyCleanUpStuff() method");
		//System.out.println(doMyStartUpStuff());
		//return "destroy";
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
