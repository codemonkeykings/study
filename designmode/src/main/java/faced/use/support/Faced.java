package faced.use.support;

import faced.nonuse.support.Business;
import faced.nonuse.support.Dao;
import faced.nonuse.support.Presentation;

/**
 * 外观模式对客户端暴露的接口.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月26日  下午2:11:57
 */
public class Faced {

    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }
}
