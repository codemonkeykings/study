package factorymethod;

/**
 * 客户端.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:48:54
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate txtOpt = new ExportTxtFileOperate();
        txtOpt.export("123");
        ExportOperate dbOpt = new ExportDBOperate();
        dbOpt.export("123");
    }

}
