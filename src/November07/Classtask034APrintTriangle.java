package November07;

public class Classtask034APrintTriangle {
    public static void main(String[] args) {

        // Use nested loops to print out the patterns given in the picture files


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
           for (int k = 7-i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

    }

        }


