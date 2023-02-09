package November16;
import java.util.Arrays;
public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {5, -9, 3, -7, -2, 1};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}