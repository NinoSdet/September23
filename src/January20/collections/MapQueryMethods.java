package January20.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapQueryMethods {

    public static void main(String[] args) {


        Map<Long, String> students =  new HashMap<>();

        students.put(34656363L, "John Doe" );
        students.put(327864234L, "Jane Doe" );
        students.put(465464544L, "Alice Smith" );
        students.put(675567575L, "Bob Dole" );
        students.put(56756765L, "Al Gore" );
        students.put(342432423L, "Al Gore" );

        System.out.println(students.containsKey(34656363L));
        System.out.println(students.containsKey(3L));

        if(!students.containsKey(56756765L)){
            students.put(56756765L, "Alan Watts" );
        }
        System.out.println(students);

        System.out.println(students.containsValue("Al Gore"));
        System.out.println(students.containsValue("Alan Watt"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        //Grab all ssns into a collection
//        Set<String> sets;

        Set<Long> keys = students.keySet(); // this returns a set

        for (Long key : keys) {
            System.out.println(key);
        }


        //Grab all names into a collection

       Collection<String> names=  students.values();

        for (String name : names) {
            System.out.println(name);
        }



        // Grab all entries into a collection
        // update each entries value with uppercase
        Set<Map.Entry<Long, String>> entries = students.entrySet();

        for (Map.Entry<Long, String> entry : entries) {
            System.out.println(entry.setValue(entry.getValue()).toUpperCase());
        }


        // iterate through map
        // you can do it through getting set of entries then use for-each loop


        Map<Long, String> persons =  new HashMap<>();

        persons.put(34656363L, "John Doe" );
        persons.put(327864234L, "Jane Doe" );
        persons.put(465464544L, "Alice Smith" );
        persons.put(675567575L, "Bob Dole" );
        persons.put(56756765L, "Al Gore" );
        persons.put(342432423L, "Al Gore" );

        for (Map.Entry<Long, String> keyValuePair : persons.entrySet()) {
            System.out.println(keyValuePair);
        }



    }

}
