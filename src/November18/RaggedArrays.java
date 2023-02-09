package November18;
import java.util.Arrays;
import java.util.Random;
public class RaggedArrays {


        public static void main(String[] args) {

            int[][] arr =  new int[4][];  // omitting the inner array size

            System.out.println(Arrays.deepToString(arr));

            arr[0] = new int[2];
            System.out.println(Arrays.deepToString(arr));
            arr[1] =  new int[]{1,2,3,4};

            System.out.println(Arrays.deepToString(arr));

            arr[2] = new int[4];
            arr[3] = new int[1];

            System.out.println(Arrays.deepToString(arr));

            arr[1] = new int[] {9,9,9,9,9,9};

            System.out.println(Arrays.deepToString(arr));

            for (int i = 0; i < arr.length; i++) {
                arr[i] = new int[]{8,8,8};
            }

            System.out.println(Arrays.deepToString(arr));

            for (int[] each : arr){

                for(int i : each){
                    System.out.print( i + "\t");
                }
                System.out.println();
            }

            int i = new Random().nextInt(25);

        }
    }

