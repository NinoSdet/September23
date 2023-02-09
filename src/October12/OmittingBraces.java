package October12;

public class OmittingBraces {
    public static void main(String[] args) {

        int age = 16;

//        if(age <=0 ){
//            System.out.println("Invalid age");
//            return;
//        }

//        if (age < 16)
//            System.out.println("You can't drive.");
//            System.out.println("You can't drink");

        // omitting curly brace can result in logical error where obly the next statement after if will belong to the if statement

//
//        if (age < 18)
//            System.out.println("You can't vote.");
//            System.out.println("You can't buy cigarettes");
//        else     // compiler error since else is without if
//            System.out.println("You can buy tobacco products");
//
//            System.out.println("You can buy alhocol products");

        int score = 60;

        if (score >65 ); {   // don't use a semicolon after the condition
            System.out.println("PASSED THE OCA");
        }

        int number = 56;

        boolean isEven = number % 2 == 0;

//        if(isEven == true){  // redundant testing of a variable
        if(isEven){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

}
