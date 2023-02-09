package september26;

public class IntegerOverflowUnderflow {

    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);

        int i =  2147483647;

        int someNum = i + 2;  // integer overflow

        System.out.println(someNum);

        byte b = -128;

        byte c = b; // integer underflow

        System.out.println(c);

        long longNum = 2147483652L;

        System.out.println((int)longNum);

        int numInt = 1000;

        System.out.println((byte)numInt);

    }
}