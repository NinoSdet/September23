package January2.inheritance;

public class Tester {

    public static void main(String[] args) {



        Employee employee = new Employee("Nazar", 23232, true, 150000);

        SDET sdet = new SDET("Aleksandra", 3243, true, 160000, true, "Java", "BDD");


//        System.out.println(employee.publicVar);
//        System.out.println(sdet.publicVar);


          sdet.printInfo();

//        Employee.doSomething();
//        sdet.doSomething();
//
//        new Employee("Nazar", 23232, true, 150000).doSomething();

        System.out.println();



    }
}
