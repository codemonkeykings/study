package jvm;

/**
 * java ջ�ռ��ڴ����.
 * 
 * <pre>
 * ���η����ݹ�
 * </pre>
 * 
 * @author Zhang.Ge
 * @version v1.0 2016��11��18��  ����9:57:28
 */
public class JVMStackWithArgs {

    private int count = 0;

    /**
     * �ݹ鷽��.
     * 
     * @param a  ���Բ���a
     * @param b  ���Բ���b
     * @param c  ���Բ���c
     */
    public void recursion(long a, long b, long c) {
        long d = 0;
        long e = 0;
        long f = 0;
        System.out.println("depp of stack is " + count++);
        recursion(d, e, f);
    }
}
