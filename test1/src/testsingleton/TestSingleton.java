package testsingleton;

/**
 * @author ck
 * @create 2022-08-14  18:11
 */
public class TestSingleton {
    public static void main(String[] args) {
        //测试懒汉式
        LazySingletonDoubleCheck singletonDoubleCheck1 = LazySingletonDoubleCheck.getInstance();
        LazySingletonDoubleCheck singletonDoubleCheck2 = LazySingletonDoubleCheck.getInstance();
        System.out.println(singletonDoubleCheck2 == singletonDoubleCheck1);  //地址相同，是同一个对象

        //测试饿汉式
        EhSingleton singleton1 = EhSingleton.getInstance();
        EhSingleton singleton2 = EhSingleton.getInstance();
        System.out.println(singleton2 == singleton1);  //地址相同，是同一个对象
    }
}
