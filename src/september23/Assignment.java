package september23;

public class Assignment {

    public static void main(String[] args) {

        int x = 5;
        int y = 2;
        int z = 11;

        x = y;
        y = z;
        z = x;
        y = x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}