package January2.objectClass;

public class StudentTester {


    public static void main(String[] args) {



        Student student1 = new Student("John", 26);
        Student student2 = new Student("John", 26);

        System.out.println(student1.equals(student2));
    }
}
