package January11;
import java.util.*;
public class CollectionsMethods {
    public static void main(String[] args) {

        List<Integer> nums =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);
        Collections.sort(nums); //

        System.out.println(nums);

        List<String> names =  Arrays.asList("D", "a", "b", "F");

        Collections.sort(names);
        System.out.println(names);

//        List<Student> students = Arrays.asList( new Student(1,"John"), new Student(3, "Danny"));

        // Collections.sort(students); // doesn't work beacuse student class does not have comparison logic

        List<Integer> nums2 =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);

        Collections.sort(nums2);

        System.out.println(nums2);
        int i = Collections.binarySearch(nums2, 8);
        System.out.println(i);

        Collections.reverse(nums2);  // to have your list in descending order, you can sort normally and reverse the order

        System.out.println(nums2);

        Collections.shuffle(nums2);

        System.out.println(nums2);

        List<Integer> nums3 =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);

        Collections.copy(nums3, nums2);  // destination, source

        //The destination list's size must be greater than or equal to the source list's size.

        System.out.println("Nums 2");
        System.out.println(nums2);
        System.out.println("Nums 3");
        System.out.println(nums3);

        List<Integer> nums4 =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);

        Collections.fill(nums4, 0);

        System.out.println(nums4);

        List<Integer> nums6 =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);

        Integer max = Collections.max(nums6);
        Integer min = Collections.min(nums6);

        System.out.println(max);
        System.out.println(min);

        List<Integer> nums7 =  Arrays.asList(1,2,3);
        List<Integer> nums8 =  Arrays.asList(4,5,6);

        System.out.println(Collections.disjoint(nums7, nums8));

        List<Integer> nums9 =  Arrays.asList(2,3,54,1,6,2,8,4,5,73,23,44,21);
        System.out.println(Collections.frequency(nums9,8));

        System.out.println(Collections.frequency(nums9,11));
        System.out.println(Collections.frequency(nums9,2));

        List<Character> chars = List.of('j', 'a', 'v', 'a');
        Collections.frequency(chars, 'a');

    }
}
