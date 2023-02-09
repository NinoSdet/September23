package september23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LimitDecimalDigits {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##"); // pattern determines the digit amount
        System.out.print("Miles: ");
        double miles = new Scanner(System.in).nextInt();
        final double KILOMETERS_PER_MILE = 1.609; // constant
        double kilometers = miles * KILOMETERS_PER_MILE;

        ;

//        System.out.println("Kilometers: " +  df.format(kilometers));
        System.out.println("Kilometers: " +  (Math.round(kilometers * 100.0))/100.0);
    }
}