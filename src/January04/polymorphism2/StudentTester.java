package January04.polymorphism2;

public class StudentTester {


    public static void main(String[] args) {

        Student student = new OnlineStudent(3223, "John", 1232, "NY");

        student.submitAssignment(); // overriden method determined by actual object type

        //student.submitAssignment(2343342);// overloaded methods are checked by declared type during compile time by the compiler

      //  System.out.println(student.zoomPass);

//        student.c

    }
}
