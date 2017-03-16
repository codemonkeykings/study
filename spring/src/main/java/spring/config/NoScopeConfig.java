package spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import spring.scope.PrototypeNoScopeBean;
import spring.scope.SingleNoScopeBean;

@Configuration
public class NoScopeConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SingleNoScopeBean singleBean() {
		return new SingleNoScopeBean();
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PrototypeNoScopeBean prototypeBean() {
		return new PrototypeNoScopeBean();
	}
}
