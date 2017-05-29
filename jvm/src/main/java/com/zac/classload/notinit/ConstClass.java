package com.zac.classload.notinit;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月16日  下午4:05:19
 */
public class ConstClass {

    static {
        System.out.println("ConstClass is init");
    }
    
    public static final String HELLO = "HelloWorld";
}
