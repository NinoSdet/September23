package November11;

import java.util.Arrays;

public class CopyArrays {

    public static void main(String[] args) {

        int i = 6;
        int j = 12;

        j = i;

        System.out.println(i);
        System.out.println(j);

        int [] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};

        arr2 = arr1;  // you should not copy arrays by assigning array references to one another

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[0] = 99;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

// Copy arr3 content to arr4

        int [] arr3 = {1,2,3};
        int[] arr4 = {2,3,4};

        System.out.println("Copy one array value to another");

        System.out.println("Before");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        // Use a loop to access one array element and overwrite the value in the other arry element
        for (int k = 0; k < arr3.length; k++) {
            arr4[k] = arr3[k];
        }

        System.out.println("After");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        System.out.println("Change the first element of arr3");

        arr3[0] = 88;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }

}
