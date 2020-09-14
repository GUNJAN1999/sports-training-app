package com.student.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	//TODO : adding init method
	public void doMyStartUpStuff()
	{
		System.out.println("do my start up stuff");
	}
	//TODO : adding destroy method
	public void doMyCleanUpStuff()
	{
		System.out.println("do my clean up activites");
	}
}










