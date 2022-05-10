package com.oleksandra;


import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "You will have the best day of your life:)";
	}

}
