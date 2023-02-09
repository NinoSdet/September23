package september23;

// import java.sql.SQLOutput;

public class ModuloRemainder {

    public static void main(String[] args) {

        System.out.println(10 %  3); // 1

        System.out.println(15 % 4); // 3

        System.out.println(22 % 5); // 2

        System.out.println(11 % 1); // 0

        System.out.println(10 % 2); // 0

        System.out.println( 3 % 6); // 3

        System.out.println( 2 % 23); // 2

        int num = 31;
        System.out.println( num % 2 == 0);

        // Modulo can be used to extract the last digit
        // 1234 -> 4

        System.out.println( 1234 % 10 );  // 4

    }
}