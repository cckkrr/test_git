package UsageSingleton;

/**
 * @author ck
 * @create 2022-10-04  23:44
 */
public class TestLC76 {
    public static void main(String[] args) {
        String t = "ABCCDFA";
        char[] charT = t.toCharArray();
        int[] hash = new int[128];
        for (char ch: charT) hash[ch]--;
        for (char ch: charT) System.out.println(hash[ch]);
        System.out.println(t.substring(0,1));
    }
}
