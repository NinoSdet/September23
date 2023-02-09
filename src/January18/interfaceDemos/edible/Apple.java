package January18.interfaceDemos.edible;

public class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("Make apple cider");
    }

    @Override
    public void makeMoney() {
        System.out.println("Sell them wholesale");
    }
}
