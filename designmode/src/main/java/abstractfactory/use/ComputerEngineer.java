package abstractfactory.use;

/**
 * 电脑工程师类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:55:43
 */
public class ComputerEngineer {

    private CPUApi cpu = null;
    
    private MainboardApi mainboard = null;
    
    public void makeComputer(AbstractFactory schema) {
        prepareHardware(schema);
    }
    
    /**
     * 电脑测试.
     * 
     * @param cpuType  cpu类型
     * @param boardType  主板类型
     */
    private void prepareHardware(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainBoardApi();
        
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
