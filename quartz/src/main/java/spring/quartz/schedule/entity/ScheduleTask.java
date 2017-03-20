package spring.quartz.schedule.entity;

/**
 * ��������ʵ��.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��3��17��  ����9:29:18
 */
public class ScheduleTask {

    /**
     * ����ID.
     */
    private String id;
    /**
     * ��������ID.
     */
    private String parentId;
    /**
     * ��������.
     */
    private String name;
    /**
     * ��������.
     */
    private String description;
    /**
     * �ƻ�ִ�д���.
     */
    private int planExe = 0;
    /**
     * ���������ƣ��涨Ϊִ���������ȫ�޶���.
     */
    private String group;
    /**
     * ����������.
     */
    private String groupDesc;
    /**
     * ִ�б��ʽ.
     */
    private String cron;
    /**
     * ִ�б��ʽ����.
     */
    private String cronDesc;
    /**
     * ���������ƣ��涨Ϊ����ִ�з���ȫ·������.
     */
    private String trigger;
    /**
     * ����������.
     */
    private String triggerDesc;
    /**
     * ������������.
     */
    private String triggerGroup;
    /**
     * ������������.
     */
    private String triggerGroupDesc;
    /**
     * ������ִ�д���.
     */
    private long executed = 0L;
    /**
     * ���һ��ִ��ʱ��.
     */
    private long lastExeTime = 0L;
    /**
     * ִ��״̬��0���� 1���� 2ɾ��.
     */
    private int state = 1;
    
    public ScheduleTask(String id) {
        this.id = id;
    }
    
    /**
     * ��ȡ  id.
     * @return ����   id
     */
    public String getId() {
        return id;
    }
    /**
     * ����  id.
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * ��ȡ  parentId.
     * @return ����   parentId
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * ����  parentId.
     * @param parentId the parentId to set
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    /**
     * ��ȡ  name.
     * @return ����   name
     */
    public String getName() {
        return name;
    }
    /**
     * ����  name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * ��ȡ  description.
     * @return ����   description
     */
    public String getDescription() {
        return description;
    }
    /**
     * ����  description.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * ��ȡ  planExe.
     * @return ����   planExe
     */
    public int getPlanExe() {
        return planExe;
    }
    /**
     * ����  planExe.
     * @param planExe the planExe to set
     */
    public void setPlanExe(int planExe) {
        this.planExe = planExe;
    }
    /**
     * ��ȡ  group.
     * @return ����   group
     */
    public String getGroup() {
        return group;
    }
    /**
     * ����  group.
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }
    /**
     * ��ȡ  groupDesc.
     * @return ����   groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }
    /**
     * ����  groupDesc.
     * @param groupDesc the groupDesc to set
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
    /**
     * ��ȡ  cron.
     * @return ����   cron
     */
    public String getCron() {
        return cron;
    }
    /**
     * ����  cron.
     * @param cron the cron to set
     */
    public void setCron(String cron) {
        this.cron = cron;
    }
    /**
     * ��ȡ  cronDesc.
     * @return ����   cronDesc
     */
    public String getCronDesc() {
        return cronDesc;
    }
    /**
     * ����  cronDesc.
     * @param cronDesc the cronDesc to set
     */
    public void setCronDesc(String cronDesc) {
        this.cronDesc = cronDesc;
    }
    /**
     * ��ȡ  trigger.
     * @return ����   trigger
     */
    public String getTrigger() {
        return trigger;
    }
    /**
     * ����  trigger.
     * @param trigger the trigger to set
     */
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
    /**
     * ��ȡ  triggerDesc.
     * @return ����   triggerDesc
     */
    public String getTriggerDesc() {
        return triggerDesc;
    }
    /**
     * ����  triggerDesc.
     * @param triggerDesc the triggerDesc to set
     */
    public void setTriggerDesc(String triggerDesc) {
        this.triggerDesc = triggerDesc;
    }
    /**
     * ��ȡ  triggerGroup.
     * @return ����   triggerGroup
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }
    /**
     * ����  triggerGroup.
     * @param triggerGrooup the triggerGroup to set
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
    /**
     * ��ȡ  triggerGroupDesc.
     * @return ����   triggerGroupDesc
     */
    public String getTriggerGroupDesc() {
        return triggerGroupDesc;
    }
    /**
     * ����  triggerGroupDesc.
     * @param triggerGroupDesc the triggerGroupDesc to set
     */
    public void setTriggerGroupDesc(String triggerGroupDesc) {
        this.triggerGroupDesc = triggerGroupDesc;
    }
    /**
     * ��ȡ  executed.
     * @return ����   executed
     */
    public long getExecuted() {
        return executed;
    }
    /**
     * ����  executed.
     * @param executed the executed to set
     */
    public void setExecuted(long executed) {
        this.executed = executed;
    }
    /**
     * ��ȡ  lastExeTime.
     * @return ����   lastExeTime
     */
    public long getLastExeTime() {
        return lastExeTime;
    }
    /**
     * ����  lastExeTime.
     * @param lastExeTime the lastExeTime to set
     */
    public void setLastExeTime(long lastExeTime) {
        this.lastExeTime = lastExeTime;
    }
    /**
     * ��ȡ  state.
     * @return ����   state
     */
    public int getState() {
        return state;
    }
    /**
     * ����  state.
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }
}
