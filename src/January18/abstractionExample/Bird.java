package January18.abstractionExample;

public class Bird extends Animal{
    @Override
    void eat() {
        System.out.println("Eat worms");
    }

    @Override
    void move() {

        System.out.println("Fly");
    }


    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.move();

//        Object ob =  new Object();

        // Number is an example of a super abstract class for numeric wrapper classes
//        (Integer, Double, Float, Byte, Short, Long)
        Number number =  Integer.valueOf("34");

        int i = 1256326345;

        // Built in method to reverse an Integer
        int reversed = Integer.reverse(i);
        System.out.println(reversed);
    }
}
