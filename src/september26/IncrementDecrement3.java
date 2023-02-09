package september26;

public class IncrementDecrement3 {

    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        int c =  a++   +   ++b;

        System.out.println(c); //

        System.out.println("a is: "  + a);
        System.out.println("b is: "  + b);
        System.out.println("a is: "  + a);

        int x = 4;

//                4   +  6   + 6  + 5  + 5
        int y =   x++ + ++x + x + --x + x--;

        System.out.println(y);
        System.out.println(x);

    }
}