package January13.example3;

public abstract class ElectricCar extends Car{
    @Override
    public void start() {
        System.out.println("Electric car is started pushing the start button");
    }

    @Override
    public void fuelUp() {

    }


    @Override
    public void drive() {

    }

    // The very first concrete class in the inheritance chain
    // must implement all inherited abstract methods
}
