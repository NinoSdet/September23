package October19;
import java.util.Scanner;
public class ternary3 {
    public static void main(String[] args) {

        //Unary operator -> ++,--, +, -, !
//
//        int num = 7;
//        boolean b = true;
//
//
//        System.out.println(num++);
//        System.out.println(-num);
//        System.out.println(!b);
//
//
//        // Binary operators ->  +, - , * , / , =, ==, != &&, || , ^
//
//        System.out.println( true || false);

        // Ternary operator  ->    ?   :

        System.out.println("Please enter the monthly sales amount: ");
        double salesAmount = new Scanner(System.in).nextDouble();

//

        double commissionPercentage = salesAmount<5000 ?  0.05 : salesAmount<10000 ?  0.1 : 0.2 ;

//        double commissionPercentage;
//        if(salesAmount<5000){
//            commissionPercentage = 0.05;
//        }else if(salesAmount<10000){
//            commissionPercentage = 0.1;
//        }else {
//            commissionPercentage = 0.2;
//        }

        System.out.println("Your commision amount for this month is: " + salesAmount*commissionPercentage);

    }
}

