package October19;

public class StringDemo {



        public static void main(String[] args) {

//        String str =  new String("java");

            String str = "java is hard";

            System.out.println(str.length());

            int length = str.length();

            System.out.println("Hello".length());
            System.out.println("".length()); // empty string's length is 0

            String str2 = "string";
            System.out.println(str2.length());

            char ch = str2.charAt(1);
            System.out.println(ch);

//        System.out.println(str2.charAt(-1)); // StringIndexOutOfBoundsException

//        System.out.println(str2.charAt(6)); //

            System.out.println(str2.charAt(0)); // get the first char
            System.out.println(str2.charAt(str2.length()-1)); // dynamically get the last character

            String name = "Joe";
            String last = "Doe";

//        String full = name + last;
//        String full = name.concat(" ").concat(last); // chaining methods

            String another = name.concat(" ").concat(last).concat("!");
            // String is immutable, calling a method on a string object does not change the string's value
            // it simply returns a NEW string with a new value

            System.out.println(another);
            System.out.println(name);

            name = name.concat(" Schmo");  // if you reassign the returned value of the method call, the change can be seen

            System.out.println(name);

            String nameOfTheProduct = "AdIdaS";

            System.out.println(nameOfTheProduct.toLowerCase());
            System.out.println(nameOfTheProduct.toUpperCase());

//        nameOfTheProduct = nameOfTheProduct.toLowerCase();

            if(nameOfTheProduct.toLowerCase().equals("adidas")){
                System.out.println("Do something");
            }

            String someText = "     Plan for the next phase of work with purpose-built hybrid tools\t                 ";

            System.out.println(someText);
            System.out.println(someText.trim());
            System.out.println(someText);

        }
    }

