package November02;

public class ClassTask028NonAlphanumeric {
    public static void main(String[] args) {
        System.out.println(removeNonAlphaNumeric("Vsh%68d@hd9&!cx"));  // -> "Vsh68dhd9cx"

        System.out.println(removeNonAlphaNumeric("hello&World%hi%java"));  // -> "helloWorldhijava"

    }



    public static String removeNonAlphaNumeric(String str){
        String nonNumAndLetters = "";

        for (int i=0; i< str.length(); i++){
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                nonNumAndLetters += str.charAt(i);
            }
        }

        return nonNumAndLetters;
    }
}

