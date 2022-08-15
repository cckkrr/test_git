package testsingleton;

/**
 * 懒汉式，类初始化不会创建实例，只有被调用时才会创建实例
 * @author ck
 * @create 2022-08-14  18:38
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
