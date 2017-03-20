package spring.quartz.schedule.service;

import java.util.List;
import java.util.Map;

import spring.quartz.schedule.entity.ScheduleTask;

/**
 * ������ȷ���ӿ�.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����9:28:25
 */
public interface IScheduleService {

    /**
     * ��ȡ��������ִ����������.
     * 
     * @return
     */
    public Map<String, String> getAllCron();
    
    /**
     * ��ȡ���е��������б�.
     * 
     * @return  �����б�
     */
    public List<ScheduleTask> getAllTask();
    
    /**
     * ����taskId��ȡ��������.
     * 
     * @param taskId  ����ID
     * @return  ��������
     */
    public ScheduleTask getTaskById(String taskId);
    
    /**
     * ���һ���µĵ�������.
     * 
     * @param task  �µĵ�������
     * @return �µĵ�������
     */
    public ScheduleTask addTask(ScheduleTask task) throws Exception;
    
    /**
     * ���һ���µĵ�������.
     * 
     * @param taskName ��������
     * @param taskClassName  ����ִ�����ڵ�����
     * @param triggerName  ����������
     * @param cron  ִ�б��ʽ
     * @return  �����ӵĵ����������
     * @throws Exception  �쳣
     */
    public ScheduleTask addTask(String taskName, 
                                String taskClassName, 
                                String triggerName, 
                                String cron) throws Exception;
    
    /**
     * ���һ���µ��������.
     * 
     * @param taskName  ��������
     * @param taskGroupName  ����������
     * @param taskClassName  ����ִ�����ڵ�����
     * @param triggerGroupName  ������������
     * @param triggerName  ����������
     * @param cron  ִ�б��ʽ
     * @return  �����ӵĵ����������
     * @throws Exception  �쳣
     */
    public ScheduleTask addTask(String taskName, String taskGroupName, 
                                String taskClassName, String triggerGroupName, 
                                String triggerName,  String cron) throws Exception;
    
    /**
     * ����taskId�޸�������ȵ�ִ�б��ʽ.
     * 
     * @param taskId  ����ID
     * @param newCron  �µ�ִ�б��ʽ
     * @return  ���޸ĵĵ����������
     */
    public ScheduleTask changeCron(String taskId, String newCron);
    
    /**
     * ��������IDɾ����������Ĭ�������顢�������顢���������ƣ�.
     * 
     * @param taskId  ����ID
     * @return  ��ɾ���ĵ����������
     */
    public ScheduleTask removeTask(String taskId);
    
    /**
     * ����taskId������������.
     * 
     * @param taskId  ����ID
     * @return  �������ĵ����������
     */
    public ScheduleTask restartTask(String taskId);
    
    /**
     * ����taskId��ͣ����.
     * 
     * @param taskId  ����ID
     * @return  ����ͣ�ĵ����������
     */
    public ScheduleTask pauseTask(String taskId);
    
    /**
     * ����taskId��������.
     * 
     * @param taskId  ����ID
     * @return  �����õĵ����������
     */
    public ScheduleTask disableTask(String taskId);
    
    /**
     * ����taskId�ر�����.
     * 
     * @param taskId  ����ID
     * @return  ���رյĵ����������
     */
    public ScheduleTask shutdownTask(String taskId);
    
    /**
     * �������ж�ʱ����.
     */
    public void startAllTask();
    
    /**
     * �ر����ж�ʱ����.
     */
    public void shutdownAllTask();
}
