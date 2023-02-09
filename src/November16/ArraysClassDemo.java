package November16;
import java.util.Arrays;
public class ArraysClassDemo {




        public static void main(String[] args) {

            int[] arr = {3,4,1,9,3,45,2,7,4};

            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr);

            System.out.println(Arrays.toString(arr));

            String[] arr2 = {"java", "01", "11" , "9" , "00", "$"};

            Arrays.sort(arr2);

            System.out.println(Arrays.toString(arr2));

            int[] arr3 = {2,6,3,1,8,5,9, 11, 4};

            // Binary search requires an array to be sorted
            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3));
            System.out.println(Arrays.binarySearch(arr3, 10));

        }
    }
