package January04.polymorphism;

import java.util.Scanner;

public class AnimalManager {


    public static void main(String[] args) {

//
//        Bird bird = new Bird();

        // Animal animal = new Bird();  // Polymorphic assignment
        // All birds are animals thus this assignment works

//        Bird bird =  new Animal();  // The reverse doesn't work since not all animals are birds


       // Example with super reference type as Object
       // Since Object is the super class of all objects in Java it can be assigned any object
//        Object object =  new String();
//        object = new Snake();
//        object = new StringBuilder();
//        object = new Animal();
//        object = new Scanner(System.in);




        System.out.println("Please enter the animal type and I will execute that animal's behaviors: ");
        String animalType = new Scanner(System.in).next();


        Animal animal;

        switch (animalType){

            case "Bird":
                animal = new Bird();
                break;
            case "Snake":
                animal = new Snake();
                break;

            case "Dog":
                animal = new Dog();
                break;
            default:
                System.out.println("No suitable animal found");
                return;

        }


        // Why -> Polymorphism enables code re-use and also dynamic code.

        animal.move();
        animal.eat();
        animal.move();
        animal.eat();
        animal.move();
        animal.eat();
        animal.move();
        animal.eat();
        animal.move();
        animal.eat();




    }
}
