package November16;

import java.util.Arrays;

public class InterviewQuestionsClassTask052AAnagramWords {
    public static void main(String[] args) {
        System.out.println(isAnagram("abca", "caba")); // true   aabc aabc
        System.out.println(isAnagram("abc", "abb")); //-> false
        System.out.println(isAnagram("listen", "silent")); //-> true
        System.out.println(isAnagram("bored", "robed")); //-> true
        System.out.println(isAnagram("night", "thing")); // -> true
        System.out.println(isAnagram("stressed", "desserts")); //-> true
        System.out.println(isAnagram("cola", "loco")); //-> false


    }


    public static boolean isAnagram(String str1, String str2) {
        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        return Arrays.equals(str1arr, str2arr);


    }
}
