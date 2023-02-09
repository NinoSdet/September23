package October24;

public class ClassTask020String {
    public static void main(String[] args) {
        //  test your method here
        System.out.println(right2("Hello")); //→ "loHel"
        System.out.println(right2("java")); //→ "vaja"
        System.out.println(right2("Hi")); //→ "Hi"

        System.out.println(right2("Bitcoin")); //→ "inBitco"

    }

    public static String right2(String str){
        //write the implementation
        String str1 = str.substring(str.length()-2);
        String str2 = str.substring(0,str.length()-2);
        if (str.length() >=2){
            return str1+str2;
        }else{
            return "";
        }
    }
}
