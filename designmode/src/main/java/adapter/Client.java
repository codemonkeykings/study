package adapter;

import adapter.demo.Adaptee;
import adapter.demo.Adapter;
import adapter.demo.Target;

/**
 * 客户端.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午3:09:45
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}