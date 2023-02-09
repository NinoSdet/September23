package October12;

public class LogicalOperators {
    public static void main(String[] args) {

        int num = 33;

        boolean isEven = num % 2 == 0;

        if(! isEven){  // not
            System.out.println("Odd logic");
        }

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(3>0));

        String str =  "Java";
        String str2 = new String("Java");
        System.out.println(! str.equals(str2));  // not equals

        System.out.println(true && false );
        System.out.println(true && true );

        System.out.println(true && true && false && true);

        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);

        System.out.println((true || false) && (false || false));

        char ch = 'a';

        if(ch == 'a' || ch == 'i' || ch=='e' || ch=='u' || ch=='o' ){
            System.out.println("Vowel");
        }

        // Check if number is divisible by both 2 and 3
        int number = 6;

//        if(number % 2 == 0  && number % 3 == 0){
//            System.out.println("Divisible by both 2 and 3");
//        }

        if(number % 2 == 0  ^ number % 3 == 0){
            System.out.println("Divisible by either 2 or 3 but not both");
        }

        //Check if a number is between 10-20

        int x = 20;

        if( x>=10 && x<=20){
            System.out.println("X is within 10-20");
        }

    }
}
