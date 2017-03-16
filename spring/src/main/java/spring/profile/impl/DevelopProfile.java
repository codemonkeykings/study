package spring.profile.impl;

import org.springframework.context.annotation.Profile;

import spring.profile.Profiles;

@Profile("develop")
public class DevelopProfile implements Profiles {
	
	@Override
	public void info() {
		System.out.println("I'm develop profile.");
	}

}
