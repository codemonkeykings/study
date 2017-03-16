package cache;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * java Buffer API�ڲ���.
 *  
 * @author Zhang.Ge
 * @version v1.0 2016��11��18��  ����9:55:59
 */
public class TestBuffer {

    /**
     * ������.
     * 
     * @param args ��������
     * @throws Exception  �쳣
     */
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(
                        new BufferedOutputStream(
                                        new FileOutputStream("test.txt")));
        out.writeUTF("helloworld");
        // out.flush(); //���û�д���䣨��out.close()���������System.out.println(data);��������κ���Ϣ

        FileInputStream in = new FileInputStream("test.txt");
        int len = in.available();
        byte[] b = new byte[len];
        in.read(b);
        String data = new String(b);
        in.close();
        System.out.println(data);
    }

}
