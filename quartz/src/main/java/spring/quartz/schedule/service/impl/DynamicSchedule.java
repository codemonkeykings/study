package spring.quartz.schedule.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Scheduler;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import spring.quartz.schedule.entity.ScheduleTask;
import spring.quartz.schedule.proxy.ProxyJob;
import spring.quartz.schedule.service.IScheduleService;

/**
 * ��̬��������.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����9:32:39
 */
@Service
public class DynamicSchedule implements IScheduleService {
    
    @Autowired
    SchedulerFactoryBean schedulerFactory;
    
    /**
     * �������е��������.
     */
    Map<String, ScheduleTask> allTask = new HashMap<String, ScheduleTask>();

    @Override
    public Map<String, String> getAllCron() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ScheduleTask> getAllTask() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask getTaskById(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * ����һ������.
     * 
     * @param taskName  ��������
     * @param taskClassName  ����ִ�е�����
     * @param triggerName  ����������
     * @param cron  ִ�б��ʽ
     * @return  �½�������
     * @throws Exception  �쳣
     */
    private ScheduleTask createTask(String taskName, String taskClassName, 
                                    String triggerName, String cron) throws Exception {
        ScheduleTask task = new ScheduleTask("" + System.currentTimeMillis());
        task.setName(taskName);
        task.setGroup(taskClassName);
        task.setTrigger(taskClassName + "." + triggerName);
        task.setCron(cron);
        return task;
    }

    @Override
    public ScheduleTask addTask(ScheduleTask task) throws Exception {
        Scheduler scheduler = schedulerFactory.getScheduler();
        
        JobDetailImpl taskDeatil = new JobDetailImpl();
        taskDeatil.setName(task.getId());
        taskDeatil.setGroup(task.getGroup());
        taskDeatil.setJobClass(ProxyJob.class);
        CronTriggerImpl trigger = new CronTriggerImpl();
        trigger.setName(task.getId());
        trigger.setGroup(task.getTrigger());
        trigger.setCronExpression(task.getCron());
        
        scheduler.scheduleJob(taskDeatil, trigger);
        if (!scheduler.isShutdown()) {
            scheduler.start();
        }
        if (!allTask.containsKey(task.getId())) {
            allTask.put(task.getId(), task);
        }
        return task;
    }

    @Override
    public ScheduleTask addTask(String taskName, String taskClassName, String triggerName,
                                String cron)
                    throws Exception {
        ScheduleTask task = createTask(taskName, taskClassName, triggerName, cron);
        addTask(task);
        return task;
    }

    @Override
    public ScheduleTask addTask(String taskName, String taskGroupName, String taskClassName,
                                String triggerGroupName, String triggerName, String cron)
                    throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask changeCron(String taskId, String newCron) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask removeTask(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask restartTask(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask pauseTask(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask disableTask(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ScheduleTask shutdownTask(String taskId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void startAllTask() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void shutdownAllTask() {
        // TODO Auto-generated method stub
        
    }

}
