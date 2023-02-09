package January25;

import java.util.Stack;

public class Classtask067A {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));// "olleh"
    }

    public static String reverse(String str) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < str.length(); i++) { // for (char each: str. toCharArray()){
            ch.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();

        while (!ch.isEmpty()) { // String reversed = ""; while (!stack.isEmpty); reversed +=ch.pop();
            sb.append(ch.pop());

        }

        return sb.toString();
    }
}
