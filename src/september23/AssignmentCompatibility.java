package september23;

public class AssignmentCompatibility {

    public static void main(String[] args) {

        int x = 56;

        double y = 6.7;

//         x = y;

        // compatibility chart
        // byte -> short -> int -> long -> float -> double

        y = x;

        byte b = 45;

        long l = b;

//          short sh = x;  // int cannot be directly assigned to short

        boolean b1 = true;

//         int x2 = b1;

//        String str = "45";

//         String str = 'A'; //String and char are not compatible

//     String str  = "true" ;

    }
}