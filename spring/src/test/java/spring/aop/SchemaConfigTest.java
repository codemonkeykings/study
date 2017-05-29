package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;
import spring.aop.schemaconfig.AspectBusiness;

/**
 * һ�仰���ܼ���.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��4��13��  ����11:08:25
 */
public class SchemaConfigTest extends SpringTxCase {

    @Test
    public void test() {
        AspectBusiness business = (AspectBusiness) context.getBean("aspectBusiness");
        business.delete("è");
    }

}
