package abstractfactory.use;

/**
 * 组装方案2.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月31日  下午10:03:08
 */
public class Schema2 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(993);
    }

    @Override
    public MainboardApi createMainBoardApi() {
        return new MSIMainboard(993);
    }

}
