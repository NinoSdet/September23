package January20.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountAlgo {

    public static void main(String[] args) {









        List<String> words = List.of("HI", "hello", "hi", "hola", "hello", "bonjour", "hi", "hi");

        // Word count frequency algorithm

       // hello=2, hi=3, hola=1, bonjour=1

        Map<String, Integer> map =  new HashMap<>();


        for (String word: words){


            // if my map does not contain the word (it is occuring the first time)
            if(!map.containsKey(word)){
                map.put(word, 1); //put it into a map with the hardcoded value as 1
            }else{
              int count =  map.get(word); // grab the current value
              count++; // increment by one
              map.put(word, count);  // update the previous value with the new value
            }


        }


        System.out.println(map);


    }
}
