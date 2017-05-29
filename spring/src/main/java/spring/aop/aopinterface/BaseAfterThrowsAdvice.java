package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * 一句话功能简述.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:28:10
 */
public class BaseAfterThrowsAdvice implements ThrowsAdvice {

    /**
     * 通知方法，需要按照这种格式书写
     * 
     * @param method
     *            可选：切入的方法
     * @param args
     *            可选：切入的方法的参数
     * @param target
     *            可选：目标对象
     * @param throwable
     *            必填 : 异常子类，出现这个异常类的子类，则会进入这个通知。
     */
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
        System.out.println("删除出错啦");
    }
}
