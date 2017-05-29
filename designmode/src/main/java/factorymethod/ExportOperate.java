package factorymethod;

/**
 * 导出数据操作抽象类.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月28日  下午8:33:26
 */
public abstract class ExportOperate {

    public void export(String data) {
        IExportFileApi api = factoryMethod();
        api.export(data);
    }
    
    protected abstract IExportFileApi factoryMethod();
}
