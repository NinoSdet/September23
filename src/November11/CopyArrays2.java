package November11;

import java.util.Arrays;

public class CopyArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

        int[] arr2 = {9,8,7,6,5};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[10];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }

        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[arr3.length*2];

        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }

        System.out.println(Arrays.toString(arr4));

    }

}