package November21;
import java.util.Arrays;
public class PassByValueForArrays {

        public static void main(String[] args) {

            int[] nums = {1,2,3,4};

            increment(nums);  // call a method by passing a variable

            System.out.println("Nums array content is " + Arrays.toString(nums));

            // If a method passes a variable of Object type to another method, and the other method changes the object,
            // the object value in the calling method is changed.
            // Although the value(copy) of the object reference is passed, when one reference changes the object, the other reference sees the change
            // Because they are both pointing to the same object.

        }

        public static void increment(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                arr[i]++;
            }
            System.out.println("Arr array content is " + Arrays.toString(arr));
        }
    }

