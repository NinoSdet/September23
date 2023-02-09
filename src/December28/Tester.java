package December28;

public class Tester {

    public static void main(String[] args) {
        Child child = new Child();

        child.calculate(); // overridden method in Child class is called
        child.calculate((byte)5); // overloaded method in Child class is called
    }
}