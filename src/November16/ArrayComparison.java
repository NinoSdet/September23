package November16;
import java.util.Arrays;

public class ArrayComparison {





        public static void main(String[] args) {

            int[] arr1 = {1,2,3};
            int[] arr2 = {1,2,3};

            System.out.println(arr1);
            System.out.println(arr2);

            System.out.println(arr1.equals(arr2)); // compares memory location
            // You should never compare equality of arrays using its equals methods

            boolean result = Arrays.equals(arr1, arr2);
            System.out.println(result);
        }
    }

