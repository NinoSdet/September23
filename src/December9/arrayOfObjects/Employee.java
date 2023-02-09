package December9.arrayOfObjects;

public class Employee {

    private String first;
    private String last;
    private String dob;
    private double salary;
    private String position;
    private String email;


    public Employee(String first, String last, String dob, double salary, String position, String email) {
        this.first = first;
        this.last = last;
        this.dob = dob;
        this.salary = salary;
        this.position = position;
        this.email = email;
    }


    public String getFirst() {

        return first;
    }

    public void setFirst(String first) {

        this.first = first;
    }

    public String getLast() {

        return last;
    }

    public void setLast(String last) {

        this.last = last;
    }

    public String getDob() {

        return dob;
    }

    public void setDob(String dob) {

        this.dob = dob;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String getPosition() {

        return position;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }


    public String getInfo() {
        return "Employee{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", dob='" + dob + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
