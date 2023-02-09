package November09;

public class Classtask045TheIndexOfMinAndMinValue {
    public static void main(String[] args) {

        //Find the index of minimum value in an array

        int[] arr = {34,22,45,12,56,22,77,12};  // 3

        // The minimum value in this array is 12 which is located at index 3
        int minIndex = 0;
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]< min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("The min is " + min + "; min index is: "+ minIndex);

    }
}
