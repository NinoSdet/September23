package December19.inheritanceDemo.animals;

public class Cat extends Animal{


    boolean canPurr;
    boolean canLandOnFourFeet;


    public Cat(){}

    public Cat(double weight, double height, String color, int age, boolean canPurr, boolean canLandOnFourFeet) {
        setWeight(weight);
        setColor(color);
        setHeight(height);
        setAge(age);
        this.canPurr = canPurr;
        this.canLandOnFourFeet = canLandOnFourFeet;
    }

    public boolean isCanPurr() {
        return canPurr;
    }

    public void setCanPurr(boolean canPurr) {
        this.canPurr = canPurr;
    }

    public boolean isCanLandOnFourFeet() {
        return canLandOnFourFeet;
    }

    public void setCanLandOnFourFeet(boolean canLandOnFourFeet) {
        this.canLandOnFourFeet = canLandOnFourFeet;
    }


    public String toString() {
        return "Cat{" +
                "canPurr=" + canPurr +
                ", canLandOnFourFeet=" + canLandOnFourFeet +
                ", color=" + getColor() +

                "} ";
    }
}
