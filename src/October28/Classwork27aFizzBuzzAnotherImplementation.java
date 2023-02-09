package October28;

public class Classwork27aFizzBuzzAnotherImplementation {
    public static void main(String[] args) {

       fizzBuzz(1, 100);}
        public static void fizzBuzz (int i, int b){

            for (i = 1; i <= b; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);

                }
            }

        }
    }

