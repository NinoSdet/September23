package November07;
import java.util.Arrays;
public class ArrayDemo {


    public static void main(String[] args) {

        int i = 2;

        int[] numbers;  // array declaration
//        int numbers2 [];  // alternative syntax from c++

        // arrays are objects in java

        int[] nums = new int[5]; //arrays require the size tobe provided beforehand
        // arrays are fixed in size and you are not able to change the size once initialized with certain size

        nums[0] = 34;
        nums[1] = 21;
        nums[2] = 11;
        nums[3] = 55;
        nums[4] = 66;

        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        System.out.println(nums);  //By default when you print out an array object it prints out the memory location, [I@e9e54c2 -> memory location

        System.out.println(nums.length); // instance variable/property

        // to print out the content of the array
        for (int j = 0; j < nums.length; j++) {

            System.out.print(nums[j] + " ");
        }

        System.out.println();
        // the easier way is to use Arrays class from java.util

        System.out.println(Arrays.toString(nums));

        // You can use array elements just like any variable

        System.out.println(nums[0] + nums[4]);

        // When you try to access an array element with an invalid index ArrayIndexOutOfBoundsException is thrown

//        System.out.println(nums[5]);  //ArrayIndexOutOfBoundsException is thrown

//        System.out.println(nums[-2]);
//        System.out.println(nums[1000]);

        double[] nums2 = new double[3];
        char[] chars = new char[5];
        String[] strings = new String[5];
        boolean[] bols = new boolean[12];

    }
}