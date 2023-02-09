package November21;
import java.util.Scanner;
public class MethodOverloading4 {


        public static void main(String[] args) {

            //Examples of overloaded Java methods

            myPrintln(2.3,"String");
            myPrintln("Stri",2.1);

            // For method overloading to work properly, we need to keep the same name and different parameters

            //  method name  + parameters -> method signature
            // Method overloading only considers method signature(same name and different parameters)
            // Method visibility/access modifier, return type, static/non-static modifiers DO NOT matter for method overloading

        }

        public static void myPrintln(){
            System.out.println();
        }

        // Changing the number of parameters
        public static void myPrintln(int i){
            System.out.println(i);
        }
        // Changing the number of parameters
        public static void myPrintln(int i, int j){
            System.out.println(i);
            System.out.println(j);
        }

        // Changing the type of parameters
        public static void myPrintln(double d){
            System.out.println(d);

        }
        // Changing the type of parameters
        public static void myPrintln(double i, double j){
            System.out.println(i);
            System.out.println(j);
        }

        public static void myPrintln(String j, double i){
            System.out.println(i);
            System.out.println(j);
        }
        // Changing the order of parameters
        public static void myPrintln(double i, String j){
            System.out.println(i);
            System.out.println(j);
        }

        //    private  int myPrintln(double i, String j){
//        System.out.println(i);
//        System.out.println(j);
//    }

    }

