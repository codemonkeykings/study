package spring.quartz.schedule.service;

import java.util.List;
import java.util.Map;

import spring.quartz.schedule.entity.ScheduleTask;

/**
 * 任务调度服务接口.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月17日  下午9:28:25
 */
public interface IScheduleService {

    /**
     * 获取所有任务执行周期设置.
     * 
     * @return
     */
    public Map<String, String> getAllCron();
    
    /**
     * 获取所有调度任务列表.
     * 
     * @return  任务列表
     */
    public List<ScheduleTask> getAllTask();
    
    /**
     * 根据taskId获取调度任务.
     * 
     * @param taskId  任务ID
     * @return  调度任务
     */
    public ScheduleTask getTaskById(String taskId);
    
    /**
     * 添加一个新的调度任务.
     * 
     * @param task  新的调度任务
     * @return 新的调度任务
     */
    public ScheduleTask addTask(ScheduleTask task) throws Exception;
    
    /**
     * 添加一个新的调度任务.
     * 
     * @param taskName 任务名称
     * @param taskClassName  任务执行所在的类名
     * @param triggerName  触发器名称
     * @param cron  执行表达式
     * @return  新增加的调度任务对象
     * @throws Exception  异常
     */
    public ScheduleTask addTask(String taskName, 
                                String taskClassName, 
                                String triggerName, 
                                String cron) throws Exception;
    
    /**
     * 添加一个新的任务调度.
     * 
     * @param taskName  任务名称
     * @param taskGroupName  任务组名称
     * @param taskClassName  任务执行所在的类名
     * @param triggerGroupName  触发器组名称
     * @param triggerName  触发器名称
     * @param cron  执行表达式
     * @return  新增加的调度任务对象
     * @throws Exception  异常
     */
    public ScheduleTask addTask(String taskName, String taskGroupName, 
                                String taskClassName, String triggerGroupName, 
                                String triggerName,  String cron) throws Exception;
    
    /**
     * 根据taskId修改任务调度的执行表达式.
     * 
     * @param taskId  任务ID
     * @param newCron  新的执行表达式
     * @return  被修改的调度任务对象
     */
    public ScheduleTask changeCron(String taskId, String newCron);
    
    /**
     * 根据任务ID删除调度任务（默认任务组、触发器组、触发器名称）.
     * 
     * @param taskId  任务ID
     * @return  被删除的调度任务对象
     */
    public ScheduleTask removeTask(String taskId);
    
    /**
     * 根据taskId重启调度任务.
     * 
     * @param taskId  任务ID
     * @return  被重启的调度任务对象
     */
    public ScheduleTask restartTask(String taskId);
    
    /**
     * 根据taskId暂停任务.
     * 
     * @param taskId  任务ID
     * @return  被暂停的调度任务对象
     */
    public ScheduleTask pauseTask(String taskId);
    
    /**
     * 根据taskId禁用任务.
     * 
     * @param taskId  任务ID
     * @return  被禁用的调度任务对象
     */
    public ScheduleTask disableTask(String taskId);
    
    /**
     * 根据taskId关闭任务.
     * 
     * @param taskId  任务ID
     * @return  被关闭的调度任务对象
     */
    public ScheduleTask shutdownTask(String taskId);
    
    /**
     * 启动所有定时任务.
     */
    public void startAllTask();
    
    /**
     * 关闭所有定时任务.
     */
    public void shutdownAllTask();
}
