package January11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class UsefulArraylistMethods {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(11);
        list.add(10);

        System.out.println(list);

        List<Integer> integers = Arrays.asList(1,1,2,3,4,4,5,6,6,6,7,32);  // lets you create an AL quickly
        System.out.println(integers);
      //  integers.add(23);  //UnsupportedOperationException is thrown when we try to add or delete items from this list
        // because this method returns a special type of list which is Unmodifiable

//        integers.set(0, 100); // this operation is possible

        System.out.println(integers);

        List<Integer> integers1 = List.of(1, 2, 3, 4, 5, 6, 67, 7, 87, 8, 9, 9);

        List<Object> dsf = List.of(1, "dsf");

        List<String> strings = List.of("ssa", "dsds", "dsdsd");

        // strings.add("3322");   // This type of list is also unmodifiable so if you need to convert it to a modifiable normal list
        // strings.set(0, "Hello"); // this operation is not possible

        System.out.println(strings);

        // To convert unmodifiable list into a normal list

        List<String> newModifiableList =  new ArrayList<>(strings);

        System.out.println(newModifiableList);
        newModifiableList.add("bdshbhbds");
        System.out.println(newModifiableList);

        // Convert list to an array

        Object[] objects = newModifiableList.toArray();  //create an array of Objects from arraylist of Strings

    }
}
