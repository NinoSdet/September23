package December05;

public class NullExample {

        public static void main(String[] args) {

            Student student = new Student();
            student = null;
            // NullPointerException is thrown when a method is called or an instance variable is accessed on a NULL object
//        System.out.println(student.getInfo());  // method call
            System.out.println(student.name);  // access an instance variable

        }
    }

