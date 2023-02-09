package December9.arrayOfObjects;

import java.util.Scanner;

public class HRApp {


    public static void main(String[] args) {


        System.out.println("Welcome to HR App. Please enter how many employees you are adding today");

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();


        Employee [] employees = new Employee[count];


        for (int i = 0; i < employees.length; i++) {

            System.out.println("Enter employee details: ");
            System.out.println("FIRST: ");
            String first = scan.next();
            System.out.println("LAST: ");
            String last = scan.next();
            System.out.println("DOB: ");
            String dob = scan.next();
            System.out.println("SALARY: ");
            double salasry = scan.nextDouble();
            System.out.println("POSITION: ");
            String pos = scan.next();
            System.out.println("EMAIL: ");
            String email = scan.next();


            System.out.println("Adding an employee to the database...");

            employees[i] =  new Employee(first, last, dob, salasry, pos, email);
        }


        System.out.println("These are the employees that are added: ");


        for (Employee employee : employees) {
            System.out.println(employee.getInfo());
        }




    }
}
