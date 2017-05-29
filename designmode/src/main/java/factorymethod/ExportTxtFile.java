package factorymethod;

/**
 * 导出数据到TXT文件中.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:30:25
 */
public class ExportTxtFile implements IExportFileApi {

    @Override
    public void export(String data) {
        System.out.println("导出" + data + "到TXT文件中");
    }

}
