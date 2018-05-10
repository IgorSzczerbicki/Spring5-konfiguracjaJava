package com.nauka.spring5.DI_fromFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.title}")
	private String title;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTitle() {
		return title;
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