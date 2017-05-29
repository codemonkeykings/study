package com.zac.constantpool;

import java.util.ArrayList;
import java.util.List;

/**
 * 各JDK版本常量池测试.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月4日  下午1:21:03
 */
public class ConstantPool {

    /**
     * -verbose:gc -Xms4M -Xmx4M -Xmn2M -XX:PermSize=2M -XX:MaxPermSize=2M -XX:+PrintGCDetails.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ConstantPool cp = new ConstantPool();
//        cp.simpleTest();
        cp.byMemeoryDump();
    }
    
    /**
     * 简单测试.
     */
    private void simpleTest() {
        String s1 = new String("1");
        String s1_0 = s1.intern();
        String s2 = "1";
        
        System.out.println(s1 == s2);  //jdk6-false, jdk7-false, jdk8-false
        System.out.println(s1_0 == s2);  //true
        
        String s3 = new String("1") + new String("1");
        String s3_0 = s3.intern();
        String s4 = "11";
        
        System.out.println(s3 == s4);  //jdk6-false, jdk7-true, jdk8-true
        System.out.println(s3_0 == s4);  //true
    }
    
    private void byMemeoryDump() {
        List<String> list = new ArrayList<String>();
        long i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
