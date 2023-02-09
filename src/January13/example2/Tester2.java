package January13.example2;

import java.util.ArrayList;
import java.util.List;

public class Tester2 {

    public static void main(String[] args) {



//         Shape shape2 = new Shape();

        // You cannot create an object from an abstract class


         //Common interview question:

        // How do prevent object instantiation?
        // 2 ways:
        // - make the class abstract
        // - make the no-arg constructor of the class private (used when all the methods of the class are static and there is no need for object creation)
        //  Examples: Math, Arrays, Collections classes

//        Phone phone = new Phone();
//        Arrays arrays = new Arrays();
//        Collections collections = new Collections();


        // Although you can't create an object from an abstract class, you can still use it as a reference type

        // Shape s = new Circle(true, "ds", 4);  // can be used as a super reference type

        // Can be used as a collection type

        // Shape[] arr = new Shape[10];  // array of Shape type is valid

        List<Shape> list = new ArrayList<Shape>(); // list of Shapes





    }

    public static void doSomethingWithShape(Shape shape){ //can be used as a method parameter type

    }

}
