package January30;

import java.util.Scanner;

public class ExceptionDemo2 {


    public static void main(String[] args) {


        System.out.println("Enter 2 integers for division: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();



        try{
            System.out.println("The division of " + a + " by " + b + " is " + a/b);
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed. The result of division is ignored.");
//            System.out.println("Terminating the program...");
//            return;
//            System.exit(1); // Terminates the currently running Java Virtual Machine. The argument serves as a status code; by convention, a nonzero status code indicates abnormal termination.
        }

        System.out.println("100 lines of code...");



        








    }
}
