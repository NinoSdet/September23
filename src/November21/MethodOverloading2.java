package November21;

public class MethodOverloading2 {
    public static void main(String[] args) {

        System.out.println(max(2,3));
        System.out.println(max(2.3,1.7));

        max(2,3);
        max(1.3, 3.4);
        max(1.3, 3.4, 1.1);

    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b, double c) {
        return Math.max(c, Math.max(a, b));
    }

}
