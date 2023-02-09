package January9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
public class DemoArrayList {
    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList();  // raw type
//
//        arrayList.add("hello");
//        arrayList.add("hi");
//        arrayList.add(34);
//        arrayList.add(3.4);
//        arrayList.add(3.2);

//        for (Object o : arrayList) {
//            System.out.println(((String)o).substring(2));
//        }
//
//        System.out.println(arrayList);

        ArrayList<String> list = new ArrayList<>();  // <> generics introduced in java 1.5
        // it enforces specific type for the ArrayList
//        list.add(34);
        list.add("Java");
        list.add("Python");

        ArrayList<String> another = new ArrayList<>(list);  // constructor that takes another arraylist

        System.out.println(another);

        ArrayList<String> list2 = new ArrayList<>(100);

        // default capacity of ArrayList -> 10
        // once it is full, it is automatically increased by 2 times.

        List<String> list3 = new ArrayList<>();  //

        list3.add("bcdsvhg");
        list3.add("cdbsgvgd");

        // primitive types are not allowed as the types in all Collections
        ArrayList<Double> numbers =  new ArrayList();
//        numbers.add(34); // new Integer(34)
//        numbers.add(2);  // new Integer(2)
        numbers.add(2.5);

        System.out.println(numbers);

        ArrayList<Object> row = new ArrayList<>();

        row.add(34.5);
        row.add(2);
        row.add("csdcs");
        row.add(new Apple());

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new McIntosh());
        fruits.add(new Orange());

    }
}
