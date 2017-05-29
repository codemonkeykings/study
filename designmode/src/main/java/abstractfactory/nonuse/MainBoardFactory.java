package abstractfactory.nonuse;

/**
 * 主板生产工厂.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年3月30日  下午10:52:24
 */
public class MainBoardFactory {

    public static MainboardApi createMainboard(int type) {
        MainboardApi mainboard = null;
        if (type == 1) {
            mainboard = new GAMainboard(1158);
        } else if (type == 2) {
            mainboard = new MSIMainboard(993);
        }
        
        return mainboard;
    }
}
