package November21;

public class InvocationOrder {
    public static void main(String[] args) {

        myMethod(2);

    }

    // It is possible to overload the main method, but it is not going to be a runnable method
    public static void main(String args) {

    }

    public static void myMethod(short i){
        System.out.println("short");
    }

    public static void myMethod(long i){
        System.out.println("long");
    }
    public static void myMethod(int i){
        System.out.println("int");
    }
    public static void myMethod(float i){
        System.out.println("float");
    }

}

