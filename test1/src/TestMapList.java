import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ck
 * @create 2022-07-30  20:24
 */
public class TestMapList {

    public static void main(String[] args) {
//        List<Map<Integer, Boolean>> list = new ArrayList<>();
//        Map<Integer, Boolean> map1 = new HashMap<>();
//        Map<Integer, Boolean> map2 = new HashMap<>();
//        map1.put(1, true);
//        map1.put(2, true);
//        map2.put(1, true);
//        map2.put(2, false);
//        list.add(map1);
//        list.add(map2);
//        list.forEach(e -> {
//            System.out.println("map");
//            System.out.println(e);
//        });
//        System.out.println("*******************");
//        map1.put(3, false);
//        map2.put(3, true);
//        list.forEach(e -> {
//            System.out.println("map");
//            System.out.println(e);
//        });
//        System.out.println("*********************");
//        //type = 1
//        System.out.println("map1" + list.get(0));
//        //type = 2
//        System.out.println("map2" + list.get(1));
////        System.out.println(list.get(0).get(2));
//        System.out.println("****************");
//        map1.put(2, false);
//        System.out.println("map1" + map1);
//        System.out.println(list.get(0));
//        System.out.println("***************");
//        list.add(map1);
//        System.out.println(list);
//        System.out.println(map1.get(5));

        Map<Integer, String> map3 = new HashMap<>();
        for(Map.Entry<Integer, String> entry : map3.entrySet()){
            System.out.println(666);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(map3.isEmpty());
        map3.put(1, "aaa");
        System.out.println(map3.isEmpty());
        System.out.println(map3);
        map3.put(1, "kkk");
        System.out.println(map3);
        map3.put(2, "BBB");
        System.out.println(map3);
        for(Map.Entry<Integer, String> entry : map3.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(map3.containsKey(100));
        System.out.println(map3.get(100));
        System.out.println(map3.get(100) == "66" ? "报警" : "在线");
    }
}
