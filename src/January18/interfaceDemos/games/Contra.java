package January18.interfaceDemos.games;

public class Contra implements Controller {
    @Override
    public void up() {
        System.out.println("Look up");
    }

    @Override
    public void down() {
        System.out.println("Look down");
    }

    @Override
    public void right() {
        System.out.println("Move right");
    }

    @Override
    public void left() {
        System.out.println("Move back");
    }

    @Override
    public void pressA() {
        System.out.println("Shoot");
    }

    @Override
    public void pressB() {
        System.out.println("Shoot faster");
    }
}
