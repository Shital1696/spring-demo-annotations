package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RandomFortuneService implements FortuneService {
	//create array of strings
	private String data[]= {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"journey is the reward"};
	//random number generator
	Random myRandom=new Random();
	
	
	@Override
	public String getFortune() {
		//pick random string
		int index=myRandom.nextInt(data.length);
		return data[index];
	}

}
