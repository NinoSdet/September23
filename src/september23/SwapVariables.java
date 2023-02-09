package september23;

public class SwapVariables {
    public static void main(String[] args) {

        //Swap variable values without using a third variable

        int x =5;
    int y =7;

    // 5+7
    x = x + y; //12
        // 12-7
        y = x - y; //5

        x = x - y; // 12-5 = 7


        System.out.println(x);
        System.out.println(y);

    }
}
