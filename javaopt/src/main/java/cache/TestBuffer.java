package cache;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * java Buffer API口测试.
 *  
 * @author Zhang.Ge
 * @version v1.0 2016年11月18日  下午9:55:59
 */
public class TestBuffer {

    /**
     * 主函数.
     * 
     * @param args 参数数组
     * @throws Exception  异常
     */
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(
                        new BufferedOutputStream(
                                        new FileOutputStream("test.txt")));
        out.writeUTF("helloworld");
        // out.flush(); //如果没有此语句（或out.close()）则下面的System.out.println(data);不会输出任何信息

        FileInputStream in = new FileInputStream("test.txt");
        int len = in.available();
        byte[] b = new byte[len];
        in.read(b);
        String data = new String(b);
        in.close();
        System.out.println(data);
    }

}
