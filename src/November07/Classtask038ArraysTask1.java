package November07;

import java.util.Arrays;

public class Classtask038ArraysTask1 {
    public static void main(String[] args) {


        // Create an int array with size 30
        // intialize the array with random values between 0-100
        // print your array content with for loop (You can also use Arrays.toString())

        // EXTRA: Also find how many times 11 occured in the array.

        int[] nums = new int[30];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
            if (nums[i] == 11) {
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
}
