//Create a method takes an List of Characters and removes non-alphanumeric characters from the list.
package January11;

import java.util.*;

public class ClassTask066bRemoveDuplicates {
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('a');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('c');
        list.add('d');
        list.add('d');
        list.add('d');


        removeDuplicates(list);
        System.out.println(list);  //   [a, b, c, d]

    }

    public static void removeDuplicates(List<Character> list) {
        //  write your implementation here
        Collections.sort(list);
        int index = 0;
        //while(index < list.size()-1) {
        for (index = 0; index < list.size() - 1; ) {
            if (list.get(index).equals(list.get(index + 1))) {
                list.remove(index);
            } else {
                index++;
            }
        }


    }
}
