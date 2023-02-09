package December16;
import java.util.Scanner;

public class Regex3 {
    public static void main(String[] args) {

        System.out.println("Please enter password :");
        String input = new Scanner(System.in).next();

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        if(input.matches(regex)){
            System.out.println("Your password matches the criteria");
        }else {
            System.out.println("Your password doesn't match the criteria");
        }

    }
}
