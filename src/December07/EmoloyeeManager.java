package December07;

public class EmoloyeeManager {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", "12/2/1998", 150000, "Developer");
        Employee employee2 = new Employee("Elon", "Musk", "12/2/1978", 120000, "SDET");

        System.out.println(employee1.createEmail());
        System.out.println(employee2.createEmail());

        System.out.println(Employee.generateString(100));
    }
}
