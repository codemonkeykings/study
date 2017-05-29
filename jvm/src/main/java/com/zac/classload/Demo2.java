package com.zac.classload;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月1日  下午11:01:38
 */
public class Demo2 {
    
    
    private static int a;
    
    private static int b = 1;
    
    private static Demo2 demo = new Demo2();
    
    public Demo2() {
        System.out.println(a++);
        System.out.println(b++);
    }
    
    public static Demo2 getInstance() {
        return demo;
    }

    public static void main(String[] args) {
        Demo2.getInstance();
    }

}
