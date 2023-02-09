package september26;

public class TypePromotion {

    public static void main(String[] args) {

//        Java automatically promotes each byte, short, or char value to int when evaluating an expression when an arithmetic operation is done on them

//        If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.

        byte b1 = 34;
        byte b2 = 22;

//        byte b3 = b1 + b2;  // byte and short will be promoted to int when an operation is done on them

        byte b3 = (byte)(b1 + b2);

        short sh = 56;
        short sh2 = (short)(sh + 120);

        // byte + byte -> int
        // int + byte -> int
        // short + int -> int
        // short + short -> int
        // byte + short -> int

//        float f =  45 + 2.5F + 3L + 2.8;  // this doesn't work since the largest value is double hence the whole expression will be double
//

    }
}