package October26;
import java.util.Random;
public class AccumulatorLoop2 {




        public static void main(String[] args) {

            System.out.println(getRandomString(8));
            System.out.println(getRandomString(42));

        }

        public static String getRandomString(int length){
            int i = 0;
            String newStr = "";
            while ( i < length){
                char ch = (char)(97 + new Random().nextInt(26));
                newStr = newStr + ch ;
                i++;
            }

            return newStr;
        }
    }

