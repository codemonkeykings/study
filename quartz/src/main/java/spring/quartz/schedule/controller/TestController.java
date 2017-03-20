package spring.quartz.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.quartz.schedule.service.IScheduleService;
import spring.quartz.schedule.service.ITestService;
import spring.quartz.schedule.task.MyTask;

/**
 * 一句话功能简述.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月20日  下午3:04:48
 */
@RequestMapping("/test")
@Controller
public class TestController {

    private static final String UI_PATH = "/";
    
    @Autowired
    private ITestService service;
    
    @Autowired
    private IScheduleService dynamicSchedule;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() {
        service.sayHello();
        try {
            dynamicSchedule.addTask("第一次任务", MyTask.class.getName(), "execute", "0/2 * * * * ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UI_PATH + "test";
    }
}
