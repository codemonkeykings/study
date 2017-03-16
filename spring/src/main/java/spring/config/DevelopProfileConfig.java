package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.profile.Profiles;
import spring.profile.impl.DevelopProfile;

@Configuration
public class DevelopProfileConfig {

	@Bean
	public Profiles develop() {
		return new DevelopProfile();
	}
}
