package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.profile.Profiles;
import spring.profile.impl.ProductionProfile;

@Configuration
public class ProductionProfileConfig {

	@Bean
	public Profiles production() {
		return new ProductionProfile();
	}
}
