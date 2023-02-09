package October7;
import java.util.Scanner;
public class MultiwayIfElse {
    public static void main(String[] args) {

        System.out.println("Enter a number that represents the browser");

        int number = new Scanner(System.in).nextInt();

        if (number == 1) {
            System.out.println("Launch Chrome...");
        } else if (number == 2) {
            System.out.println("Launch Firefox...");
        } else if (number == 3) {
            System.out.println("Launch Edge...");
        } else {
            System.out.println("Invalid choice");
        }
    }
}