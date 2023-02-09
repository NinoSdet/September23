package December28;

public class Cat extends Animal{

    int noOfLegs = 4;
    boolean isDomestic = true;

    String name  = "Stray";

    public void makeNoise(){
        System.out.println("Cat is meowing");
    }

    public String toString() {
        return "Cat{" +
                "noOfLegs=" + noOfLegs +
                ", isDomestic=" + isDomestic +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
