package December9.arrayOfObjects;

import java.util.Arrays;

public class Demo {


    public static void main(String[] args) {


//        int[] arr = new int[]{1,2,3};
//
        String[] names = new String[] {"a" , "aa" , "aaa"};


        Employee [] employees = new Employee[3]; // creating an array object does not add any employee objects

        System.out.println(Arrays.toString(employees));

        employees[0] =  new Employee("John", "Doe", "12-3-2000", 120000, "QA", "dass@gmail.com");
        employees[1] = new Employee("Jane", "Smith", "12-3-1999", 150000, "DEV", "dsfdf@gmail.com");
        employees[2] = new Employee("Pamela", "Anderson", "12-3-1978", 2000000, "PM", "dsvvsddsv@gmail.com");


        // Shorthand syntax
//        Employee [] employees = new Employee[] {
//                new Employee("John", "Doe", "12-3-2000", 120000, "QA", "dass@gmail.com"),
//                new Employee("Jane", "Smith", "12-3-1999", 150000, "DEV", "dsfdf@gmail.com"),
//                new Employee("Pamela", "Anderson", "12-3-1978", 2000000, "PM", "dsvvsddsv@gmail.com")
//
//         };



        System.out.println(Arrays.toString(employees));


        employees[0].setLast("Olsson");

        System.out.println(employees[0].getInfo());

        for ( Employee e : employees ){
            System.out.println(e.getInfo());
        }



    }
}
