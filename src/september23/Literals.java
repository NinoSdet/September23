package september23;

public class Literals {

    public static void main(String[] args) {

        String str = "Welcome";

        System.out.println(str);

        // Any whole number like 3,56,23423 is considered int

        System.out.println(45); // 45 here is an int

        byte b = 20;  // byte can accept an int literal within its range

        int x = 20;

//        byte b2 = x;

        short sh = 32000; // short can be assigned an int literal that is within the range of short

        int x2 = 32000;

//        sh = x2;

        System.out.println(63254623424623462L);  // long literals are accompanied by L or l
//        System.out.println(Integer.MAX_VALUE);
        long longNum = 2147483648L;

        // / Any decimal number like 3.0,5.6, 2.3423 is considered double

        // Decimal literals are of 2 types: double and float

        // Float literal requires F or f

        float f = 4.5F;

        double d1 = 4.5;

        System.out.println(10 / 3D);

        // Char literal  is denoted by ''
        //String literals are denoted by " "

        System.out.println('a');  // char literal

        System.out.println("a"); // String literal

        System.out.println("2" + false);

        String str3 = "dsf";
        String str2 = null; // String object has no value

        // Numeric literals can accpet underscores in between for readability

        long ssn = 123_45_6789;

        System.out.println(ssn);

        long cardNo = 2352_7832_8232_3243L;

        System.out.println(cardNo);

        double d = 122_3443543.4326_45723;

    }
}