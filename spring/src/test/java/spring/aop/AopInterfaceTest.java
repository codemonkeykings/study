package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:42:09
 */
public class AopInterfaceTest extends SpringTxCase {

    @Test
    public void test() {
        IBasicService business = (IBasicService) context.getBean("businessProxy");
        business.delete("123");
    }

}
