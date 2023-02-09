package November11;

import java.util.Arrays;

public class ClassTask049MerginfTwoArrays {
    public static void main(String[] args) {


        //TESTS
        System.out.println(Arrays.toString(mergeArrays(new int[]{1,2,3}, new int[]{4,5}))); //[1,2,3,4,5]


        System.out.println(Arrays.toString(mergeArrays(new int[]{0,0,2,8}, new int[]{1,1}))); //[0, 0, 2, 8, 1, 1]

        System.out.println(Arrays.toString(mergeArrays(new int[]{100,99}, new int[]{1,2}))); //[100, 99, 1, 2]

        System.out.println(Arrays.toString(mergeArrays(new int[]{55}, new int[]{}))); //[55]

    }


    public static int[] mergeArrays(int[] a, int[] b){
        // implement here
        int [] result = new int[a.length + b.length];
        for (int i=0; i<a.length; i++){
            result [i] = a[i];
        }
        for (int i=0; i<b.length; i++) {
            result[i+ a.length] = b[i];

        }
        return result;
    }
}

