package November18;
import java.util.Arrays;
public class TwoDimArrays {




        public static void main(String[] args) {

//        int[] arr;
//        int arr2 [];

//
//        int[][] arr1;
//        int[] arr2 [];
//        int arr3[][];

            int[][] arr1, arr4;
            int[] arr2 [], arr5;
            int arr3[][], arr6;

            arr4 =  new int[1][1]; // int[][]
            arr5 = new int[4]; // int[]
            arr6 = 0;  // int

            String [][] names = new String[5][4];

            names[0][0] = "Nazar";
            names[3][1] = "Maxim";
            names[4][2] = "Dania";

//        System.out.println(Arrays.deepToString(names));
            for (String[] each : names) {
                System.out.println(Arrays.toString(each));
            }

            String[][] users = {
                    { "jimmie.kreiger", "Marcela Sporer", "Hedwig" ,"ffsdf@gmail.com" ,  "dsffdsdfsdgbvc cxvdffsbe6712627a"},
                    {"refugio.thiel" ,"Nicolas Bogan",  "Allen" , "feil @gmail.com" ,  "4025165 a7bbb2a86b865572e6712627a"},
                    {"heath.wisozk", "Cyrus Schamberger", "Donny" ,"mills @gmail.com",  "a667048e38942780b6cff4cf9a7474e" }
            };

            System.out.println(Arrays.deepToString(users));

            System.out.println(users.length);
            System.out.println(users[0].length);

            for (int i = 0; i < users.length ; i++) {

                for (int j = 0; j < users[i].length; j++) {
                    System.out.print(users[i][j] + "\t");
                }
                System.out.println();
            }

            int[][] ragged = { {1,2,3,4,5}, {1,2,3,4}, {1,2,3}, {1,2}, {1}};

            // Get the sum of all elements
            int sum = 0;

            for (int i = 0; i < ragged.length; i++) {
                for (int j = 0; j < ragged[i].length; j++) {
                    sum += ragged[i][j];
                }
            }

            System.out.println("Sum of all elements in this 2d array: " + sum);

            // Get the sum of each inner array elements
            int[] sums = new int[ragged.length];  // to  store each inner array sum

            for (int i = 0; i < ragged.length; i++) {
                int total = 0; // to accumulate the sum of each inner array, re-initialized to 0 with each iteration of outer loop
                for (int j = 0; j < ragged[i].length; j++) {
                    total += ragged[i][j]; // accumulate the total for current inner array
                }
                sums[i] = total;  // store the total for the current inner array in sums array
            }

            System.out.println("Sums of each inner array in this 2d array: " + Arrays.toString(sums));

        }
    }