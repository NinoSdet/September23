package November07;

public class AmericanFlag {

    public static void main(String[] args) {
        // Using nested loops, print out the flag
        // Use Conditionals, continue keyword.
        // The flag dimensions - 13x50
        // The stars - 5x10

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 50; j++) {
                if (j < 10 && i < 5) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}

