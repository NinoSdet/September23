package January20.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {


    public static void main(String[] args) {

//        HashMap<Integer, String> students =  new HashMap<>();

        // Hashmap does not keep the order of insertion
        // The order of hashmap entries cannot be determined, since it uses each objects hash
        Map<Long, String> students =  new HashMap<>();

        students.put(34656363L, "John Doe" );
        students.put(327864234L, "Jane Doe" );
        students.put(465464544L, "Alice Smith" );
        students.put(675567575L, "Bob Dole" );
        students.put(56756765L, "Al Gore" );
        // calling put method with the same key and different value
        // will replace the entry with the new value
        students.put(56756765L, "Greta Thunberg" );
        students.put(34656363L, "John Doe" );

        Map<Long, String> students2 =  Map.of(
                34656363L, "John Doe",
                327864234L, "Jane Doe",
                465464544L, "Alice Smith"); // Shortcut to create a map quickly
                                                 // but it returns Unmodifiable map, cannot sort or update


        System.out.println(students);

        String st = students.get(34656363L);
        System.out.println(st);

        System.out.println(students.get(1L)); // get method with an invalid (non-existent) key returns null


        students.remove(465464544L); // removes the entry (key-value pair)
        System.out.println(students);

        Map<Integer, List<Object>> person =  new HashMap<>();
        person.put(1, List.of("Al" ,"Gore", 28, true, 89.5));


        Map<Integer, List<Object>> people =  new HashMap<>();
        people.put(1, List.of("John" ,"Doe", 28, true, 89.5));
        people.put(2, List.of("Jane" ,"Smith", 32, true, 45));
        people.put(3, List.of("Bob" ,"Dole", 34, true, 34));

        System.out.println(people);

        people.clear(); // clears all entries
        people.putAll(person); // adds all entries from one map to another

        System.out.println(people);




    }
}
