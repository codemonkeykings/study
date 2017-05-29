package abstractfactory.nonuse;

/**
 * 电脑工程师类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:55:43
 */
public class ComputerEngineer {

    private CPUApi cpu = null;
    
    private MainboardApi mainboard = null;
    
    public void makeComputer(int cpuType, int boardType) {
        prepareHardware(cpuType, boardType);
    }
    
    /**
     * 电脑测试.
     * 
     * @param cpuType  cpu类型
     * @param boardType  主板类型
     */
    private void prepareHardware(int cpuType, int boardType) {
        this.cpu = CPUFactory.createCpu(cpuType);
        this.mainboard = MainBoardFactory.createMainboard(boardType);
        
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
