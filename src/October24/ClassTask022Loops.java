package October24;

public class ClassTask022Loops {
    public static void main(String[] args) {
        //Test here
        printMessage("Hello" , 5 );//-> prints Hello 5 times
        printMessage("Hello" , 1000 );// -> prints Hello 1000 times
        printMessage("Welcome to VA" , 500 );// -> prints Welcome to VA 500 times
        printMessage("Loops are powerful" , 25 );// -> prints Loops are powerful 25 times
        printMessage("Bye" , 0 );// -> Nothing should be printed
    }
    public static void printMessage(String str, int times){
        // Create your method here
        int count =0;
        while (count < times){
            System. out.println(str);
            count++;
        }
    }
}
