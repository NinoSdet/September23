package November16;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(arr, 6));

        // To check the efficiency of the algorithm
//        int[] arr = new int[1000000000];
//        arr[arr.length-1] = 4;
//
//
//
//
//        long start = System.currentTimeMillis();
//        System.out.println(linearSearch(arr, 4));
//        long end = System.currentTimeMillis();
//        System.out.println("The algorithm took " + (end-start) + " ms");
    }

    public static int linearSearch(int[] arr, int key){


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }

        return -1;

    }
}
