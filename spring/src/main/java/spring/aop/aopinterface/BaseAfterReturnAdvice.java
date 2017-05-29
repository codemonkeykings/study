package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:20:07
 */
public class BaseAfterReturnAdvice implements AfterReturningAdvice {

    /**
     * @param returnValue  切入点执行完方法的返回值
     * @param method  切入点方法
     * @param args  切入点方法的参数
     * @param target  目标对象
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
                    throws Throwable {
        System.out.println("正在进入afterReturning");

        System.out.println("准备作用于" + target + "对象上");
    }

}
