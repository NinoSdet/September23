package November11;

public class ClassTask047CheckIncreasingOrder {
    public static void main(String[] args) {

        // TESTS

        System.out.println(numsIncreasing(new int[]{1, 3, 4}));  //→ true
        System.out.println(numsIncreasing(new int[]{1, 3, 2})); // → false
        System.out.println(numsIncreasing(new int[]{1, 1, 4})); // → true



    }


    public static boolean numsIncreasing(int[] arr) {
            for (int i=0; i<arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    return false;
                }
            }

        return true;
    }
}
