package com.zac.classload;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月1日  下午11:01:38
 */
public class Demo3 {
    
    private static Demo3 demo = new Demo3();
    
    private static int a;
    
    private static final int b = 1;
    
    public Demo3() {
        System.out.println(a);
        System.out.println(b);
    }
    
    public static Demo3 getInstance() {
        return demo;
    }

    public static void main(String[] args) {
        Demo3.getInstance();
    }

}
