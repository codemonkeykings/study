package spring.quartz.schedule.service.impl;

import org.springframework.stereotype.Service;

import spring.quartz.schedule.service.ITestService;

/**
 * һ�仰���ܼ���.
 * 
 * <pre>
 * ������ϸ����
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��3��20��  ����3:34:36
 */
@Service
public class TestService implements ITestService {

    @Override
    public void sayHello() {
        System.out.println("hello ----------------------");
    }

}
