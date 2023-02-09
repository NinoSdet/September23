package October12;

public class NestedIF {
    public static void main(String[] args) {

            int num = 30;

            if (num > 0) {

                System.out.println("Positive");
                if (num % 2 == 0) {
                    System.out.println("Even");
                    if (num % 5 == 0) {
                        System.out.println("Div by 5");

                        if (num % 10 == 0) {
                            System.out.println("Divisible by 10");
                        }
                    }
                } else {
                    System.out.println("Odd");
                }
            } else {

                if (num == 0) {
                    System.out.println("Zero");
                } else {
                    System.out.println("Negative");
                    if (num % 3 == 0) {
                        System.out.println("Divisible by 3");
                    } else {
                        System.out.println("Not Divisible by 3");
                    }
                }

            }

        }
    }
