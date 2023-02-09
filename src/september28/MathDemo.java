package september28;

public class MathDemo {

    public static void main(String[] args) {

        String str;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(45 * 45 * Math.PI);

        int result = Math.abs(-23);
        System.out.println(result);

        int a = 22;
        int b = 34;

        System.out.println(Math.abs(a-b));

        long round = Math.round(3.5);

        System.out.println(round);

        // Limit the decimal number to 2 digits
        double d2 = 34.5665865;

        System.out.println(Math.round(d2    *    100.0)       / 100.0);

        System.out.println(Math.max(23,5));
        System.out.println(Math.min(23,5));

        System.out.println(Math.max( Math.max(2,4), Math.max(5,9)));

        System.out.println(Math.pow(4, 10));

        System.out.println(Math.sqrt(25));

        System.out.println(Math.min(43, 5));

    }
}
