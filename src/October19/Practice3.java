package October19;

public class Practice3 {
    public static void main(String[] args) {
        String s1 = " Welcome ";
        String s2 = " welcome ";

        boolean bool = s1.equals(s2);
        System.out.println(bool);

        boolean bool1 = s1.equalsIgnoreCase(s2);
        System.out.println(bool1);

        int comp = s1.compareTo(s2);
        System.out.println(comp);

        int comp1 = s1.compareToIgnoreCase(s2);
        System.out.println(comp1);

        boolean bool3 = s1.startsWith("AAA");
        System.out.println(bool3);

        boolean bool4 = s1.endsWith("AAA");
        System.out.println(bool4);

        int len = s1.length();
        System.out.println(len);

        char ch = s1.charAt(0);
        System.out.println(ch);

        String s3 = s1+s2;
        System.out.println(s3);

        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,4));

        String s4 = s1.toLowerCase();
        System.out.println(s4);

        String s5 = s1.toUpperCase();
        System.out.println(s5);

        String s6 = " Welcome ".trim();
        System.out.println(s6);





    }
}
