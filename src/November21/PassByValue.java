package November21;

public class PassByValue {


        public static void main(String[] args) {

//        increment(45);

            int num = 4;

            increment(num);  // call a method by passing a variable

            System.out.println("Num in main method is " + num);

            // If a method passes a variable of primitive type to another method, and the other method changes the variable,
            // the variable value in the calling method remains unchanged.
            // Because the value(copy) of the variable is passed, not the variable itself

        }

        public static void increment(int num){
            num++;
            System.out.println("Num in increment method is " + num);
        }
    }

