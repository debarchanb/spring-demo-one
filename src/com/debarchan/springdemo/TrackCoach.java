package com.debarchan.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it" +fortuneService.getFortune();
	}

}
