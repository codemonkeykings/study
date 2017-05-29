package abstractfactory.nonuse;


/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:37:18
 */
public class AMDCPU implements CPUApi {
    
    private int point = 0;
    
    /**
     * 构造方法.
     */
    public AMDCPU(int point) {
        this.point = point;
    }

    @Override
    public void calculate() {
        System.out.println("AMDCPU,points = " + point);
    }

}
