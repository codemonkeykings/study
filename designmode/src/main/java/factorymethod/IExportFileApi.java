package factorymethod;

/**
 * 数据导出接口.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:29:14
 */
public interface IExportFileApi {

    /**
     * 数据导出.
     * 
     * @param data  数据
     */
    public void export(String data);
}
