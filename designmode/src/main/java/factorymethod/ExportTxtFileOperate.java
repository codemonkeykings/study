package factorymethod;

/**
 * 导出到txt文件的操作类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:47:22
 */
public class ExportTxtFileOperate extends ExportOperate {

    @Override
    public IExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }

}
