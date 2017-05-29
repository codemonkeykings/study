package spring;


import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����8:52:12
 */
public class SpringTxCase {
    
    protected ClassPathXmlApplicationContext context = null;

    /**
     * ����spring����.
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

}
