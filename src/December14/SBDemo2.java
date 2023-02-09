package December14;

public class SBDemo2 {
    // Given a string  "abcsdvv23342*&9bjhds465kjvds()*&Gggg" , remove all non-letters

    public static void main(String[] args) {

        System.out.println( deleteNonLetters("abcsdvv23342*&9bjhds465kjvds()*&Gggg"));

    }

    public static String deleteNonLetters(String str){

        StringBuilder sb =  new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            if(! Character.isLetter( sb.charAt(i) ) ) {
                sb.deleteCharAt(i); // deletes the char and next char is shifted back into this index
                i--; // adjust the index to check if the shifted char is also a non-letter
            }

        }

        return sb.toString();

    }
}
