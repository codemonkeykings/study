package spring.scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.config.NoScopeConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NoScopeConfig.class)
public class SingleNoScopeBeanTest {
	
	@Autowired
	private SingleNoScopeBean singleBean1;
	
	@Autowired
	private SingleNoScopeBean singleBean2;

	@Test
	public void isSingleBean() {
		assertEquals(singleBean1, singleBean2);
	}

}
