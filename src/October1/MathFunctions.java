package October1;

import java.text.DecimalFormat;

public class MathFunctions
{
    public static void main(String[] args) {
        double a = Math.toDegrees(Math.PI / 7);
        System.out.println(a);

        double b = Math.ceil(-2.5);
        System.out.println(b);

        double c = Math.toRadians(47);
        System.out.println(c);

        double d = Math.floor(-2.5);
        System.out.println(d);

        double e = Math.round(-2.5);
        System.out.println(e);

        double f = Math.round(-2.5f);
        System.out.println(f);

        int randomInt = 34 + (int) (Math.random() *22);
        System.out.println(randomInt);

        int random2Int = (int) (Math.random() *999);
        System.out.println(random2Int);

        DecimalFormat df = new DecimalFormat("#.##");

        double random3 = 5.5 + (Math.random() *50.5);
        System.out.println(df.format(random3));

        System.out.println(Math.log(Math.exp(5.5)));

        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println(df.format(Math.asin(Math.sin(Math. PI / 6))));
        System.out.println(df.format(Math.sin(Math.asin(Math.PI / 6))));
    }
}
