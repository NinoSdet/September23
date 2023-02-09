package september23;

public class ReversingTheIntegerManuallyInterviewQuestion {
    public static void main(String[] args) {
        // 378 -> 873
        int number = 378;
        // continuously extract the last digit and then remove the last digit
        int third = number %10; //8
        number = number /10; //378 -> 37
        int second = number %10; //7
        number = number /10; //37 -> 3
        int first = number %10; // 3%10 ==3
        number = number /10; //3 -> 0
        System.out.println(""+third+second+first); //873


    }
}
