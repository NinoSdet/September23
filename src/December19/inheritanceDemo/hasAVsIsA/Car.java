package December19.inheritanceDemo.hasAVsIsA;

public class Car extends Vehicle{ // Car is a Vehicle


    // IS-A relationship  -> Inheritance (when one class extends another class)
    // Car is a vehicle

    // HAS-A relationship -> Composition (when one class contains another class as its property)
    String vin;
    Engine e;  // Car has an engine (Composition)



    public Car(String vin, Engine e) {
        this.vin = vin;
        this.e = e;
    }
}
