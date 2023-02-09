package December14;

public class SBDemo {
    public static void main(String[] args) {

        // String is immutable, original value of the string cannot be changed after initialized
//        String str =  new String("basketball");
//       str = str.substring(6);
//
////        System.out.println(str.toUpperCase());
//
//        System.out.println(str);

        //StringBuilder class is a mutable class, calling a method on its object changes the original object

        StringBuilder sb = new StringBuilder();

        sb.append("basket").append("ball").append(2022).append(true).append('X');
        char [] a= {'a', 'b','c','d','e'};
        sb.append(a);
        sb.append(a,2,1);

        System.out.println(sb);

        sb.delete(6, 10);

        System.out.println(sb);
//        sb.delete(1,0);
//        sb.delete(0,0);

        System.out.println(sb);

        sb.deleteCharAt(0).deleteCharAt(sb.length()-1);

        System.out.println(sb);

        // Convert String to stringbuilder, use constructor that accepts String

        String str2 = "Hello world";

        StringBuilder sb2 =  new StringBuilder(str2);

//        System.out.println(str2.equals(sb2));

        System.out.println(sb2);

        sb2.append(12).deleteCharAt(0).delete(1,3);
        System.out.println(sb2);

        // StringBuilder to String conversion , toString()

        String convertedStr =  sb2.toString();

        System.out.println(convertedStr);

        // Insert

        StringBuilder sb3 =  new StringBuilder("chatGPT");

        sb3.insert(4, "2022").insert(0,2022);

        System.out.println(sb3);

        sb3.replace(0, 4, "twenty");

        System.out.println(sb3);

        sb3.setCharAt(sb3.length()-1, 'S');

        System.out.println(sb3);

        System.out.println(sb3.length());

        // reverse

        StringBuilder sb4 = new StringBuilder("talk is cheap. show me the code");

        sb4.reverse();

        System.out.println(sb4);

    }
}
