package November21;
import java.util.Arrays;
public class PassByValueForString {


        public static void main(String[] args) {

            String str  = "Hello";

            uppercase(str);  // call a method by passing a variable

            System.out.println("String str value is " + str);

            //  Pass-by value
            //  primitives and immutable objects like String -> calling method will not see the change in the variable even though method changes the variable
            //  mutable objects -> calling method will see the change in the variable if the other method changes the variable

        }

        public static void uppercase(String name){
            name = name.toUpperCase();

        }
    }

