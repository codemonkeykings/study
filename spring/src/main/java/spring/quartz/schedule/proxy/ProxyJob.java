package spring.quartz.schedule.proxy;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * quartz job 代理类.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月18日  下午1:03:19
 */
public class ProxyJob implements Job {

    @Override
    public void execute(JobExecutionContext ctx) throws JobExecutionException {

    }

}
