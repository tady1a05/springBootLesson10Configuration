package com.test.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Coach coach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(coach.doWorkout());
		
	}

}
