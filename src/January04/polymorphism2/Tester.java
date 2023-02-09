package January04.polymorphism2;

public class Tester {


    public static void main(String[] args) {


         // Declared type         // Actual type
         Object object    =    new Student( 935,"John");

        System.out.println(object.toString());

        // According polymorphism, the actual type determines which method to be called


        // Runtime polymorphism (dynamic/late/runtime binding)  -> overridden instance methods

        // Compile-time polymorphism (static/early/compile-time binding) -> static methods, variables, overloaded methods, private methods


    }
}
