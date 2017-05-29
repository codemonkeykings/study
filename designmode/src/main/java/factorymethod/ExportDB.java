package factorymethod;

/**
 *导出数据到数据库.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:30:44
 */
public class ExportDB implements IExportFileApi {

    @Override
    public void export(String data) {
        System.out.println("导出" + data + "到数据库中");
    }

}
