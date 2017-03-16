package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import spring.condition.MagicBean;
import spring.condition.MagicExistsCondition;

@Configuration
public class MagicBeanConfig {

	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean() {
		return new MagicBean();
	}
}
