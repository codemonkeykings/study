package spring.quartz;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import spring.SpringTxCase;
import spring.quartz.schedule.service.IScheduleService;
import spring.quartz.schedule.task.MyTask;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月18日  下午1:59:48
 */
public class DynamicScheduleTest extends SpringTxCase {
    
    @Autowired
    private IScheduleService dynamicSchedule;
    
    @Autowired
    SchedulerFactoryBean schedulerFactoryBean;

    @Test
    public void test() {
        try {
            dynamicSchedule.addTask("第一次任务", MyTask.class.getName(), "execute", "0/2 * * * * ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(true) {
            
        }
    }

}
