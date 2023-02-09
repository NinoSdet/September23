package september23;

import java.util.*;

public class AssignmentScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // int number = new Scanner(System.in).nextInt();

        System.out.println("First name:");
        String firstName = input.next();

        System.out.println("Last name:");
        String lastName = input.next();

        System.out.println("Age:");
        int age = input.nextInt();

        System.out.println("SSN:");
        String SSN = input.next();


        System.out.println("Phone no:");
        long phoneNo = input.nextLong();

        System.out.println("Yearly income:");
        double yearlyIncome = input.nextDouble();

        System.out.println("Married:");
        boolean married = input.nextBoolean();

        input.nextLine();

        System.out.println("Address:");
        String address = input.nextLine();
        System.out.println();


        System.out.println("Thanks, here's the info that you entered:");



        System.out.println("First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age +
                "\nSSN: " + SSN +
                "\nPhone no: " + phoneNo +
                "\nYearly income: " + yearlyIncome +
                "\nMarried: " +  married +
                "\nAddress: " + address );




        //Write your code here
    }
}
