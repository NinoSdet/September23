package October28;

import java.util.Scanner;

public class ClassTask026aATM {


    public static void main(String[] args) {
        System.out.println("Welcome to DuoBANK.");
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        int pin;
        do {
            System.out.println("Please enter your pin: ");
            pin = input.nextInt();
            // Create your program here
            attempts++;
            if (attempts == 3 && pin != 1441) {
                System.out.print("You entered wrong pin 3 times, your account is locked. Contact customer service.");
                return;
            }
        } while (pin != 1441);
        {
            System.out.print("You entered the correct pin. Welcome to your account!");
        }
    }
}
