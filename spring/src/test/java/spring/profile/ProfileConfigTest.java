package spring.profile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.config.DevelopProfileConfig;
import spring.config.ProductionProfileConfig;
import spring.config.TestProfileConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={
		DevelopProfileConfig.class,
		ProductionProfileConfig.class,
		TestProfileConfig.class})
@ActiveProfiles("test")
public class ProfileConfigTest {
	
	@Autowired
	private Profiles profile;
	
	@Test
	public void developCouldNotNull() {
		assertNotNull(profile);
	}

}
