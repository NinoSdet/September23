package October19;

public class StringDemo2 {




        public static void main(String[] args) {

            String str = "Hello World";

            System.out.println(str.equals("hello world"));
            System.out.println(str.equalsIgnoreCase("hello world"));

            System.out.println("a".compareTo("b"));
            System.out.println("b".compareTo("a"));
            System.out.println("hello".compareTo("world"));

            System.out.println("a".compareTo("A"));
            System.out.println("a".compareToIgnoreCase("A"));

            System.out.println("01".compareTo("10"));

            String noun = "wife";

            if(noun.endsWith("ey")){
                System.out.println("Multiple is: " + "ies");
            }else if(noun.endsWith("ife")){
                System.out.println("Multiple is: ives");
            }

            String str3 = "Apple products are expensive";

            System.out.println(str3.startsWith("Apple p"));

            System.out.println(str3.contains("s a"));
            System.out.println(str3.contains("e e"));
            System.out.println(str3.contains("Apple"));
            System.out.println(str3.contains("zry"));

        }
    }

