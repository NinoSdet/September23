package December16;

import java.util.Arrays;
import java.util.Scanner;

public class regex5 {
    public static void main(String[] args) {

        System.out.println("Please enter string :");
        String input = new Scanner(System.in).nextLine();

        String[] words = input.split("[ ,.':;)(]");

        System.out.println(Arrays.toString(words));

    }
}
