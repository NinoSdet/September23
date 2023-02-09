package December05;
import December05.Student;
public class VariablesPrimitiveVsReference {



        // Java variables are of 2 types:
        // Primitives:
        // Reference Types: Class, Array

        public static void main(String[] args) {

            int i;
            i = 34;

            String str;
            str = new String("hello");

            System.out.println(str.toUpperCase());

            December05.Student student1, student2;
            student1 = new December05.Student();
            student2 = new Student();

            System.out.println(student1);
            System.out.println(student2);

        }

    }

