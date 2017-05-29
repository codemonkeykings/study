package com.zac.classload.notinit;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月16日  下午3:50:14
 */
public class SuperClass {

    static {
        System.out.println("SuperClass is init");
    }
    
    public static int value = 123;
}
