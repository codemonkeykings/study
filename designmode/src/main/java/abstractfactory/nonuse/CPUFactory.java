package abstractfactory.nonuse;

/**
 * CPU生产工厂.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:46:53
 */
public class CPUFactory {

    public static CPUApi createCpu(int type) {
        CPUApi cpu = null;
        if (type == 1) {
            cpu = new IntelCPU(1158);
        } else if(type == 2) {
            cpu = new AMDCPU(993);
        }
        
        return cpu;
    }
}
