package api;

/**
 * Java7新特性.
 * 
 * @author Zhang.Ge
 * @version v1.0 2016年11月21日  下午9:04:11
 */
public class Java7New {

    /**
     * java7中switch支持字符串的判断.
     * 
     * @param sex  性别
     */
    public static void newSwitch(String sex) {
        switch (sex) {
            case "男":
                //System.out.println("先生，您好！");
                break;
            case "女":
                //System.out.println("女士，您好！");
                break;
            default:
                //System.out.println("您好，请填写信息！");
                break;
        }
    }
    
    /**
     * 针对switch不同类型的表达式值性能测试.
     * 
     * @param i 表达式值
     */
    public static void testSwitch(int i) {
        switch (i) {
            case 0:
                //System.out.println("先生，您好！");
                break;
            case 1:
                //System.out.println("女士，您好！");
                break;
            default:
                //System.out.println("您好，请填写信息！");
                break;
        }
    }
    
    public static void main(String[] args) {
        //newSwitch("男");
        //newSwitch(null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            newSwitch("男");
        }
        long end = System.currentTimeMillis();
        System.out.println("String类型：" + (end - start));
        
        for (int i = 0; i < 1000000000; i++) {
           testSwitch(0);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("int类型：" + (end2 - end));
    }
}
