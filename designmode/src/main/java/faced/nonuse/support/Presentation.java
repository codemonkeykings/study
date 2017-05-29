package faced.nonuse.support;

import faced.nonuse.config.ConfigManager;
import faced.nonuse.config.ConfigModel;

/**
 * 表现层生成模块.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:18:03
 */
public class Presentation implements CodeGenerator {

    public void generate() {
        //1.从配置管理器中获取配置数据
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        //2.按照配置信息生成表现层
        if (cm.isNeedGenPresentation()) {
            System.out.println("正在生成表现层代码...");
        }
    }
}
