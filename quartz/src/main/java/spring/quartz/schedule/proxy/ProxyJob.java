package spring.quartz.schedule.proxy;

import java.lang.reflect.Method;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

/**
 * quartz job 代理类.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月18日  下午1:03:19
 */
public class ProxyJob implements Job {
    
    public static final String DATA_TARGET_KEY = "target";
    public static final String DATA_TRIGGER_KEY = "trigger";
    public static final String DATA_TRIGGER_PARAM_KEY = "trigger_param";
    public static final String DATA_TASK_KEY = "task";

    @Override
    public void execute(JobExecutionContext ctx) throws JobExecutionException {
        Trigger trigger = ctx.getTrigger();
        if (trigger != null) {
            JobDataMap dataMap = trigger.getJobDataMap();
            Object target = dataMap.get(DATA_TARGET_KEY);
            Method method = (Method) dataMap.get(DATA_TRIGGER_KEY);
            Object[] params = (Object[]) dataMap.get(DATA_TRIGGER_PARAM_KEY);
            
            try {
                method.invoke(target, params);
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
    }

}
