package com.zac.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池OutOfMemory.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月3日  下午9:13:45
 */
public class ConstantPoolOOM {

    /**
     * VM Agrs: -XX:PermSize=2M -XX:MaxPermSize=2M.
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        long i = 0; 
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
