package December14;

public class SBDEmo3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();   // default capacity for an empty sb is 16

        System.out.println(sb.capacity());

        sb.append("123456");

        System.out.println(sb.length());

        System.out.println(sb.capacity());

        sb.append("12345678901");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder sb2 = new StringBuilder(32);

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("123");

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.deleteCharAt(0);

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.trimToSize();

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.setLength(10);  // sets the length and the capacity to a specific value

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println(sb2);

    }
}
