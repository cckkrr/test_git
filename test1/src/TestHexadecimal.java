/**
 * @author ck
 * @create 2022-06-22  11:19
 */
public class TestHexadecimal {
    public static void main(String[] args) {
        String s1 = "50";
        String s = TypeConversion.hexString2DecString(s1);
        System.out.println(s + ": " + s.getClass().getTypeName());
//        int num1 = Integer.valueOf(TypeConversion.hexString2DecString(s1));
//        System.out.println(num1 + ": " );
//        String s2 = Integer.toString(num1);
//        System.out.println(s2 + ": " + s2.getClass().getTypeName());
    }


}
