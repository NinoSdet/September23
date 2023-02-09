/* Create a method that takes a Map and replaces the null value of each entry with an empty string */
package January23;
import java.util.*;
public class ClassTask_replaceNulls {
    public static void main(String[] args) {

        Map<String, String> location =  new HashMap<>();

        location.put("id",  "1");
        location.put("latitude", "0.0");
        location.put("longitude", "0.0");
        location.put("address", "169 Rath Rapids");
        location.put("building_name", null);
        location.put("location_type_label", "Home");
        location.put("apartment_name", null);
        location.put("require_permission", "false");
        location.put("city", null);
        location.put("zip_code", null);

        System.out.println(removeNulls(location));
        //{building_name=, address=169 Rath Rapids, city=, latitude=0.0, require_permission=false, location_type_label=Home, apartment_name=, id=1, zip_code=, longitude=0.0}


    }

    public static Map<String, String> removeNulls(Map<String, String> map) {

        for (String key : map.keySet()) {

            if (map.get(key) == null) {
                map.put(key, "");

            }

        }
        return map;
    }
}