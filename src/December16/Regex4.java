package December16;
import java.util.Scanner;

public class Regex4 {
    public static void main(String[] args) {

        System.out.println("Please enter string :");
        String input = new Scanner(System.in).next();

//        System.out.println(input.replace("*", "$"));

        //replace  #$% to @

        System.out.println(input.replaceAll("[#$%]", ""));
        System.out.println(input.replaceFirst("[#$%]", ""));

    }
}
