package spring.aop;

/**
 * һ�仰���ܼ���.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017��4��12��  ����11:12:34
 */
public class BasicService implements IBasicService {

    @Override
    public void delete(String data) {
        System.out.println("����ִ��ɾ��" + data);
    }

    @Override
    public void update(String data) {
        System.out.println("����ִ�и���" + data);
    }

    @Override
    public void insert(String data) {
        System.out.println("����ִ�в���" + data);
    }

}
