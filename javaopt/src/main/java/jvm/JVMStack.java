package jvm;

/**
 * java 栈空间内存溢出.
 * 
 * <pre>
 * 无参方法递归
 * </pre>
 * 
 * @author Zhang.Ge
 * @version v1.0 2016年11月18日  下午9:57:28
 */
public class JVMStack {

    private int count = 0;

    public void recursion() {
        System.out.println("depp of stack is " + count++);
        recursion();
    }
}
