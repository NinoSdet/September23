package October19;

public class Stringdemo3 {




        public static void main(String[] args) {

            String str = "Messi is better than Ronaldo";

            String ronaldo = str.substring(21);

            System.out.println(str.substring(0,5));
            System.out.println(str.substring(6,8));

            String lastname = "Robinson";

            System.out.println(lastname.substring(lastname.length()-3));

            System.out.println(lastname.substring(2,2)); // returns empty string

        }
    }

