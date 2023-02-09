package september23;

public class SwapVariablesAssignment {
    public static void main(String[] args) {


        int x = 55;
        int y = 77;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}