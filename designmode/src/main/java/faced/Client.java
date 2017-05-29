package faced;

import faced.nonuse.support.Business;
import faced.nonuse.support.Dao;
import faced.nonuse.support.Presentation;
import faced.use.support.Faced;

/**
 * 客户端模块.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:28:56
 */
public class Client {

    public static void main(String[] args) {
        //未使用外观模式，使用默认配置，因此三层都要生成,客户端需要对这三层都有了解才行
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
        //使用外观模式
        Faced faced = new Faced();
        faced.generate();
    }
}
