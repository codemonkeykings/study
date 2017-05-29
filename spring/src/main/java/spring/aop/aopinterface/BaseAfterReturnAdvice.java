package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:20:07
 */
public class BaseAfterReturnAdvice implements AfterReturningAdvice {

    /**
     * @param returnValue  �����ִ���귽���ķ���ֵ
     * @param method  ����㷽��
     * @param args  ����㷽���Ĳ���
     * @param target  Ŀ�����
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
                    throws Throwable {
        System.out.println("���ڽ���afterReturning");

        System.out.println("׼��������" + target + "������");
    }

}
