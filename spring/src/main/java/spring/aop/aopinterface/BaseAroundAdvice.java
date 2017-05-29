package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:25:43
 */
public class BaseAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("正在进入around advice");
        
        // 调用目标方法之前执行的动作
        System.out.println("调用方法之前: 执行！\n");

        // 调用方法的参数
        Object[] args = invocation.getArguments();
        // 调用的方法
        Method method = invocation.getMethod();
        // 获取目标对象
        Object target = invocation.getThis();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        Object returnValue = invocation.proceed();

        System.out.println("===========结束进入around环绕方法！=========== \n");

        System.out.println("输出：" + args[0] + ";" + method + ";" + target + ";" + returnValue + "\n");

        System.out.println("调用方法结束：之后执行！\n");

        return returnValue;
    }

}
