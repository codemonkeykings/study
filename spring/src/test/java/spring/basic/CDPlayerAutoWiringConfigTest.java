package spring.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.basic.CompactDisc;
import spring.config.CDPlayerAutoWiringConfig;

/**
 * Spring Java Config �Զ�װ�������.
 * 
 * @author ZhangGe
 * @version v1.0 2016��11��1��  ����5:03:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerAutoWiringConfig.class)
public class CDPlayerAutoWiringConfigTest {
    
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdCouldNotNull() {
        assertNotNull(cd);
    }
    
    @Test
    public void cdPlay() {
        cd.play();
    }

}
