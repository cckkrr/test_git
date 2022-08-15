package testsingleton;

/**
 * 静态内部类
 * @author ck
 * @create 2022-08-14  19:10
 */
public class StaticClass {
    private StaticClass(){}
    private static class SingleHolder{
        private static final SingleHolder INSTANCE = new SingleHolder();
    }

    public static final SingleHolder getInstance(){
        return SingleHolder.INSTANCE;
    }
}
