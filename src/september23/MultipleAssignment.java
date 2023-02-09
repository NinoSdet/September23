package september23;

public class MultipleAssignment {

    public static void main(String[] args) {

        int x = 4;
        int y = 8;
        int z = 6;

        int w = x = y = z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}