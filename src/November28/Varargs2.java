package November28;

public class Varargs2 {
    public static void printLength(int... args){

        System.out.println(args.length);
    }

    public static void anotherPrintLength(int[] args){

        System.out.println(args.length);
    }
    public static void main(String[] args) {

//

        print(1,"Hi");
        print(1,"Hi","hello");
//        print(2);

        printLength(1,2,3,4);
        printLength(new int[] {1,2,3,4});

//        anotherPrintLength(new int[] {1,2,3});
//        anotherPrintLength(1,2,3);

    }

    //Only one variable-length parameter may be specified in a method,
    // and this parameter must be the last parameter. Any regular parameters must precede it
    public static void print(int j,  String... args){

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
    }

}
