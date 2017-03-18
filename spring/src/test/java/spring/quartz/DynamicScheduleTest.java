package spring.quartz;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import spring.SpringTxCase;
import spring.quartz.schedule.service.IScheduleService;
import spring.quartz.schedule.task.MyTask;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��3��18��  ����1:59:48
 */
public class DynamicScheduleTest extends SpringTxCase {
    
    @Autowired
    private IScheduleService dynamicSchedule;

    @Test
    public void test() {
        try {
            dynamicSchedule.addTask("��һ������", MyTask.class.getName(), "execute", "0/2 * * * * ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(true) {
            
        }
    }

}
