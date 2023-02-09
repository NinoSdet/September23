/*Create a method that takes a  sentence and returns the count of occurrence of each word in alphabetical order. (make sure to lowercase all words)

Examples:
"I would like to go to the park and I would like to play soccer" ->  { and=1, go=1, i=2, like=2,  park=1, play=1,  soccer=1, the=1, to=3,  would=2}

"I you him you them you I her her her I" ->  {her=3, him=1,i=3,  them=1, you=3}
System.out.println(wordCount("The Galton Bridge is a cast-iron bridge in Smethwick, near Birmingham, in central England. It was built by Thomas Telford to carry a road across the new main line of the Birmingham Canal, which was built in a deep cutting. The bridge is 26 ft (7.9 m) wide, 150 ft (46 m) long, and 70 ft (21 m) above the canal, making it reputedly the highest single-span arch bridge in the world when it was built."));
      */
package January23;
import java.util.*;
public class ClassTask_069 {
    public static void main(String[] args) {


        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));//
        //{ and=1, go=1, i=2, like=2,  park=1, play=1,  soccer=1, the=1, to=3,  would=2}

        System.out.println(wordCount("I you him you them you I her her her I")); //
        System.out.println(wordCount("The Galton Bridge is a cast-iron bridge in Smethwick, near Birmingham, in central England. It was built by Thomas Telford to carry a road across the new main line of the Birmingham Canal, which was built in a deep cutting. The bridge is 26 ft (7.9 m) wide, 150 ft (46 m) long, and 70 ft (21 m) above the canal, making it reputedly the highest single-span arch bridge in the world when it was built."));
    }


    public static Map<String, Integer> wordCount(String sentence) {
        String sentence1 = sentence.toLowerCase();
        //  String[] words = sentence1.split("[ .,()]"); //split by anything else other than letters
        String[] words = sentence1.split("[^a-zA-Z]");
        Map<String, Integer> map = new TreeMap<>();


        for (String word : words) {
            if (!word.equals("")) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    int count = map.get(word);
                    count++;
                    map.put(word, count);

                }

            }

        }
        return map;
    }
}