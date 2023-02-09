package November09;
import java.util.Arrays;
import java.util.Random;
public class SumAllArrayElements {

        public static void main(String[] args) {

            int [] arr = new int[100];

            for (int i = 0; i < arr.length; i++) {
                arr[i]  = new Random().nextInt(100);
            }

            System.out.println(Arrays.toString(arr));

            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }

            System.out.println("Total is: " + total);

        }
    }

