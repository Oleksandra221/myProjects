package com.oleksandra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sasha.spring.annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for a sad fortune service
	@Bean //method name is a bean id
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define a bean for our swim coach and inject dependency
	
	@Bean //method name is a bean id
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
