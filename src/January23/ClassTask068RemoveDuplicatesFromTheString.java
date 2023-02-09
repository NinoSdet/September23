
/*Given s String, return the String with duplicate chars removed ->

Ex:
 "abaaabbbbacaaafbbbbaccchhh" -> "abcfh"
 "dhbshfsdkkfsdjhjf" -> "dhbsfkj"

 Use Set interface to implement the logic*/
package January23;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static java.util.Arrays.*;

public class ClassTask068RemoveDuplicatesFromTheString {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("abaaabbbbacaaafbbbbaccchhh"));
        System.out.println(removeDuplicates("dhbshfsdkkfsdjhjf"));
        //Test your method here

    }


    public static String removeDuplicates(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(Character ch: str.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : set){
            sb.append(ch);
        }
        return sb.toString();
    }
}
