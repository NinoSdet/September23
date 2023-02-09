package November11;

import java.util.Arrays;

public class Shuffle {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr));

        shuffle(arr);

//        for (int i = arr.length-1; i >=0 ; i--) {
//
//             int j = (int)(Math.random()*(i+1));
//
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//
//
//        }

        System.out.println(Arrays.toString(arr));

    }

    public static void shuffle(int[] arr){

        for (int i = arr.length-1; i >=0 ; i--) {

            int j = (int)(Math.random()*(i+1));

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}