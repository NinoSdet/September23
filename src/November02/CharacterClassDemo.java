package November02;

public class CharacterClassDemo {


        public static void main(String[] args) {

            int i = 8;
            Integer i2 = 5;

            System.out.println(i2.doubleValue());

            char ch = '%';

            Character ch2 = '@';

            boolean result = Character.isDigit('5');

            System.out.println(result);
            System.out.println(Character.isLetter('a'));
            System.out.println(Character.isLetter('$'));
            System.out.println(Character.isLetter('\u00FC'));  // chars from other languages are also considered
            System.out.println(Character.isLetterOrDigit('1'));
            System.out.println(Character.isLetterOrDigit('a'));
            System.out.println(Character.isLetterOrDigit('!'));

            String str  ="0x71C7656EC7ab88b098defB751B7401B5f6d8976F";
            // Create a new string that consists of only numbers from the string

            String onlyNums = "";

            for (int j = 0; j < str.length(); j++) {

                if(Character.isDigit(str.charAt(j))){
                    onlyNums += str.charAt(j);
                }

            }

            System.out.println(onlyNums);

            System.out.println(Character.isUpperCase('A'));
            System.out.println(Character.isUpperCase('c'));
            System.out.println(Character.isUpperCase('X'));
            System.out.println(Character.isLowerCase('z'));
            System.out.println(Character.isLowerCase('V'));
            System.out.println(Character.isLowerCase('@'));
            System.out.println(Character.isLowerCase('4'));

            // convert a single char to Uppercase/Lowercase

            char a = Character.toUpperCase('a');
            char b = Character.toUpperCase('b');

            System.out.println(a);
            System.out.println(b);

            // Create a new string that consists of only Uppercase letters from the string

            String allUpper = "";
            for (int j = 0; j < str.length(); j++) {
                if(Character.isUpperCase(str.charAt(j))){
                    allUpper += str.charAt(j);
                }
            }

            System.out.println(allUpper);

            String text = "hELloWOrLd";  // HeLlOwOrLd

            String diffCAse = "";
            for (int j = 0; j < text.length(); j++) {

                if(j % 2 == 0){
                    diffCAse += Character.toUpperCase(text.charAt(j));
                }else{
                    diffCAse += Character.toLowerCase(text.charAt(j));
                }

            }

            System.out.println(diffCAse);

        }
    }

