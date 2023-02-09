package October28;

public class ClassTask025ReverseNumbersSimple {
    public static void main(String[] args) {
        // test
        printReverse(123456); //-> 654321
        printReverse(100); //-> 001
        printReverse(1222222227); //-> -7222222221
        printReverse(5); //-> 5

    }

    public static void printReverse(int num) {
        while (num != 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
        System.out.println();
    }
}
