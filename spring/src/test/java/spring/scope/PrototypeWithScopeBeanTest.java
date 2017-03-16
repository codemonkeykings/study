package spring.scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.config.WithScopeConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WithScopeConfig.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PrototypeWithScopeBeanTest {
	
	@Autowired
	private PrototypeWithScopeBean prototypeBean1;
	
	@Autowired
	private PrototypeWithScopeBean prototypeBean2; 

	@Test
	public void isNotSameObject() {
		assertNotEquals(prototypeBean1, prototypeBean2);
	}

}
