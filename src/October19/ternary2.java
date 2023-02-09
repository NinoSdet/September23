package October19;


import java.util.Scanner;

public class ternary2 {




        public static void main(String[] args) {

            System.out.println("Enter a number: ");
            int num = new Scanner(System.in).nextInt();

//        if(num % 2 == 0){
//            System.out.println(num + " is even");
//        }else {
//            System.out.println(num  + " is odd");
//        }

            System.out.println(num + " is " + ((num % 2 == 0) ? "even" : "odd"));

        }
    }


