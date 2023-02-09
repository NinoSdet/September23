package January18.interfaceDemos.edible;

import java.util.List;

public class Tester {


    public static void main(String[] args) {



//        List<Edible> edibles = List.of(new Apple(), new Chicken(), new Orange(), new IceCream());
//
//        for (Edible edible : edibles){  // can be used as collection type
//            edible.eat();
//        }

        eatSomething(new IceCream());
    }


    public static void eatSomething(Edible edible){  // can also be used as method parameter type

       edible.eat();
    }
}
