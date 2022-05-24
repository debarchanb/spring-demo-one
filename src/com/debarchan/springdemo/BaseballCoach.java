package com.debarchan.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}
}
