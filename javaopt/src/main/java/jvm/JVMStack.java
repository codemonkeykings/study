package jvm;

/**
 * java ջ�ռ��ڴ����.
 * 
 * <pre>
 * �޲η����ݹ�
 * </pre>
 * 
 * @author Zhang.Ge
 * @version v1.0 2016��11��18��  ����9:57:28
 */
public class JVMStack {

    private int count = 0;

    public void recursion() {
        System.out.println("depp of stack is " + count++);
        recursion();
    }
}
