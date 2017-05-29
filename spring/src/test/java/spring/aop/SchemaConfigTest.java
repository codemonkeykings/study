package spring.aop;

import org.junit.Test;

import spring.SpringTxCase;
import spring.aop.schemaconfig.AspectBusiness;

/**
 * 一句话功能简述.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月13日  上午11:08:25
 */
public class SchemaConfigTest extends SpringTxCase {

    @Test
    public void test() {
        AspectBusiness business = (AspectBusiness) context.getBean("aspectBusiness");
        business.delete("猫");
    }

}
