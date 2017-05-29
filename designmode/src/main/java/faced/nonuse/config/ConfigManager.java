package faced.nonuse.config;

/**
 * 负责读取代码生成配置.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:13:07
 */
public class ConfigManager {

    private static ConfigManager manager = null;
    private static ConfigModel model = null;
    
    private ConfigManager(){}
    
    /**
     * 生成配置管理工具，单例模式.
     * 
     * @return  管理对象
     */
    public static ConfigManager getInstance() {
        if (manager == null) {
            manager = new ConfigManager();
            model = new ConfigModel();
        }
        return manager;
    }
    
    /**
     * 获取代码生成配置数据.
     * 
     * @return  配置数据对象
     */
    public ConfigModel getConfigData() {
        return model;
    }
}
