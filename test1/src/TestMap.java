import java.util.HashMap;
import java.util.Map;

/**
 * @author ck
 * @create 2022-06-27  17:29
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "a");
        map1.put(102, "b");
        map1.put(103, "c");
//        for(Map.Entry<Integer, String> entry : map1.entrySet()){
//            System.out.println(entry.getValue());
//            System.out.println(entry.getKey());
//        }
        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("********************");
        System.out.println("map1.containsKey :" + map1.containsKey(101));
        String d = map1.put(101, "d");

        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.toString());
        }
        map1.remove(101);
        System.out.println("********************");
        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("*****************");
        String d1 = map1.put(101, "d");
        System.out.println("d: " + d1);
        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println(666);

    }
}
