package December16;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String str = "java";

        StringBuilder sb =  new StringBuilder("java");

//        System.out.println(str == sb);  // compiler error since  == operator requires both sides of the operator should be of the same type

        System.out.println(str.equals(sb));   // no compiler error but returns false automatically since equals method requires the object of the same type,
    }
}
