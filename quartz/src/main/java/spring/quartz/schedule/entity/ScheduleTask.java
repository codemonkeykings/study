package spring.quartz.schedule.entity;

/**
 * 调度任务实体.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月17日  下午9:29:18
 */
public class ScheduleTask {

    /**
     * 任务ID.
     */
    private String id;
    /**
     * 父级任务ID.
     */
    private String parentId;
    /**
     * 任务名称.
     */
    private String name;
    /**
     * 任务描述.
     */
    private String description;
    /**
     * 计划执行次数.
     */
    private int planExe = 0;
    /**
     * 任务组名称，规定为执行任务的类全限定名.
     */
    private String group;
    /**
     * 任务组描述.
     */
    private String groupDesc;
    /**
     * 执行表达式.
     */
    private String cron;
    /**
     * 执行表达式描述.
     */
    private String cronDesc;
    /**
     * 触发器名称，规定为任务执行方法全路径描述.
     */
    private String trigger;
    /**
     * 触发器描述.
     */
    private String triggerDesc;
    /**
     * 触发器组名称.
     */
    private String triggerGroup;
    /**
     * 触发器组描述.
     */
    private String triggerGroupDesc;
    /**
     * 任务已执行次数.
     */
    private long executed = 0L;
    /**
     * 最后一次执行时间.
     */
    private long lastExeTime = 0L;
    /**
     * 执行状态，0禁用 1启动 2删除.
     */
    private int state = 1;
    
    public ScheduleTask(String id) {
        this.id = id;
    }
    
    /**
     * 获取  id.
     * @return 返回   id
     */
    public String getId() {
        return id;
    }
    /**
     * 设置  id.
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取  parentId.
     * @return 返回   parentId
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * 设置  parentId.
     * @param parentId the parentId to set
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    /**
     * 获取  name.
     * @return 返回   name
     */
    public String getName() {
        return name;
    }
    /**
     * 设置  name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取  description.
     * @return 返回   description
     */
    public String getDescription() {
        return description;
    }
    /**
     * 设置  description.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * 获取  planExe.
     * @return 返回   planExe
     */
    public int getPlanExe() {
        return planExe;
    }
    /**
     * 设置  planExe.
     * @param planExe the planExe to set
     */
    public void setPlanExe(int planExe) {
        this.planExe = planExe;
    }
    /**
     * 获取  group.
     * @return 返回   group
     */
    public String getGroup() {
        return group;
    }
    /**
     * 设置  group.
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }
    /**
     * 获取  groupDesc.
     * @return 返回   groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }
    /**
     * 设置  groupDesc.
     * @param groupDesc the groupDesc to set
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
    /**
     * 获取  cron.
     * @return 返回   cron
     */
    public String getCron() {
        return cron;
    }
    /**
     * 设置  cron.
     * @param cron the cron to set
     */
    public void setCron(String cron) {
        this.cron = cron;
    }
    /**
     * 获取  cronDesc.
     * @return 返回   cronDesc
     */
    public String getCronDesc() {
        return cronDesc;
    }
    /**
     * 设置  cronDesc.
     * @param cronDesc the cronDesc to set
     */
    public void setCronDesc(String cronDesc) {
        this.cronDesc = cronDesc;
    }
    /**
     * 获取  trigger.
     * @return 返回   trigger
     */
    public String getTrigger() {
        return trigger;
    }
    /**
     * 设置  trigger.
     * @param trigger the trigger to set
     */
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
    /**
     * 获取  triggerDesc.
     * @return 返回   triggerDesc
     */
    public String getTriggerDesc() {
        return triggerDesc;
    }
    /**
     * 设置  triggerDesc.
     * @param triggerDesc the triggerDesc to set
     */
    public void setTriggerDesc(String triggerDesc) {
        this.triggerDesc = triggerDesc;
    }
    /**
     * 获取  triggerGroup.
     * @return 返回   triggerGroup
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }
    /**
     * 设置  triggerGroup.
     * @param triggerGrooup the triggerGroup to set
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
    /**
     * 获取  triggerGroupDesc.
     * @return 返回   triggerGroupDesc
     */
    public String getTriggerGroupDesc() {
        return triggerGroupDesc;
    }
    /**
     * 设置  triggerGroupDesc.
     * @param triggerGroupDesc the triggerGroupDesc to set
     */
    public void setTriggerGroupDesc(String triggerGroupDesc) {
        this.triggerGroupDesc = triggerGroupDesc;
    }
    /**
     * 获取  executed.
     * @return 返回   executed
     */
    public long getExecuted() {
        return executed;
    }
    /**
     * 设置  executed.
     * @param executed the executed to set
     */
    public void setExecuted(long executed) {
        this.executed = executed;
    }
    /**
     * 获取  lastExeTime.
     * @return 返回   lastExeTime
     */
    public long getLastExeTime() {
        return lastExeTime;
    }
    /**
     * 设置  lastExeTime.
     * @param lastExeTime the lastExeTime to set
     */
    public void setLastExeTime(long lastExeTime) {
        this.lastExeTime = lastExeTime;
    }
    /**
     * 获取  state.
     * @return 返回   state
     */
    public int getState() {
        return state;
    }
    /**
     * 设置  state.
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }
}
