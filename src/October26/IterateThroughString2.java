package October26;

public class IterateThroughString2 {

        public static void main(String[] args) {

            String str = "Mercedes' are expensive";

            int i = 0;

            String newStr = "";

            while ( i < str.length() ){
                if(str.charAt(i) != 'e'){
                    newStr += str.charAt(i); // newStr += means  ->  newStr = newStr + str.charAt(i);

                }

                i++;
            }

            System.out.println(newStr);

        }
    }
