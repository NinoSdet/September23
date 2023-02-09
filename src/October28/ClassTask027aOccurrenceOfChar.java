package October28;

public class ClassTask027aOccurrenceOfChar {
    public static void main(String[] args) {

        System.out.println(countOfChar("Hello World", 'a')); //-> 0
        System.out.println(countOfChar("Hello World", 'l')); //-> 3
        System.out.println(countOfChar("occurence", 'c')); //-> 3
    }
    public static int countOfChar(String str, char ch) {
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            }
        }
        return count;
    }


}