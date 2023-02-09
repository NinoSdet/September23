package October26;

import java.util.Scanner;
public class WhileUsage {
    public static void main(String[] args) {

        System.out.println("Enter y/n: ");

        String answer = new Scanner(System.in).next();

        while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))){
            System.out.println("Invalid input. Please re-enter: ");
            answer = new Scanner(System.in).next();

        }

        System.out.println("You entered " + answer + ". Good job!");

//        int i;
//        for (i = 0; i < 24; i++) {
//            System.out.println("Hello");
//
//        }
//
//        System.out.println(i);

//

        for ( ;  ; ){  // valid syntax, infinite loop
        }

//        while(){   // can't do the same with while
////
//        }
    }
}
