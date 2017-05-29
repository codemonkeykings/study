package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * һ�仰���ܼ���.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:28:10
 */
public class BaseAfterThrowsAdvice implements ThrowsAdvice {

    /**
     * ֪ͨ��������Ҫ�������ָ�ʽ��д
     * 
     * @param method
     *            ��ѡ������ķ���
     * @param args
     *            ��ѡ������ķ����Ĳ���
     * @param target
     *            ��ѡ��Ŀ�����
     * @param throwable
     *            ���� : �쳣���࣬��������쳣������࣬���������֪ͨ��
     */
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
        System.out.println("ɾ��������");
    }
}
