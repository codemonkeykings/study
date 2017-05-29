package faced.nonuse.support;

import faced.nonuse.config.ConfigManager;
import faced.nonuse.config.ConfigModel;

/**
 * 数据层生成模块.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:26:56
 */
public class Dao implements CodeGenerator {

    @Override
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenDao()) {
            System.out.println("正在生成数据层代码...");
        }
    }

}
