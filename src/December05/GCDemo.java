package December05;

public class GCDemo {

        public static void main(String[] args) {

            Dog dog1 = new Dog("Rex");
            Dog dog2 = new Dog("Floki");
            Dog dog3 = new Dog("Max");

            dog1 = dog3;
            dog3 = dog1;
            dog2 = dog3;
            dog3 = null;
            Dog dog4 = dog1;

            dog3 = new Dog("Shiba");

            System.out.println(dog1.toString());
            System.out.println(dog2.toString());
            System.out.println(dog3);
            System.out.println(dog4.toString());

//        int[] arr = new int[2000000000];

            System.gc(); //Calling the gc method SUGGESTS that the Java Virtual Machine expend effort toward recycling unused objects

        }
    }

