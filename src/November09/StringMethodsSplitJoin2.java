package November09;
import java.util.Arrays;
public class StringMethodsSplitJoin2 {



        public static void main(String[] args) {

            // Change each words initial char to uppercase
            String str = "the election is over";   // The Election Is Over

            String[] words = str.split(" ");

            System.out.println(Arrays.toString(words));

            for (int i = 0; i < words.length; i++) {

                String each  = words[i];

                char up = Character.toUpperCase(each.charAt(0));

                words[i] = each.replaceFirst(""+each.charAt(0), ""+up);
            }

            System.out.println(Arrays.toString(words));

            // join();

            String rebuilt =  String.join(" ", words);

            System.out.println(rebuilt);

        }
}