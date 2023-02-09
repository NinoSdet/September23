package January18.interfaceDemos.games;

public class Tank implements Controller{
    @Override
    public void up() {
        System.out.println("Move north");
    }

    @Override
    public void down() {
        System.out.println("Move south");
    }

    @Override
    public void right() {
        System.out.println("Move east");
    }

    @Override
    public void left() {
        System.out.println("Move west");
    }

    @Override
    public void pressA() {
        System.out.println("Normal fire");
    }

    @Override
    public void pressB() {
        System.out.println("Rapid fire");
    }
}
