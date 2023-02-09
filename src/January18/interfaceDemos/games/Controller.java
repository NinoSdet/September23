package January18.interfaceDemos.games;

public abstract interface Controller {  // Interfaces are abstract by default


    // relationship between interface and implementing classes can be described as CAN-DO
    // Apple can be Edible
    // Game can be Controllable
    // Car is Runnable
    // PC is Runnable


    public abstract void up();
    public abstract void down();
    public abstract void right();
    public abstract void left();
    public abstract void pressA();
    public abstract void pressB();





}
