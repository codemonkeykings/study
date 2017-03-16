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
public class SingleWithScopeBeanTest {
	
	@Autowired
	private SingleWithScopeBean singleBean1;
	
	@Autowired
	private SingleWithScopeBean singleBean2;

	@Test
	public void isSingleBean() {
		assertEquals(singleBean1, singleBean2);
	}

}
