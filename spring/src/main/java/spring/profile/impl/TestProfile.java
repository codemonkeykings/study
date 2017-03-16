package spring.profile.impl;

import org.springframework.context.annotation.Profile;

import spring.profile.Profiles;

@Profile("test")
public class TestProfile implements Profiles {
	
	@Override
	public void info() {
		System.out.println("I'm test profile.");
	}

}
