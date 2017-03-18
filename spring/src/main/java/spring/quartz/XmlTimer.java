package spring.quartz;

import org.slf4j.Logger;

/**
 * Xml配置方式.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月17日  上午8:04:28
 */
public class XmlTimer {

    Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    
    public void execute() {
        log.info("XML配置方式的定时任务");
    }
}
