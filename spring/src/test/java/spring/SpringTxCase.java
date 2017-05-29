package spring;


import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月17日  下午8:52:12
 */
public class SpringTxCase {
    
    protected ClassPathXmlApplicationContext context = null;

    /**
     * 加载spring配置.
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

}
