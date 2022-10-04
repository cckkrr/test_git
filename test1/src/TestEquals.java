/**
 * @author ck
 * @create 2022-09-29  23:36
 */
public class TestEquals {

    public static void main(String[] args) {
        String s = "abc";
        try{
            System.out.println(s.equals(null));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常");
        }

        Object b = null;
        try {
            System.out.println(b.equals(s));
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
