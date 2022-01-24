package com.test.springboot;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100m";
	}

}
