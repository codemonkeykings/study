package spring.aop.aopinterface;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:29:09
 */
public class Pointcut extends NameMatchMethodPointcut {

    /** 意义，目的和功能，以及被用到的地方. */
    private static final long serialVersionUID = 1653777943376031128L;

    @SuppressWarnings("rawtypes")
    @Override
    public boolean matches(Method method, Class targetClass) {
        // 设置单个方法匹配
        this.setMappedName("delete");
        // 设置多个方法匹配
        String[] methods = { "delete", "modify" };

        //也可以用“ * ” 来做匹配符号
        // this.setMappedName("get*");

        this.setMappedNames(methods);

        return super.matches(method, targetClass);
    }
}
