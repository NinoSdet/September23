package November09;

public class FindMax {


        public static void main(String[] args) {

            int[] arr = {3, 61, 30, 74, 74, 100, 34, 93, 5, 70, 48, 49, 59, 9, 79, 7, 30, 40, 57, 19, 67, 79, 70, 93, 33, 48, 94, 40, 48, 14, 43, 91, 81, 14, 95};

            // Find max value

            int max = arr[0]; //assume the first one is max

            for (int i = 1; i < arr.length ; i++) {

                if(arr[i] > max){  // if this is true we found the new max
                    max = arr[i]; // update the max with
                }
            }

            System.out.println("The max is " + max);

        }
    }

