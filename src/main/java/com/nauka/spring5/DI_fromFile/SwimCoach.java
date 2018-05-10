package com.nauka.spring5.DI_fromFile;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Trening p³ywacki";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}