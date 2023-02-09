package November09;

public class ClassTask046PigLatin {
    public static void main(String[] args) {
        //
        System.out.println(pigLatin("Java is fun")); //- > avaJay siay unfay
        System.out.println(pigLatin("How many languages do you speak"));
    }

    public static String pigLatin(String str) {
        //
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = word.substring(1) + word.substring(0, 1) + "ya";
        }

        return String.join(" ", words);
    }
}
