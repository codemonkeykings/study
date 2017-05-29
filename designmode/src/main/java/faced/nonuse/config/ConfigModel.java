package faced.nonuse.config;

/**
 * 配置代码生成工具.
 *  
 * @author Zhang.Ge
 * @version v1.0 2017年3月25日  下午11:10:19
 */
public class ConfigModel {

    /**
     * 是否生成表现层，默认为true.
     */
    private boolean needGenPresentation = true;
    
    /**
     * 是否生成业务层，默认为true.
     */
    private boolean needGenBusiness = true;
    
    /**
     * 是否生成数据层，默认为true.
     */
    private boolean needGenDao = true;

    /**
     * 获取  needGenPresentation.
     * @return 返回   needGenPresentation
     */
    public boolean isNeedGenPresentation() {
        return needGenPresentation;
    }

    /**
     * 设置  needGenPresentation.
     * @param needGenPresentation the needGenPresentation to set
     */
    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }

    /**
     * 获取  needGenBusiness.
     * @return 返回   needGenBusiness
     */
    public boolean isNeedGenBusiness() {
        return needGenBusiness;
    }

    /**
     * 设置  needGenBusiness.
     * @param needGenBusiness the needGenBusiness to set
     */
    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    /**
     * 获取  needGenDao.
     * @return 返回   needGenDao
     */
    public boolean isNeedGenDao() {
        return needGenDao;
    }

    /**
     * 设置  needGenDao.
     * @param needGenDao the needGenDao to set
     */
    public void setNeedGenDao(boolean needGenDao) {
        this.needGenDao = needGenDao;
    }
}
