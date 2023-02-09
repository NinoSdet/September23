package January23;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class OtherMapClasses {
    public static void main(String[] args) {

//        Map<Long, String> students =  new LinkedHashMap<>();
//
//        students.put(34656363L, "John Doe" );
//        students.put(327864234L, "Jane Doe" );
//        students.put(465464544L, "Alice Smith" );
//        students.put(675567575L, "Bob Dole" );
//        students.put(56756765L, "Al Gore" );
//
//        System.out.println(students);

        // null values

//        List<String> list = Arrays.asList(null, null, null, null);
//        System.out.println(list);

        // Can hashmap and linkedhashmap contain null key and null values and how many?
        // Yes, they both can contain at most one null key and as many null values as possible

//        Map<Long, String> students =  new HashMap<>();
//
//        students.put(34656363L, "John Doe" );
//        students.put(327864234L, "Jane Doe" );
//        students.put(465464544L, "Alice Smith" );
//        students.put(675567575L, "Bob Dole" );
//        students.put(56756765L, "Al Gore" );
//        students.put(null, "John Travolta" );
//        students.put(null, "Johnny Cage" );
//
//        System.out.println(students);

        // TreeMap sorts the entries by the key

        Map<Long, String> students =  new TreeMap<>();

        students.put(34L, "John Doe" );
        students.put(32L, "Jane Doe" );
        students.put(46L, "Alice Smith" );
        students.put(67L, "Bob Dole" );
        students.put(56L, "Al Gore" );
//        students.put(null, "Johnny Cage" );   null keys are not allowed in treemap because keys are sorted automatically when entries are added to the map

        students.put(22L, null);  // null values are fine
        students.put(25L, null);
        System.out.println(students);

        Map<Long, String> students1 =  new Hashtable<>();
        // Legacy class
        // The main difference is Hashtable is syncronized
        // But there is a little need for it since we can get the syncronized version of HashMap using Collections class

        Map<Long, String> synchronizedMap = Collections.synchronizedMap(students);

    }
}
