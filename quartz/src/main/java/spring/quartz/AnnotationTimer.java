package spring.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ע�ⷽʽ��Timer.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����8:50:29
 */
@Component
public class AnnotationTimer {
    
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0/2 * * * * ?")
    public void execute() {
        log.info("ע�ⷽʽ�Ķ�ʱ����");
    }
}
