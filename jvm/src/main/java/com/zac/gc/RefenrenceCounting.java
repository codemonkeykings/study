package com.zac.gc;

/**
 * 引用计数法.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月4日  下午9:42:17
 */
public class RefenrenceCounting {
    
    private Object instacnce = null;
    
    private static final int _1MB = 1024 * 1024;
    
    private byte[] bigSize = new byte[2 * _1MB];

    /**
     * TODO:方法简介.
     * 
     * @param args
     */
    public static void main(String[] args) {
        RefenrenceCounting rc1 = new RefenrenceCounting();
        RefenrenceCounting rc2 = new RefenrenceCounting();
        rc1.instacnce = rc2;
        rc2.instacnce = rc1;
        
        rc1 = null;
        rc2 = null;
        
        System.gc();
    }
    
    

}
