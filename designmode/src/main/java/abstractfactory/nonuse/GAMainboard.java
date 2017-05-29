package abstractfactory.nonuse;

/**
 * 技嘉主板.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:39:33
 */
public class GAMainboard implements MainboardApi {
    
    private int point = 0;
    
    /**
     * 构造方法.
     */
    public GAMainboard(int point) {
        this.point = point;
    }

    @Override
    public void installCPU() {
        System.out.println("GAMainboard,points = " + point);
    }

}
