package November21;

public class AmbiguousInvocation {
    public static void main(String[] args) {

//        max(2,2); // Ambiguous method call happens when more than one method matches the method call
    }

    public static void max(int a, double b){
        System.out.println("int double");
    }
    public static void max(double a, int b){
        System.out.println("double int");
    }

}
