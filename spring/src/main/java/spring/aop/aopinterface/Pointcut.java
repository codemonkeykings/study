package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:29:09
 */
public class Pointcut extends NameMatchMethodPointcut {

    /** ���壬Ŀ�ĺ͹��ܣ��Լ����õ��ĵط�. */
    private static final long serialVersionUID = 1653777943376031128L;

    @SuppressWarnings("rawtypes")
    @Override
    public boolean matches(Method method, Class targetClass) {
        // ���õ�������ƥ��
        this.setMappedName("delete");
        // ���ö������ƥ��
        String[] methods = { "delete", "modify" };

        //Ҳ�����á� * �� ����ƥ�����
        // this.setMappedName("get*");

        this.setMappedNames(methods);

        return super.matches(method, targetClass);
    }
}
