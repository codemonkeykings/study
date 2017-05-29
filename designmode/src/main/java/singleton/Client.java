package singleton;

import singleton.nonuse.AppConfig;
import singleton.use.BadmashAppConfig;
import singleton.use.LazyAppConfig;

/**
 * 客户端.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午4:52:01
 */
public class Client {

    public static void main(String[] args) {
        String configFile = "appconfig.properties";
        AppConfig config = new AppConfig(configFile);
        System.out.println(config);
        
        LazyAppConfig config2 = LazyAppConfig.getInstance(configFile);
        System.out.println(config2);
        
        BadmashAppConfig config3 = BadmashAppConfig.getInstance();
        System.out.println(config3);
    }

}
