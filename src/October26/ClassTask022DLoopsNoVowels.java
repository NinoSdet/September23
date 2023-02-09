package October26;

public class ClassTask022DLoopsNoVowels {
    public static void main(String[] args) {
        System.out.println(noVowels("hello")); //-> "hll"
        System.out.println(noVowels("awesome")); //-> "wsm"
        System.out.println(noVowels("spotify")); //-> "sptfy"
        System.out.println(noVowels("subtrakt")); //-> "sbtrkt"


    }

    public static String noVowels(String str){
        int i =0;
        String newStr ="";
        while(i<str.length()){
            if (str.charAt(i)!= 'a' && str.charAt(i)!= 'e' && str.charAt(i)!= 'i' && str.charAt(i)!= 'u' && str.charAt(i)!= 'o'){
                newStr+=str.charAt(i);
            }
            i++;}
        return newStr;}

}

