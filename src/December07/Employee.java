package December07;

public class Employee {
    String first;
    String last;
    String dob;
    double salary;
    String position;

    static final String COMPANY_NAME = "Verizon";

    static String address = "123 Main St, Fairfax VA 22182";

    public void instanceMethod(){
        // Instance method have no restrictions on which members they can access

        System.out.println(first); // instance method can access instance variable directly
        createEmail(); // instance method can call another instance method directly
        staticMethod(); // instance method can call another static method directly
        System.out.println(COMPANY_NAME); // instance method can access static variable directly
    }

    public static void staticMethod(){

        // Static methods have access to only static members of the class

        generateString(5);  // static method can call static method directly
        System.out.println(COMPANY_NAME); // static method can access static variable directly
        //createEmail(); //Non-static method 'createEmail()' cannot be referenced from a static context
        // static method CANNOT call instance method directly

        // System.out.println(first); //Non-static field 'first' cannot be referenced from a static context
        // static method CANNOT access instance variable directly

    }

        //    static {
//        address = "123 Main St, Fairfax VA 22182";
//    }

        // There are 2 places where a static variable of the class can be initialized
        // 1. Where it is declared
        // 2. Static block which runs before everything else in the class
        //  Static block is used to initialize the static variables of the class

    public Employee(String first, String last, String dob, double salary, String position) {
        this.first = first;
        this.last = last;
        this.dob = dob;
        this.salary = salary;
        this.position = position;
    }

    public String createEmail(){

        return (first.substring(0,2) + last.substring(last.length()-2) + "@" + COMPANY_NAME + ".com").toLowerCase();
    }

    public static String generateString(int length){

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789^&*";

        String collect = "";
        for (int i = 0; i < length; i++) {
            int randIndex = (int)(Math.random()*alphabet.length());
            collect += alphabet.charAt(randIndex);
        }

        return collect;
    }

    public String getInfo() {
        return "Employee{" +
                "first='" + first + '\'' +
                "last='" + last + '\'' +
                ", dob='" + dob + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public static String getCompanyName(){

        return COMPANY_NAME;
    }

    public static String getAddress(){

        return address;
    }

}
