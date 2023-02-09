package January04.polymorphism;

public class AnimalTester2 {


    public static void main(String[] args) {


//       makeAnimalBehaviorDog(new Dog());
//       makeAnimalBehaviorSnake(new Snake());

        makeAnimalBehavior(new Snake());
        makeAnimalBehavior(new Bird());
        makeAnimalBehavior(new Dog());
    }


//    public static void makeAnimalBehaviorDog(Dog dog){
//        dog.eat();
//        dog.move();
//    }
//
//    public static void makeAnimalBehaviorSnake(Snake snake){
//        snake.eat();
//        snake.move();
//    }

    public static void makeAnimalBehavior(Animal animal){  // Polymorphism in method parameter
                                                         // instead of more specific type like Dog or Bird, the parameter can be of Super type and and sub type object can be passed when this method is called
        animal.eat();
        animal.move();
    }

}
