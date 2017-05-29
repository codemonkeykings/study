package com.zac.classload.notinit;

/**
 * 被动引用的例子.
 * 
 * <pre>
 * 1.对于静态字段，只有直接定义这个字段的类才会被初始化,但是否加载和验证视具体虚拟机实现
 *   在HotSpot虚拟机中，可以使用-XX:+TraceClassLoading参数观察
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月16日  下午3:52:53
 */
public class NotInitialization {

    /**
     * 测试入口.
     * 
     * @param args
     */
    public static void main(String[] args) {
        //子类访问父类的静态属性，子类不被初始化
        System.out.println(SubClass.value);
        //通过数组定义来引用类，类不被初始化
        SuperClass[] scs = new SuperClass[10];
        //访问类中的静态常量,在编译期间，常量的值已经存入了NotInitialization类的常量池中了
        System.out.println(ConstClass.HELLO);
    }

}
