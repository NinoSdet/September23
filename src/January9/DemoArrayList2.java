package January9;
import september26.IncrementDecrement;
import september26.IntegerOverflowUnderflow;
import java.util.ArrayList;
import java.util.List;
public class DemoArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("2323342");
        list.add(0,"First");
        System.out.println(list);
        list.add(0,"Another");
        System.out.println(list);

//        list.add(-1,"negative");// IndexOutOfBoundsException

        list.add(3,"end");//

        System.out.println(list);

//        list.add(100,"last");// IndexOutOfBoundsException

        String ele2 = list.get(2);
        System.out.println(ele2);

        // ArrayList uses size() method to retrieve the size
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // For each loop is the most convenient way to iterate through an ArrayList
        for (String s : list) {
            System.out.println(s);
        }

//        list.add(0, "end");
        System.out.println(list);

        list.remove(0);
        list.remove("end");  // removes the first occurrence of the value

        System.out.println(list);

        System.out.println(list.get(0));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.remove(Integer.valueOf(1));   //Integer.valueOf(1) returns -> new Integer(1)

        System.out.println(nums);

        list.add("AI");
        list.add("ChatGPT");
        System.out.println(list);

        list.set(2, "Machine Learning");
        System.out.println(list);

//        for (String s : list) {   // for each loop can't be used for modifying collection elements
        // because it uses a variable that is a copy of the original value in the collection
//           s = s + "X";
//        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "X");
        }

        System.out.println(list);

        list.add("ChatGPTX");

        System.out.println(list);
//
        System.out.println(list.indexOf("ChatGPTX"));
        System.out.println(list.lastIndexOf("ChatGPTX"));
        // indexOf()
        // lastIndexOf()

        // contains()

        System.out.println(list.contains("First"));
        System.out.println(list.contains("FirstX"));

//        list.clear();
//
        System.out.println(list);

        System.out.println(list.isEmpty());

//        int i = 0;
        while(!list.isEmpty()){  //

            System.out.println(list.get(0));
            list.remove(0);
        }

        System.out.println(list);

    }
}
