package October19;

public class StringDemo4 {



        public static void main(String[] args) {

            String str = "Messi is Ronaldo better ";

            System.out.println(str.indexOf('s')); //
            System.out.println(str.indexOf("Messi")); //
            System.out.println(str.indexOf("Ronaldo")); //

            // Extract Ronaldo from a text

            if(str.contains("Ronaldo")){

                int indexOfRonaldo = str.indexOf("Ronaldo");

                String ron = str.substring(indexOfRonaldo, indexOfRonaldo+"Ronaldo".length());
                System.out.println(ron);
            }

            String date = "Wed November 19 21:49:49 EDT 2022";

            int indexOfFirstSpace = date.indexOf(" ");
            int indexOfSecondSpace = date.indexOf(" ", indexOfFirstSpace+1 );

            System.out.println(date.substring(indexOfFirstSpace+1, indexOfSecondSpace ));

            System.out.println(date.indexOf("49"));
            System.out.println(date.lastIndexOf("49"));

        }
    }


