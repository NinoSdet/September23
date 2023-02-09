package October26;

public class LoopDemo3 {
    public static void main(String[] args) {

//       printRandomChar5times();

        printRandomCharNtimes(1000);

    }


    public static void printRandomChar5times() {
        System.out.print((char) ('a' + (int) (Math.random() * 26)));
        System.out.print((char) ('a' + (int) (Math.random() * 26)));
        System.out.print((char) ('a' + (int) (Math.random() * 26)));
        System.out.print((char) ('a' + (int) (Math.random() * 26)));
        System.out.print((char) ('a' + (int) (Math.random() * 26)));
    }

    public static void printRandomCharNtimes(int times) {

        int count = 0;

        while (count < times) {
            System.out.print((char) ('a' + (int) (Math.random() * 26)));
            count++;
        }

    }
}
