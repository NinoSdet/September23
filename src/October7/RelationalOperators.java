package October7;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println( 6 > 5 );

        boolean b = 6 > 5;

        int radius = 0;

        boolean condition = radius > 0;

        System.out.println(condition);

//        if(radius > 0){
//            System.out.println("Radius is greater than zero");
//        }

        System.out.println( radius >= 0);

        int number = 9;

        System.out.println(number <= 10);

        System.out.println( 45 == 12);

        boolean b1 =  radius == 0;

        System.out.println(  11 != 11);

        int num2 = 5;

        boolean isOdd =  num2 % 2  != 0;
        System.out.println(num2 + " is odd: " + isOdd);

        int a = 9;
        int c = 10;
//        System.out.println(a = c);
        System.out.println(a == c);

        boolean b2 = true;
        boolean b3 = false;

//        System.out.println(b3 = b2);
//        System.out.println(b3 == b2);

        System.out.println(b2 = b3 == b2);
//        System.out.println(b3 == b2 = b3);
//                            false = b3;

        //Strings should not be compared with  == because it compared the memory location of the objects

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2); // compares the memory location

        System.out.println(str1.equals(str2)); // compare the values

//        System.out.println("java" == "Java");

    }
}
