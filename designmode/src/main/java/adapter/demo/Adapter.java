package adapter.demo;

/**
 * 适配器类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午3:03:16
 */
public class Adapter implements Target {
    
    private Adaptee adaptee;
    
    /**
     * 构造方法.
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }

}
