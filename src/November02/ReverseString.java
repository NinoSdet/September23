package November02;



public class ReverseString {

    public static void main(String[] args) {

        // print string in reverse
        // access each character of the string from the end index till the beginning index and print/accumulate into another string

        String str ="Hello";
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i) ); // print
            newStr += str.charAt(i); // accumulate into another string
        }

        System.out.println(newStr);
    }
}