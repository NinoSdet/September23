package January20.collections;

import java.util.Collections;
import java.util.List;

public class CollectionsIntro {


    //Collections Framework -> a term by Java to represent four interfaces: Map, List, Set, Queue
    // Collections ->  utility class to perform operation on List, Set, Queue
    // Collection -> a super interface of List,Set,Queue



    public static void main(String[] args) {


        List<String> names = List.of("John", "Jane", "Bob", "Alice");

        Collections.binarySearch(names, "cdhsvbg");
    }
}
