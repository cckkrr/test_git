import java.util.*;

/**
 * @author ck
 * @create 2022-08-11  15:12
 */
public class NullableTest {
    public static void main(String[] args) {
        List<String> list = null;
//        list = new ArrayList<>();
//        list.add("89");
        System.out.println(list);
        List<String> newList = Optional.ofNullable(list)
                .orElse(Arrays.asList("a","b","cc"));
        newList.forEach(e -> {
            System.out.println(e);
        });

        Map<Integer, String> map;
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map = map1;
        System.out.println(map.isEmpty());
    }
}
