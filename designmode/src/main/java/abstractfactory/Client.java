package abstractfactory;

import abstractfactory.use.ComputerEngineer;
import abstractfactory.use.AbstractFactory;
import abstractfactory.use.Schema1;

/**
 * 客户端.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:59:49
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
//        engineer.makeComputer(1, 1);
//        engineer.makeComputer(2, 2);
//        engineer.makeComputer(1, 2);
        AbstractFactory schema1 = new Schema1();
        engineer.makeComputer(schema1);
    }

}
