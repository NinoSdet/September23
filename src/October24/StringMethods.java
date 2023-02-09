package October24;

public class StringMethods {


        public static void main(String[] args) {

            String text = "Adidas AG [4] is a German multinational corporation, founded and headquartered in Herzogenaurach, Bavaria, that designs and manufactures shoes, clothing and accessories. It is the largest sportswear manufacturer in Europe, and the second largest in the world, after Nike";

            System.out.println(text);
//        String replaced = text.replace('a', 'o');
//
//        System.out.println(replaced);

//        String replaced = text.replace("founded and headquartered", "created");
//
//        System.out.println(replaced);

            String replaced = text.replace("founded", "created").replace("headquartered", "created");

            System.out.println(replaced);

            String price = "$19,950.00";

            System.out.println(price.replace("$", "").replace(",", ""));

            String another = "Adidas  is a German multinational Adidas corporation Adidas";

//        System.out.println(another.replaceFirst("Adidas", "Nike"));

            System.out.println(another.replaceAll("Adidas", "Nike"));

            System.out.println();

            String price2 = "$1,299,555.00";

            System.out.println(price2.replaceAll("[$,.]", "")); //replace multiple chars with empty string

            String str = " \t\n";

            System.out.println(str.isEmpty());

            if(!str.isEmpty()){
                System.out.println(str.toUpperCase());
            }

            System.out.println(str.isBlank());

            // It is important to check if a String (or any object) is null before calling any method

            String name = null; // no value, not initialized

//        NullPointerException is thrown when a method is called on an object that has null value, when the object is not initialized

            if(name != null){ // adding a check for null
                System.out.println(name.toUpperCase());
            }

            System.out.println("After ");

            String last = "Scott";
            System.out.println(last.replace("t", ""));

            int num = 32432243;

            String numAsString = String.valueOf(num);// converts any non-string into a String

            // Non-static (instance) methods - methods that require object creation. Static methods do not require objects.

            String numAsString2 = num + "";
        }
    }

