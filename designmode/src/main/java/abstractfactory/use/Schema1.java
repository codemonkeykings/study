package abstractfactory.use;

/**
 * 组装方案1.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月31日  下午10:02:26
 */
public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1158);
    }

    @Override
    public MainboardApi createMainBoardApi() {
        return new GAMainboard(1158);
    }

}
