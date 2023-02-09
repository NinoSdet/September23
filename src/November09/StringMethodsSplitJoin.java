package November09;
import java.util.Arrays;
public class StringMethodsSplitJoin {


        public static void main(String[] args) {

            String str = "We love Java";   // Java love We

            String[] words = str.split(" ");

            System.out.println(Arrays.toString(words));

            String strReversedWords= "";

            for (int i = words.length -1; i >=0 ; i--) {
                strReversedWords += words[i] + " ";
            }

            System.out.println(strReversedWords);
        }
    }

