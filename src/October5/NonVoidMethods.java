package October5;

public class NonVoidMethods {

    public static void main(String[] args) {

//       int result =  methodThatReturnsSomeNumber();
//
//        System.out.println(result);

//        cube(5); // simply calling the value returning methods does not produce any output
//
//        System.out.println(cube(3)); // to see the result of non-void methods you can print them out directly within the println()

//       double result = cubeVoid(5);

        double er=  Math.sqrt(3);

        String password =  getPassword("Hello", (byte) 34, 31254L, 56.7F, '&', true, 3256, 's');

    }

    public static int methodThatReturnsSomeNumber(){

        return 45;
    }

    public static double cube(double num){
//        double result = num * num * num;
////        return result;
        return  num * num * num;
        // you cannot have more than one return statements in one block of code
//        System.out.println(result);
    }

    public static void cubeVoid(double num){

        System.out.println(num * num * num);
    }

    public static String getPassword(String s, byte b, long l, float f,char ch, boolean isTrueOrFalse, int i,char c){

        return  "" + c + i + isTrueOrFalse + ch + f + l + b + s;
    }

}