package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.scope.PrototypeWithScopeBean;
import spring.scope.SingleWithScopeBean;

@Configuration
public class WithScopeConfig {

	@Bean
	public SingleWithScopeBean singleBean() {
		return new SingleWithScopeBean();
	}
	
	@Bean
	public PrototypeWithScopeBean prototypeBean() {
		return new PrototypeWithScopeBean();
	}
}
