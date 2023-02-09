package December19.inheritanceDemo.superKeyword;

public class Animal {


    private double weight;
    private double height;
    private String color;
    private int age;

    public Animal(){}

    public Animal(double weight, double height, String color, int age) {
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.age = age;
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
