package November16;

public class BinarySearch {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
//        System.out.println(binarySearch(arr, 123));

        // To check the efficiency of the algorithm
        int[] arr = new int[100000000];
        arr[arr.length-1] = 4;




        long start = System.currentTimeMillis();
        System.out.println(binarySearch(arr, 4));
        long end = System.currentTimeMillis();
        System.out.println("The algorithm took " + (end-start) + " ms");
    }


    public static int binarySearch(int[] arr, int key){

        int begin = 0;
        int end = arr.length -1;

        while (end >= begin){

            int mid = (end + begin)/2;

            if(key < arr[mid]){
                end = mid -1;
            }else if( key == arr[mid]){
                return mid;
            }else{
                begin = mid + 1;
            }

        }

        return  -1;
    }
}
