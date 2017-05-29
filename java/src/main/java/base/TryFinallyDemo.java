package base;

/**
 * 一句话功能简述.
 * 
 * <pre>
 * 功能详细描述
 * </pre>
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年4月13日  下午10:48:10
 */
public class TryFinallyDemo {

    /**
     * TODO:方法简介.
     * 
     * @param args  入口参数
     */
    public static void main(String[] args) {
        System.out.println(test());
    }
    
    /**
     * 测试方法.
     * 
     * @return  int
     */
    public static int test() {
        int x;
        try {
            x = 1 / 0;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
            System.out.println("finally");
        }
    }

}
