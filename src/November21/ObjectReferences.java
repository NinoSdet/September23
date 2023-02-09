package November21;

   import java.util.Arrays;

    public class ObjectReferences {

        public static void main(String[] args) {

            int[] nums = {1,2,3,4};
            int[] nums2 = nums;
            int[] nums3 = nums;

            nums2[0] = 99;

            System.out.println(Arrays.toString(nums2));
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(nums3));

            nums3[3] = 100;

            System.out.println(Arrays.toString(nums2));
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(nums3));

        }

    }

