package January20.collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class ChangesWithJava8 {

    String str;



    public static void main(String[] args) {


        // Lambdas    ->
        // Streams ->
        // Interface default and static methods
        // New Date and Time classes


        List<String> names = List.of("John", "Jane", "Bob", "Alice");

//        names.forEach( each -> System.out.println(each.toUpperCase()));

        List<String> changed = names.stream().map(s -> s.substring(0, 1)).toList();

        System.out.println(changed);

        // Pre-Java 8 -> Date, Calendar
        // Java 8 ->  LocalDate, LocalTime, LocalDateTime

        System.out.println(LocalDateTime.now());


        // After Java 8 till 17
        // Records,
        // var as type for a local variable
        // Multiline String  -> """


        List<Integer> nums = new ArrayList<>();
        var nums1 = new ArrayList<>();
        var str = "dcbs";

        Integer i = 89;

        String text = """
                Hello
                World
                Another
                Line
                """;


        List<Integer> nums4 = new LinkedList<>(); //









    }
}
