package November07;


        import java.util.Arrays;
import java.util.Scanner;

    public class ArrayDemo2 {

        public static void main(String[] args) {

            // Shorthand array initialization

            double [] nums = { 2.3, 4.5, 3.3, 6, 7, 2.1 };

            System.out.println(nums.length);

            System.out.println(Arrays.toString(nums));

            String [] names = new String[]{"Hassan", "Nazar", "Dania", "Musanbar"};
            String [] names2 = {"Hassan", "Nazar", "Dania", "Musanbar"};

            int[] nums2 = {1,2,3,4,5};
            doSomethingWithArray(nums2);
//        doSomethingWithArray({1,2,3,4,5});//doesn't work beacuse {1,2,3,4,5} is not an array object
            doSomethingWithArray(new int[]{1,2,3}); // anonymous array object

//         int[] nums3;
//         nums3 = {1,2,3,4,5};  //doesn't work

            char [] nums3;
            nums3 = new char[]{'a', 'v', 'd'};

            // Access array's last element dynamically

            System.out.println(nums3[nums3.length-1]);

            // Default values of an array object

            String[] arr1 = new String[6];
            System.out.println(Arrays.toString(arr1));

        }

        public static void doSomethingWithArray(int [] arr){
            System.out.println(Arrays.toString(arr));
        }

    }

