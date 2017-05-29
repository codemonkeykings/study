package spring.aop;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月12日  上午11:12:34
 */
public class BasicService implements IBasicService {

    @Override
    public void delete(String data) {
        System.out.println("正在执行删除" + data);
    }

    @Override
    public void update(String data) {
        System.out.println("正在执行更新" + data);
    }

    @Override
    public void insert(String data) {
        System.out.println("正在执行插入" + data);
    }

}
