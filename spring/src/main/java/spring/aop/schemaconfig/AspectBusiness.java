package spring.aop.schemaconfig;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��13��  ����11:01:16
 */
public class AspectBusiness {

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
