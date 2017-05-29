package factorymethod;

/**
 * 导出到数据库操作类.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:48:09
 */
public class ExportDBOperate extends ExportOperate {

    @Override
    public IExportFileApi factoryMethod() {
        return new ExportDB();
    }

}
