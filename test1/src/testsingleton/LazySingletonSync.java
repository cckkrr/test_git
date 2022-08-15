package testsingleton;

/**
 * 加锁的懒汉式
 * @author ck
 * @create 2022-08-14  18:44
 */
public class LazySingletonSync {
    private static LazySingletonSync lazySingletonSync = null;
    private LazySingletonSync(){}

    public static synchronized LazySingletonSync getInstance(){
        if (lazySingletonSync == null){
            lazySingletonSync = new LazySingletonSync();
        }
        return lazySingletonSync;
    }

}
