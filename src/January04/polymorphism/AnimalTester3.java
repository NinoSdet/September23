package January04.polymorphism;

import java.util.List;

public class AnimalTester3 {


    public static void main(String[] args) {


//        Dog[] dogs = new Dog[] {new Dog(), new Dog()};



        // Polymorphism can be used with collections where a super type can be used as a type for a collection
        // and any subtype object can be added to the collection
        Animal[] animals = new Animal[] {
                new Dog(),
                new Bird(),
                new Snake(),
                new Snake(),
                new Dog()
        };


        for ( Animal animal   : animals ){

            animal.move();  // based on the actual object type, that object's move() method is executed
        }






    }

}
