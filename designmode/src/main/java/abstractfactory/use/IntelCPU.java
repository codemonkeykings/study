package abstractfactory.use;

/**
 * 因特尔CPU.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:35:34
 */
public class IntelCPU implements CPUApi {
    
    private int point = 0;
    
    public IntelCPU(int point) {
        this.point = point;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU, points = " + point);
    }

}
