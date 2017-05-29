package singleton.nonuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * 系统配置（以properties文件为例）.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午4:43:58
 */
public class AppConfig {

    /**
     * 参数A.
     */
    private String parameterA;
    
    /**
     * 参数B.
     */
    private String parameterB;
    
    public AppConfig(String configPath) {
        loadConfig(configPath);
    }
    
    /**
     * 加载配置文件，从类路径下读取.
     * 
     * @param configPath  配置文件名称
     */
    private void loadConfig(String configPath) {
        Properties p = new Properties();
        InputStream in = null;
        try {
            File file = new File(this.getClass().getResource("/" + configPath).getPath());
            in = new FileInputStream(file);
            p.load(in);
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取  parameterA.
     * @return 返回   parameterA
     */
    public String getParameterA() {
        return parameterA;
    }

    /**
     * 设置  parameterA.
     * @param parameterA the parameterA to set
     */
    public void setParameterA(String parameterA) {
        this.parameterA = parameterA;
    }

    /**
     * 获取  parameterB.
     * @return 返回   parameterB
     */
    public String getParameterB() {
        return parameterB;
    }

    /**
     * 设置  parameterB.
     * @param parameterB the parameterB to set
     */
    public void setParameterB(String parameterB) {
        this.parameterB = parameterB;
    }

    @Override
    public String toString() {
        return "[parameterA = " + this.parameterA + " parameterB = " + this.parameterB + "]";
    }
    
}
