package October28;

public class ClassTask025ReverseNumbers {
    public static void main(String[] args) {
        // test
        System.out.println(printReverse(123456)); //-> 654321
        System.out.println(printReverse(100)); //-> 001
        System.out.println(printReverse(1222222227)); //-> 7222222221
        System.out.println(printReverse(5)); //-> 5

    }

    public static long printReverse(long num){
        long reverseNumber = 0;
        while (num>0){
            reverseNumber=reverseNumber*10+num%10;
            num = num/10;
        }return reverseNumber;
    }
}
