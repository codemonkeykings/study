package spring.condition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.config.MagicBeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfig.class)
public class MagicBeanCoditionTest {
	
	@Autowired
	private MagicBean bean;

	//MagicExistsCondition.class 中mantch方法返回false时
	@Test
	public void beanCouldBeNull() {
		assertNotNull(bean);
	}
	
	@Test
	public void beanCouldNotNull() {
		assertNotNull(bean);
	}

}
