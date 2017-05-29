package faced.extend.server;

/**
 * 外观.
 * 
 * <pre>选择性的对客户端模块暴露接口</pre>
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午2:27:19
 */
public class Faced {

    public void aApi1() {
        new AModule().api1();
    }
    
    public void bApi1() {
        new BModule().api1();
    }
    
    public void cApi1() {
        new CModule().api1();
    }
}
