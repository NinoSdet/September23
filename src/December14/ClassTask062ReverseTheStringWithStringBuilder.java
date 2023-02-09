package December14;

public class ClassTask062ReverseTheStringWithStringBuilder {
    public static void main(String[] args) {
        System.out.println(reverse("Planet"));
        // Create a method that takes a  String and returns the reversed version of it as a String. Use StringBuilder method

    }


    public static String reverse(String str){

        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        return sb1.toString();

    }


}
