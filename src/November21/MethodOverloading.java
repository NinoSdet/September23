package November21;

public class MethodOverloading {
    public static void main(String[] args) {
        printSomething();
        printSomething("Hello");
        printSomething(45);
    }

    public static void printSomething(){
        System.out.println("Welcome to methods");
    }

    public static void printSomething(String str){
        System.out.println(str);
    }

    public static void printSomething(int i){
        System.out.println(i);
    }

    public static void printSomething(String str, int i){
        System.out.println(str+i);
    }

    public static void printSomething(int i, String str){
        System.out.println(str+i);
    }
}

