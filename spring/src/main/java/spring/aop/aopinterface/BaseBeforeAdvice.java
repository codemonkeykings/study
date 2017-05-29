package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * һ�仰���ܼ���.
 * 
 * <pre>
 * ������ϸ����
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:15:24
 */
public class BaseBeforeAdvice implements MethodBeforeAdvice {

    /**
     * @param method ����ķ���
     * @param args  ���뷽���Ĳ���
     * @param target  Ŀ�����
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("���ڽ���before advice");
        
        System.out.println("׼������" + target + "����");
    }
    
}
