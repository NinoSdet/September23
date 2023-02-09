package January11;
import java.util.*;
public class ClassTask066PigLatin {



        public static void main(String[] args) {


            ArrayList<String> list = new ArrayList<>();

            list.add("java");
            list.add("hello");
            list.add("hi");
            list.add("phone");

            // test the method here by passing the above arraylist

            ArrayList<String> updatedList = changePigLatin(list);

            System.out.println(updatedList);


            //

        }


        // Create the method here

        // Create a method that accepts an ArrayList<String>  and processes the ArrayList so that each String in that arraylist is pig latined (move the first letter to the end and add "ay")
        // and returns the ArrayList
        //  {"java", "hello", "hi", "phone"} -> {"avajay", "ellohay", "ihay", "honepay"}

        public static ArrayList<String> changePigLatin(ArrayList<String> list) {
            ArrayList<String> result = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String elements = list.get(i);
                elements = elements.substring(1) + elements.substring(0, 1) + "ay";
                result.add(elements);
        // second implementation
                // for (String each : list) {
                //String firstLetter = each.substring (0,1);
                // String restOfWord = each.substring(1);
               //String pigLatin = restOfWord + firstLetter + "ay";

                // updatedList.add(pigLatin);
                //}
                // return updatedList;

        // third implementation
        //  for (int i = 0; i < list.size(); i++) {
        //list.set(i, list.get(i).substring(1)+list.get(i).charAt(0)+ "ay");}
        //return list;
        //}

            }
            return result;

        }
    }
