package December19.inheritanceDemo.superKeyword;

public class Cat extends Animal {


    boolean canPurr;
    boolean canLandOnFourFeet;


    public Cat(double weight1, double height1, String color1, int age1, boolean canPurr, boolean canLandOnFourFeet) {
        super(weight1,height1, color1, age1);  // used to call super class's constructor to initialize default
//        this();
       // super() and this() cannot come together in a constructor since both need to be declared in the first line
        this.canPurr = canPurr;
        this.canLandOnFourFeet = canLandOnFourFeet;
    }




    public Cat(){

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
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", age=" + getAge() +

                "} ";
    }
}
