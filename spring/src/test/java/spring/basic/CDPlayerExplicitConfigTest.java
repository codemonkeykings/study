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
import spring.config.CDPlayerExplicitConfig;

/**
 * Spring Java Config显式配置测试类.
 * 
 * @author ZhangGe
 * @version v1.0 2016年11月3日  下午3:02:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerExplicitConfig.class)
public class CDPlayerExplicitConfigTest {
    
    @Autowired
    private CompactDisc cd;
    
    //@Autowired
    //private CDPlayer cdPlayer;
    
    @Resource(name = "cdPlayer1")
    private CDPlayer cdPlayer;
    
    @Test
    public void cdCouldNotNull() {
        assertNotNull(cd);
    }
    
    @Test
    public void playerCouldNotNull() {
        assertNotNull(cdPlayer);
    }
    
    @Test
    public void playerWorkNormal() {
        cdPlayer.play();
    }

}
