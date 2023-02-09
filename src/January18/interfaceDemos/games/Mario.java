package January18.interfaceDemos.games;

public class Mario implements Controller{
    @Override
    public void up() {
        System.out.println("Goes up the ladder");
    }

    @Override
    public void down() {
        System.out.println("Goes down the sewer");
    }

    @Override
    public void right() {
        System.out.println("Go forward");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void pressA() {
        System.out.println("Run");
    }

    @Override
    public void pressB() {
        System.out.println("Jump");
    }
}
