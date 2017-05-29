package faced.nonuse.support;

import faced.nonuse.config.ConfigManager;
import faced.nonuse.config.ConfigModel;

/**
 * 业务层生成模块.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:21:48
 */
public class Business implements CodeGenerator {

    @Override
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenBusiness()) {
            System.out.println("正在生成业务层代码...");
        }
    }

    
}
