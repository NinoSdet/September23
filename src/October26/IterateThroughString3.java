package October26;

public class IterateThroughString3 {

        public static void main(String[] args) {

            String text = "Process finished with exit code";

            int i = 0;

            String another = "";

            while ( i < text.length() ){
                char eachChar =  text.charAt(i);

                if(eachChar == 'o' || eachChar == 'i'){
                    another += eachChar;
                }

                i++;
            }

            System.out.println(another);

        }
    }

