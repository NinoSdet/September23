package November07;

public class FindingADuplicateCharacterInTheString {
    public static void main(String[] args) {

        String str = "twitter";

        int  index  = -1;  // if no duplicate found return an invalid index which is usually -1

        OUTER: for (int i = 0; i < str.length()-1; i++) {

            for (int j = i+1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)){
                    index = j;
                    break OUTER;
                }
            }
        }

        System.out.println("The index of the duplicate char is " + index);  // index of t

    }
}
