package spring.aop.aspectjanno;

import org.springframework.stereotype.Component;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��13��  ����11:14:42
 */
@Component
public class Business {
    /**
     * �����
     */
    public String delete(String obj) {
        System.out.println("==========��������㣺" + obj + "˵�����ɾ���ң�===========\n");
        return obj + "���顫";
    }

    public String add(String obj) {
        System.out.println("================����������ܱ��С�����============== \n");
        return obj + "���顫 �ٺ٣�";
    }

    public String modify(String obj) {
        System.out.println("=================���Ҳ���ü����а�====================\n");
        return obj + "������鰡��";
    }
}
