package December28;

public class Apple extends Fruit {

    int age = 10;

    String type = "macintosh";

    public void printFruitMessage(){
        System.out.println("Apple message");
    }

    public void printInfo(){
        System.out.println("The age: " + this.age);
        System.out.println("The type: " + this.type);
    }

    public void printFruitInfo(){
        System.out.println("The age: " + super.age);
        System.out.println("The type: " + super.type);
        super.printFruitMessage();
    }

    public void printAll(){
        this.printFruitMessage();
        super.printFruitMessage();
    }

    public static void main(String[] args) {

        Apple apple = new Apple();

        apple.printAll();
    }
}