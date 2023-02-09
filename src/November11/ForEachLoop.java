package November11;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int element : arr){
            System.out.println(element);
        }

        String [] names = {"John", "Dana", "Robin"};

        for (String name : names){
            System.out.println(name.toUpperCase());
        }

        System.out.println(Arrays.toString(names));

        // For each loops cannot be used in cases where you need an index (when you traverse till the middle, traverse in reverse direction)

        int [] arr2 = {1,2,3,4,5,6,7,8};

//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr2[i] * 10;
//        }

        // iter -> shortcut for  for each

        // for each loop cannot be used to MODIFY the array element values
        // beacuse for each loop  variable is a COPY of the array element.
//        for (int i : arr2) {
//          i = i * 10;
//        }

        // get the sum of odd nums
        int oddSum = 0;
        for (int each : arr2) {
            if(each % 2 != 0 ){
                oddSum += each;
            }
        }

        System.out.println("Odd sum " + oddSum);

        System.out.println(Arrays.toString(arr2));

        // Behind the scenes for each loop uses the copy of each element

        int [] nums = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < nums.length; i++) {
            int each =  nums[i];  // numbs[i] is the original array element, each is the copy of nums[i]
            each = each * 10;    //  in for each loops, the update of the variable is the update of the copy so it has no effect to the original array element
        }

        System.out.println(Arrays.toString(nums));

    }
}
