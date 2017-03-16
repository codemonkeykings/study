package spring.profile.impl;

import org.springframework.context.annotation.Profile;

import spring.profile.Profiles;

@Profile("production")
public class ProductionProfile implements Profiles{
	
	@Override
	public void info() {
		System.out.println("I'm Production profile.");
	}

}
