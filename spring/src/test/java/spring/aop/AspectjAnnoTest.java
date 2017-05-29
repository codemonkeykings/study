package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;
import spring.aop.aspectjanno.Business;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��13��  ����11:17:36
 */
public class AspectjAnnoTest extends SpringTxCase {

    @Test
    public void test() {
        Business business = (Business) context.getBean("business");
        business.delete("è");
    }

}
