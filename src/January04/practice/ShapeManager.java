package January04.practice;

import java.util.Scanner;

public class ShapeManager {


    public static void main(String[] args) {

        // Ask the user how many shapes he wants to add
        // Ask what type of Shape and based on that get that shape's info
        // Once all the shapes are inputted, display the info about all the shapes


        System.out.println("How many shapes? : ");

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        Shape[] shapes = new Shape[amount];


        for (int i = 0; i < amount; i++) {


            System.out.println("What shape you are adding?: ");

            String shape = scanner.next();

            System.out.println("IsFilled?: ");
            boolean isFilled = scanner.nextBoolean();
            System.out.println("Color?: ");
            String color = scanner.next();

            if(shape.equalsIgnoreCase("circle")){
                System.out.println("Please enter the radius: ");
                double radius = scanner.nextDouble();
                shapes[i] =  new Circle(isFilled,color,radius);
            } else if (shape.equalsIgnoreCase("rectangle")) {
                System.out.println("Please enter the width: ");
                double width = scanner.nextDouble();

                System.out.println("Please enter the height: ");
                double height = scanner.nextDouble();
                shapes[i] =  new Rectangle(isFilled, color, width,height);
            }


        }


        System.out.println("Here is the info about your shapes: ");

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println(shape.toString());
            System.out.println("-------------------------------------");
        }

    }
}
