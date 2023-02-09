package December05;

public class AssignmentDifference {

        public static void main(String[] args) {

            int a = 34;
            int b = 12;

            a = b;

            System.out.println(a);
            System.out.println(b);

            Dog dog1 = new Dog("Rex", "shepherd", 'm', 5, true);
            Dog dog2 = new Dog("Floki", "shiba inu", 'f', 2, false);

            dog1 =  dog2;  //assign dog2's reference to dog1
            // after this assignment dog1 will point to whatever object dog2 is pointing to

            System.out.println(dog1.toString());
            System.out.println(dog2.toString());

        }
    }

