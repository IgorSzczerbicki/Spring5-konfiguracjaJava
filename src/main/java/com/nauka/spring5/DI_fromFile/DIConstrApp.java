package com.nauka.spring5.DI_fromFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIConstrApp {

	public static void main(String[] args) {
		//zaladowanie klasy konfiguracji
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//pobranie Bean'u z kontekstu
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//wywolanie metod
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		//zamkniecie kontekstu
		context.close();
	}
}