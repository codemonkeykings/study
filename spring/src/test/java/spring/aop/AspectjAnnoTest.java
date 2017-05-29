package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;
import spring.aop.aspectjanno.Business;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月13日  上午11:17:36
 */
public class AspectjAnnoTest extends SpringTxCase {

    @Test
    public void test() {
        Business business = (Business) context.getBean("business");
        business.delete("猫");
    }

}
