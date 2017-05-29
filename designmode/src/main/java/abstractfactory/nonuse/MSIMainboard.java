package abstractfactory.nonuse;

/**
 * 微星主板.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:42:19
 */
public class MSIMainboard implements MainboardApi {
    
    private int point = 0;
    
    /**
     * 构造方法.
     */
    public MSIMainboard(int point) {
        this.point = point;
    }

    @Override
    public void installCPU() {
        System.out.println("MSIMainboard,points = " + point);
    }

}
