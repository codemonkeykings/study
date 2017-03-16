package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.profile.Profiles;
import spring.profile.impl.TestProfile;

@Configuration
public class TestProfileConfig {

	@Bean
	public Profiles test() {
		return new TestProfile();
	}
}
