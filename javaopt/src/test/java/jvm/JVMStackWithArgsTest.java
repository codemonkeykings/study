package jvm;

import org.junit.Test;

/**
 * java ջ�ռ��ڴ����������.
 * 
 * <pre>
 * �������ݹ�
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2016��11��18��  ����10:02:55
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
