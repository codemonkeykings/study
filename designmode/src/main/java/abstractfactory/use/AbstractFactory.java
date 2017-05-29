package abstractfactory.use;

/**
 * 抽象工厂类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月31日  下午9:59:44
 */
public interface AbstractFactory {

    public CPUApi createCPUApi();
    
    public MainboardApi createMainBoardApi();
}
