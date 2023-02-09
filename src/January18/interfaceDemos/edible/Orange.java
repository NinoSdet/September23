package January18.interfaceDemos.edible;

public class Orange extends Fruit{
    @Override
    public void eat() {
        System.out.println("Make orange juice");
    }

    @Override
    public void makeMoney() {
        System.out.println("Sell them as orange jam");
    }
}
