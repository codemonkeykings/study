package spring.quartz.schedule.service.impl;

import org.springframework.stereotype.Service;

import spring.quartz.schedule.service.ITestService;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月20日  下午3:34:36
 */
@Service
public class TestService implements ITestService {

    @Override
    public void sayHello() {
        System.out.println("hello ----------------------");
    }

}
