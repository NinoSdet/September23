package October7;

public class ReturnInVoid {
    public static void main(String[] args) {

        System.out.println("Before calling the method");
        printDivisionResult(6, 0);
        System.out.println("After calling the method");

    }

    public static void printDivisionResult(int a, int b){

        System.out.println("The result is:");

        if(b == 0){
            return; // end the method early
        }

        System.out.println( a / b);

    }
}
