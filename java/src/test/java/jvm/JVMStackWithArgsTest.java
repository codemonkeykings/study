package jvm;

import org.junit.Test;

/**
 * java 栈空间内存溢出测试类.
 * 
 * <pre>
 * 带参数递归
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2016年11月18日  下午10:02:55
 */
public class JVMStackWithArgsTest {

    @Test
    // jdk1.6 depp of stack is 5440
    // jdk1.8 depp of stack is 4936
    public void testJVMStack() {
        JVMStackWithArgs jvmStackWithArgs = new JVMStackWithArgs();
        jvmStackWithArgs.recursion(1L, 2L, 3L);
    }

}
