package December28;

public class Animal {

    int age = 5;
    double weight = 5;

    public void makeNoise(){
        System.out.println("Make animalistic noise");
    }

    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}