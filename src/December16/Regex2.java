package December16;
import java.util.Scanner;
public class Regex2 {
    public static void main(String[] args) {

        System.out.println("Please enter your SSN (###-##-####):");
        String input = new Scanner(System.in).next();

        // 3digits-2digits-4digits
        String regex = "\\d{3}-\\d{2}-\\d{4}";

        if(input.matches(regex)){
            System.out.println("Your ssn format is correct");
        }else {
            System.out.println("The ssn doesn't match the expected format");
        }

    }
}
