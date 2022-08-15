package testsingleton;

/**
 * 双重检验懒汉式，volatile禁止其指令重排
 * @author ck
 * @create 2022-08-14  18:54
 */
public class LazySingletonDoubleCheck {
    private static  volatile LazySingletonDoubleCheck lazySingletonDoubleCheck = null;
    private LazySingletonDoubleCheck(){}

    public static LazySingletonDoubleCheck getInstance(){
        if (lazySingletonDoubleCheck == null){
            synchronized (LazySingletonDoubleCheck.class){
                if (lazySingletonDoubleCheck == null){
                    lazySingletonDoubleCheck = new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheck;
    }
}
