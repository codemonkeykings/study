package spring.aop.aspectjanno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * һ�仰���ܼ���.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017��4��13��  ����11:15:16
 */
@Component
@Aspect
public class AspectAdvice {

    /**
     * ָ�������ƥ����ʽ��ע�������Է�������ʽ���������ġ�
     */
    @Pointcut("execution(* spring.aop.aspectjanno.*.*(..))")
    public void anyMethod() {
    }

    /**
     * ǰ��֪ͨ
     * 
     * @param jp
     */
    @Before(value = "execution(* spring.aop.aspectjanno.*.*(..))")
    public void doBefore(JoinPoint jp) {
        System.out.println("===========����before advice============ \n");

        System.out.print("׼����" + jp.getTarget().getClass() + "��������");
        System.out.print(jp.getSignature().getName() + "�������ж� '");
        System.out.print(jp.getArgs()[0] + "'����ɾ����\n\n");

        System.out.println("Ҫ��������㷽���� \n");
    }

    /**
     * ����֪ͨ
     * 
     * @param jp
     *            ���ӵ�
     * @param result
     *            ����ֵ
     */
    @AfterReturning(value = "anyMethod()", returning = "result")
    public void doAfter(JoinPoint jp, String result) {
        System.out.println("==========����after advice=========== \n");
        System.out.println("����㷽��ִ������ \n");

        System.out.print(jp.getArgs()[0] + "��");
        System.out.print(jp.getTarget().getClass() + "�����ϱ�");
        System.out.print(jp.getSignature().getName() + "����ɾ����");
        System.out.print("ֻ���£�" + result + "\n\n");
    }

    /**
     * ����֪ͨ
     * 
     * @param pjp
     *            ���ӵ�
     */
    @Around(value = "execution(* spring.aop.aspectjanno.*.*(..))")
    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===========����around���Ʒ�����=========== \n");

        // ����Ŀ�귽��֮ǰִ�еĶ���
        System.out.println("���÷���֮ǰ: ִ�У�\n");

        // ���÷����Ĳ���
        Object[] args = pjp.getArgs();
        // ���õķ�����
        String method = pjp.getSignature().getName();
        // ��ȡĿ�����
        Object target = pjp.getTarget();
        // ִ���귽���ķ���ֵ������proceed()�������ͻᴥ������㷽��ִ��
        Object result = pjp.proceed();

        System.out.println("�����" + args[0] + ";" + method + ";" + target + ";" + result + "\n");
        System.out.println("���÷���������֮��ִ�У�\n");
    }

    /**
     * �쳣֪ͨ
     * 
     * @param jp
     * @param e
     */
    @AfterThrowing(value = "execution(* spring.aop.aspectjanno.*.*(..))", throwing = "e")
    public void doThrow(JoinPoint jp, Throwable e) {
        System.out.println("ɾ��������");
    }
}
