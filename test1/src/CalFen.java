/**
 * @author ck
 * @create 2022-07-10  1:03
 */
public class CalFen {
    public static void main(String[] args) {
        String receiveData = "2401400000500145751264564E27123356";
        StringBuilder sb = new StringBuilder();
        sb.append(receiveData);
        String sLatdu = sb.substring(26, 28);   //16进制 度
        Integer latDu = Integer.valueOf(TypeConversion.hexString2DecString(sLatdu));  // 10进制 度

        String sLatfen1 = sb.substring(28, 30);
        int latFen1 = Integer.valueOf(sLatfen1) * 10000;

        String sLatfen2 = sb.substring(30, 32);
        int latFen2 = Integer.valueOf(sLatfen2) * 100;

        String sLatfen3 = sb.substring(32, 34);
        int latFen3 = Integer.valueOf(sLatfen3) * 1;

        int latFen = latFen1 + latFen2 + latFen3;


        System.out.println(sLatdu);
        System.out.println(latDu);

        System.out.println(sLatfen1 + "===>" + latFen1);
        System.out.println(sLatfen2 + "===>" + latFen2);
        System.out.println(sLatfen3 + "===>" + latFen3);

        System.out.println(latFen);
    }
}
