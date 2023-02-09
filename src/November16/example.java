package November16;

public class example {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        int x=5;
        System.out.println(x > 2 ? x < 4 ? 10: 8 : 7);
    }
}