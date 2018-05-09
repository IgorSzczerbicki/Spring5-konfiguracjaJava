package com.nauka.spring5.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationApp {

	public static void main(String[] args) {
		//wczytanie klasy konfiguracji
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		//zaladowanie z kontenera
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//wywolanie metod na Beanie
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		//zamkniecie kotekstu
		context.close();
	}
}