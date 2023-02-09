package september26;

public class Casting {

    public static void main(String[] args) {

        int number = 45;

        double anotherNum = (double) number;  // type widening, upcasting

        // upcasting is automatic , no need to explicitly upcast, compiler does that for us

        System.out.println(anotherNum);

        double num2 = 3.67;

        int num3 = (int) num2; // type narrowing, downcasting must always be explicitly written

        System.out.println(num3); // casting can result in loss of precision

        int num4 = (int)2.56;

        System.out.println(num4);

        // 67.89

    }
}
