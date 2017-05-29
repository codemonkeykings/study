package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:42:09
 */
public class AopInterfaceTest extends SpringTxCase {

    @Test
    public void test() {
        IBasicService business = (IBasicService) context.getBean("businessProxy");
        business.delete("123");
    }

}
