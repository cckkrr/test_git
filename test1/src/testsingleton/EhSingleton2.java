package testsingleton;

/**
 * @author ck
 * @create 2022-08-14  19:48
 */
public class EhSingleton2 {
    private static EhSingleton2 ehSingleton2 = null;

    static {
        ehSingleton2 = new EhSingleton2();
    }
    private EhSingleton2(){}
    public static EhSingleton2 getInstance(){
        return ehSingleton2;
    }
}
