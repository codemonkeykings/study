package jvm;

/**
 * java 栈空间内存溢出.
 * 
 * <pre>
 * 带参方法递归
 * </pre>
 * 
 * @author Zhang.Ge
 * @version v1.0 2016年11月18日  下午9:57:28
 */
public class JVMStackWithArgs {

    private int count = 0;

    /**
     * 递归方法.
     * 
     * @param a  测试参数a
     * @param b  测试参数b
     * @param c  测试参数c
     */
    public void recursion(long a, long b, long c) {
        long d = 0;
        long e = 0;
        long f = 0;
        System.out.println("depp of stack is " + count++);
        recursion(d, e, f);
    }
}
