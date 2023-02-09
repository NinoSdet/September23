package November28;

import java.util.Arrays;

public class Varargs {

    public static void main(String... args) {

        System.out.println(sum(2,3));
        System.out.println(sum(2,3,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
        System.out.println(sum(2));
        System.out.println(sum());

        String str = new String();
        String str2 = new String("dbhsd");
        String str3 = new String(new char[] {'a', 'b'});

    }

    public static int sum(int... args){

//        System.out.println(Arrays.toString(args));
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }

        //    public static int sum(int a, int b){
//        return a+b;
//    }
//
//    public static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    public static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

}