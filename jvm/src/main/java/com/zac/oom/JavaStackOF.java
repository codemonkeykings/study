package com.zac.oom;

/**
 * java虚拟机栈StackOverflowError.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月3日  下午8:35:33
 */
public class JavaStackOF {
    
    private int stackLength = 1;
    
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    /**
     * VM Args: -Xss128K.
     * 
     * @param args
     */
    public static void main(String[] args) {
        JavaStackOF javaStackOF = new JavaStackOF();
        try {
            javaStackOF.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length:" + javaStackOF.stackLength);
            e.printStackTrace();
        }
    }

}
