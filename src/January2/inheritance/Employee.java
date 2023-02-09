package January2.inheritance;

public class Employee extends Object{

    private String name;
    private long id;
    private boolean fullTime;
    private  double salary;

    private String email;

    public int publicVar = 10;



    public Employee(String name, long id, boolean fullTime, double salary) {
        this.name = name;
        this.id = id;
        this.fullTime = fullTime;
        this.salary = salary;
        email = generateEmail();
    }


   // private methods in Java cannot be overridden, but subclass can re-declare the same private method,
    // it is going to be considered an independent method
    private String generateEmail(){
        return "employee" + "@company.com";
    }

    private void method1(){

    }


    public static void doSomething(){
        System.out.println("Employee");
    }



    public final void myMethod(){

        // final can be used in three ways:
        // variables -> makes the variable a constant. Once initialized, the re-assignment is not possible.
        // methods -> prevents the subclass from overriding the method
        // class -> prevents extension/inheritance for that class
    }

    public void myMethod1(){


    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
