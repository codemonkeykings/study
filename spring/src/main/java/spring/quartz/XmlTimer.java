package spring.quartz;

import org.slf4j.Logger;

/**
 * Xml���÷�ʽ.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����8:04:28
 */
public class XmlTimer {

    Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    
    public void execute() {
        log.info("XML���÷�ʽ�Ķ�ʱ����");
    }
}
