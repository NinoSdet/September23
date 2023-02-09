package January23;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,8);

        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : list) {

            if(!map.containsKey(each)){ // if the number is occurring the first time (map does not contain the number as a key already), add it to the map
                map.put(each, 1);
            }else{  // if it is already in the map (not occurring the first time), then it is a duplicate value, return true for finding the duplicate value
                return true;
            }
        }

        return  false;

    }
}
