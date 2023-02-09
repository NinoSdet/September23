package November16;

import java.util.Arrays;

public class ClassTask049MoveArrays {
    public static void main(String[] args) {
        int [] arr1={1, 0, 1, 0, 0, 1, 1};
        moveEvensToFront(arr1);
        System.out.println(Arrays.toString(arr1));

        int [] arr2={3,3,2};
        moveEvensToFront(arr2);
        System.out.println(Arrays.toString(arr2));

        int [] arr3={2,2,2};
        moveEvensToFront(arr3);
        System.out.println(Arrays.toString(arr3));

        int [] arr4={1,4,5,2,9};
        moveEvensToFront(arr4);
        System.out.println(Arrays.toString(arr4));
        int [] arr5={3,6,2,2,2};
        moveEvensToFront(arr5);
        System.out.println(Arrays.toString(arr5));

    }

    public static void moveEvensToFront(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]%2!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

    }
}
