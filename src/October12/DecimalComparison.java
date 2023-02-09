package October12;

public class DecimalComparison {
    public static void main(String[] args) {

        double num1 = 1.0 - 0.3 - 0.2;
        double num2 = 0.5;

        System.out.println(num1);
        System.out.println(num1 == num2);  // decimal values should not be compared with ==

        //To compare 2 decimal values
        // Check the difference and if the difference is less than some tolerable amount, then consider them equal

//
//        System.out.println(Math.abs(num1 - num2));
        if(Math.abs(num1 - num2) < 0.000000001){
            System.out.println("They are equal");
        }

    }
}
