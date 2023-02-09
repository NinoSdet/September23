package september26;

public class CompoundAssignment {

    public static void main(String[] args) {

        int remainingInt = 56;

//        remainingInt = remainingInt * 2 ;

        remainingInt *= 2;

        System.out.println(remainingInt);

        double num = 3.5;

        num += 4.6;  // num = num + 4.6;

        System.out.println(num);

        int num2 = 13;

        num2 %= 5; // num = num % 5;

        System.out.println(num2);

        String str = "Java";

        str += "Script";  // str = str + "Script";

        System.out.println(str);

    }
}