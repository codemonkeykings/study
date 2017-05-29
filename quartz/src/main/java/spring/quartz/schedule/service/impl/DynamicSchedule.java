package spring.quartz.schedule.service.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Scheduler;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import spring.quartz.schedule.entity.ScheduleTask;
import spring.quartz.schedule.proxy.ProxyJob;
import spring.quartz.schedule.service.IScheduleService;

/**
 * 动态调度任务.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月17日  下午9:32:39
 */
@Service
public class DynamicSchedule implements IScheduleService {
    
    @Autowired
    SchedulerFactoryBean schedulerFactory;
    
    /**
     * 保存所有的任务对象.
     */
    Map<String, ScheduleTask> allTask = new HashMap<String, ScheduleTask>();

    @Override
    public Map<String, String> getAllCron() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ScheduleTask> getAllTask() {
        List<ScheduleTask> allTaskList = new ArrayList<ScheduleTask>();
        allTaskList.addAll(allTask.values());
        return allTaskList;
    }

    @Override
    public ScheduleTask getTaskById(String taskId) {
        return allTask.get(taskId);
    }
    
    /**
     * 创建一个任务.
     * 
     * @param taskName  任务名称
     * @param taskClassName  任务执行的类名
     * @param triggerName  触发器名称
     * @param cron  执行表达式
     * @return  新建的任务
     * @throws Exception  异常
     */
    private ScheduleTask createTask(Method m) throws Exception {
        ScheduleTask task = new ScheduleTask("" + System.currentTimeMillis());
        String taskClassName = m.getDeclaringClass().getName();
        task.setGroup(taskClassName);
        task.setTrigger(taskClassName + "." + m.getName());
        Annotation annotation = m.getAnnotation(Scheduled.class);
        Method getCron = annotation.getClass().getMethod("corn");
        String cron = getCron.invoke(annotation).toString();
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
        
        Class<?> clazz = Class.forName(task.getGroup());
        Method method = clazz.getMethod(task.getTrigger().substring(task.getTrigger().lastIndexOf(".") + 1));
        method.getAnnotation(Scheduled.class);
        trigger.getJobDataMap().put(ProxyJob.DATA_TARGET_KEY, clazz.newInstance());
        trigger.getJobDataMap().put(ProxyJob.DATA_TRIGGER_KEY, method);
        trigger.getJobDataMap().put(ProxyJob.DATA_TRIGGER_PARAM_KEY, new Object[]{});
        trigger.getJobDataMap().put(ProxyJob.DATA_TASK_KEY, task);
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
        Class<?> clazz = Class.forName(taskClassName);
        Method method = clazz.getMethod(triggerName);
        ScheduleTask task = createTask(method);
        task.setName(taskName);
        task.setCron(cron);
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
