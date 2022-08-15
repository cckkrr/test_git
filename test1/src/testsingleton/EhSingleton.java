package testsingleton;

/**
 * 饿汉式，类加载时就创建对象
 * @author ck
 * @create 2022-08-14  18:09
 */
public class EhSingleton {
    private static EhSingleton ehSingleton = new EhSingleton();

    private EhSingleton (){}

    public static EhSingleton getInstance(){
        return ehSingleton;
    }
}
