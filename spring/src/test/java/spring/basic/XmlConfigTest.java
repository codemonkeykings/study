package spring.basic;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.basic.CompactDisc;
import spring.basic.impl.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class XmlConfigTest {
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Resource(name = "sgtPeppers_c")
	private CompactDisc sgtPeppers_c;
	
	@Resource(name = "sgtPeppers_cr")
	private CompactDisc sgtPeppers_cr;
	
	@Resource(name = "sgtPeppers_cre")
	private CompactDisc sgtPeppers_cre;
	
	@Resource(name = "sgtPeppers_p")
	private CompactDisc sgtPeppers_p;
	
	@Resource(name = "sgtPeppers_pr")
	private CompactDisc sgtPeppers_pr;

	@Test
	public void cdPlayerCouldNotNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void cdPlayerWorkNormal() {
		cdPlayer.play();
	}
	
	@Test
	public void sgtPeppers_cIsLegal() {
		sgtPeppers_c.play();
	}
	
	@Test
	public void sgtPeppers_crIsLegal() {
		sgtPeppers_cr.play();
	}
	
	@Test
	public void sgtPeppers_creIsLegal() {
		sgtPeppers_cre.play();
	}
	
	@Test
	public void sgtPeppers_pIsLegal() {
		sgtPeppers_p.play();
	}
	
	@Test
	public void sgtPeppers_prIsLegal() {
		sgtPeppers_pr.play();
	}

}
