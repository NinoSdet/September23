package October26;

public class IterateThroughString4 {
    public static void main(String[] args) {

        System.out.println(myToUppercase("dvsdvds"));

    }

    public static String myToUppercase(String str){

        str = str.toLowerCase();
        int i = 0;
        String accumulatorStr = "";
        while(i < str.length()){
            char ch =  str.charAt(i);
            ch = (char)(ch - 32);
            accumulatorStr += ch;

            i++;
        }

        return accumulatorStr;

    }
}
