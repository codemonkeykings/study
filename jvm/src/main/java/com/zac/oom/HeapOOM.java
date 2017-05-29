package com.zac.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月3日  下午2:20:32
 */
public class HeapOOM {
    
    static class OOMObject {
        private double x;
        private double y;
        /**
         * 获取  x.
         * @return 返回   x
         */
        public double getX() {
            return x;
        }
        /**
         * 设置  x.
         * @param x the x to set
         */
        public void setX(double x) {
            this.x = x;
        }
        /**
         * 获取  y.
         * @return 返回   y
         */
        public double getY() {
            return y;
        }
        /**
         * 设置  y.
         * @param y the y to set
         */
        public void setY(double y) {
            this.y = y;
        }
    }

    /**
     * VM Args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8.
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }

}
