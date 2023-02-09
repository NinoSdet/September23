package January13.example2;

import java.util.*;

public class Tester {

    public static void main(String[] args) {

        // Advantages
        // Cleaner, more readable code
        // More robust class design because of super class enforcing subclass implementation
        // Shorter code


//        Shape shape  = new Circle(true, "red", 2.3);

        List<Shape> shapeList = List.of(new Circle(true, "red", 2.4),
                new Circle(false, "yellow", 2.3),
                new Circle(true, "black", 2.1),
                new Rectangle(true, "yellow", 2, 6),
                new Square(true, "green", 5)
        );

        for (Shape shape : shapeList) {
            System.out.println(shape + " -> Area:" + shape.getArea() + " Perimeter: " + shape.getPerimeter());
        }

    }
}
