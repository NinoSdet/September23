package October7;

public class IfStatementsExercise {
    public static void main(String[] args) {
        isEven(35);
    }

    public static void isEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
            //   System.out.println(number + " is odd");
        } else {
            System.out.println(number + " is odd");

        }
    }
}


