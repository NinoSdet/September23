package January18.interfaceDemos.edible;

public class Chicken extends Animal implements Edible, Commercializable{
    @Override
    public void eat() {
        System.out.println("Make a chicken rotisserie");
    }

    @Override
    public void sound() {
        System.out.println("Chicken clucks");
    }

    @Override
    public void makeMoney() {
        System.out.println("Sell eggs");
    }
}
