package January9;

public class Tester {
    public static void main(String[] args) {

//        Fruit fruit = new Orange();
//        useFruit(new Orange());

        // implicit casting of subtype to a supertype is happening
//        Fruit fruit = (Fruit) new Orange();

        // primitive casting
        // down ->
        int i =  (int)67.6;  // downcasting is always explicit
        // up ->
        double d = (double)5;  // upcasting is always implicit

        // object casting
//        implicit upcasting happens when subclass object is assigned to superclass reference
//        Fruit fruit = new Orange(); // Fruit fruit = (Fruit) new Orange();
//
//
//        Orange orange  = (Orange) fruit; // explicit downcasting is required when supertype is cast down to subtype

        // Downcasting can result in ClassCastException is the actual object assigned to the reference is NOT compatible with the type that you are trying to cast

        Fruit fruit1 = new Apple();

//         fruit1.orangeMethod();

        Orange or1 = (Orange)fruit1;
//
//        or1.orangeMethod();

        // Shorter ->
        ( (Orange) fruit1  ).orangeMethod();

    }

    public  static  void useFruit(Fruit fruit){

    }
}
