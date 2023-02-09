package January18.interfaceDemos.games;

import java.util.List;

public class GamePlayer {

    public static void main(String[] args) {


        List<Controller> games =  List.of(
                new Mario(),
                new Contra(),
                new Tank(),
                new Mario(),
                new Contra(),
                new Tank()
        );

        //Can't create an object of an interface since it is abstract

//        Controller controller = new Controller();


        // But they can be used as a super reference type, Method parameter type or Collection type

//        Controller controller = new Mario();

        for (Controller game : games) {
            game.up();
            game.down();
            game.pressA();
            game.pressB();
            System.out.println("-----------------------------");
        }




    }
}
