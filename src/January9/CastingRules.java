package January9;

public class CastingRules {
    public static void main(String[] args) {

//        Casting an object from a subclass to a superclass doesn’t require an explicit cast.

        Fruit fruit = new Apple();

        //Casting an object from a superclass to a subclass requires an explicit cast.

//        Apple apple = (Apple)new Fruit();
        Apple apple = (Apple)fruit;

        //The compiler will not allow casts to unrelated types.
        Orange orange = new Orange();
//        Apple apple1 = (Apple) orange;  // compiler error

//        Even when the code compiles without issue,
//        an exception may be thrown at runtime
//        if the object being cast is not actually an instance of that class

//        Fruit fruit1 = new Orange();
//
//        if(fruit1 instanceof Apple){  // instanceof checks is a reference points to the object og the given type
//            Apple apple1 = (Apple) fruit1;
//            System.out.println("Casting happened");
//        }

//        Fruit fruit1 = new Apple();
//
//        if(fruit1 instanceof Apple){  // instanceof checks is a reference points to the object og the given type
//            Apple apple1 = (Apple) fruit1;
//            System.out.println("Casting happened");
//        }

        Fruit fruit1 = new McIntosh();

        if(fruit1 instanceof Apple){  // instanceof checks is a reference points to the object of the given type
            Apple apple1 = (Apple) fruit1;
            System.out.println("Casting happened");
        }

    }
}
