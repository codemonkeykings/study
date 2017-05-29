package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:15:24
 */
public class BaseBeforeAdvice implements MethodBeforeAdvice {

    /**
     * @param method 切入的方法
     * @param args  切入方法的参数
     * @param target  目标对象
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("正在进入before advice");
        
        System.out.println("准备切入" + target + "对象");
    }
    
}
