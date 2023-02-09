package January18.records;

public class Tester {


    public static void main(String[] args) {

        Student student = new Student(23, "John Doe");

        System.out.println(student.getId());
        System.out.println(student.toString());

        MyStudent myStudent = new MyStudent(23, "Alyx");
        System.out.println(myStudent.id());
        System.out.println(myStudent.toString());
    }
}
