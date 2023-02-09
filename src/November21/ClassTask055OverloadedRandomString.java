package November21;

public class ClassTask055OverloadedRandomString {
    public static void main(String[] args) {


        // TEST your methods here

        System.out.println(randomString()); //  dshvf (example, the actual chars could be different)

        System.out.println(randomString(7)); //cbsassw
        System.out.println(randomString(5, true)); // RVDHC
        System.out.println(randomString(3, false)); //hsd
        System.out.println(randomString(3, true)); //MVN

    }

    public static String randomString() {
        return randomString(5);
    }

    public static String randomString(int length) {
        String letters = "";
        for (int i = 0; i < length; i++) {
            char ch = (char) (97 + Math.random() * 26);
            letters += ch;
        }
        return letters;

    }// Create 3 overloaded methods here

    public static String randomString(int length, boolean isUppercase) {
        if (isUppercase == false) {
            return randomString(length);
        } else {
            return randomString(length).toUpperCase();

        }

    }
}


