package January18.interfaceDemos;

public interface MyRunnable {

    // Java has 2 types:
    // Primitive types: byte, short, int, long, float, double, char, boolean
    // Reference types ->  class, interface, array, record, annotation, enum

    public static final int i = 45; // interface can have constants

    // interface cannot have a constructor

    // Interfaces are special Java type that contains only constants and abstract methods and
    // they are more commonly used to implement full abstraction whereas abstract classes are used for partial abstraction

    public abstract void run();
    public abstract void operate();
    public abstract void execute();
}
