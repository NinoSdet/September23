package October3;

public class MethodModules {

    public static void main(String[] args) {

        printASingleLineOfStars();
        print5Stars();
        printTwoLineOfStars();
        print5Stars();
        printTwoLineOfStars();
        System.out.println();
        print3Stars();
        printTwoLineOfStars();
        print5Stars();
    }
    public static void printASingleLineOfStars(){
        System.out.println("*****");
    }
    public static void printTwoLineOfStars(){
        printASingleLineOfStars();
        printASingleLineOfStars();
    }
    public static void print5Stars(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void print3Stars(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");

    }

}