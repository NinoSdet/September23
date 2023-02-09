package November09;
import java.util.Arrays;
public class StringMethods {


    public static void main(String[] args) {

        // toCharArray();  -> converts String into char[]

        String str = "Hello World";

        char[] arr =  str.toCharArray();

        System.out.println(Arrays.toString(arr));

        // Swap first and last

//        char temp = arr[0];
//        arr[0] = arr[arr.length-1];
//        arr[arr.length-1] = temp;

        for (int i = 0, j = arr.length-1; i < j; i++, j--) {

            // Swap the pair of characters from both ends continuously till the middle point to reverse the array content
            char temp = arr[i]; // take arr[i] and store in temp
            arr[i] = arr[j]; // overwrite arr[i] with the value of arr[j]
            arr[j] = temp; // overwrite arr[j] with temp

        }

        System.out.println(Arrays.toString(arr));

        // Convert the char[] back to String

        String reversed =  new String(arr);  // use string constructor

        System.out.println(reversed);

        String reversedAnotherWay = String.valueOf(arr); // use valueOf Method

        System.out.println(reversedAnotherWay);

        System.out.println(arr);  // only for char arrays, println prints the content directly as a String, for every other array type it will print the memory location

    }
}