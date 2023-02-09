package November18;

public class FindRowWithLargestSum {

        public static void main(String[] args) {

            int[][] arr = { {2, 14, 20, 16, 22, 12, 23, 24, 8},
                    {8, 4, 8, 1, 12, 16, 11, 6, 4},
                    {2, 2, 2, 13, 12, 19, 8, 9, 16},
                    {16, 21, 13, 1, 19, 4, 19, 14, 189}
            };


            // Find the sum of the first row and assume that it is the row with the max Sum
            int maxSum = 0;
            for (int i = 0; i < arr[0].length; i++) {
                maxSum += arr[0][i];
            }

            int maxSumRowIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                int sumOfCurrentRow = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    sumOfCurrentRow += arr[i][j];
                }
                if(sumOfCurrentRow>maxSum){
                    maxSum = sumOfCurrentRow;
                    maxSumRowIndex = i;
                }

            }

            System.out.println("The index of the row with max sum is " + maxSumRowIndex + " with sum " + maxSum);

        }
    }
