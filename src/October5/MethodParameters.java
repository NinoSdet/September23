package October5;


public class MethodParameters {

    public static void main(String[] args) {

//        add2With2();
        add2numbers(23, 56);
        add2numbers(11, 22);
        add2numbers(1, 6);

        Math.random(); //  this method does not have any parameters since the logic of it does not require any external input
        Math.max(3,4);
        Math.sqrt(5); // these two methods require parameters since the logic of these methods require external values to be passed into the method

        createName("hello",'x', 45443, 34.6 ); // arguments
        // the arguments should match the parameters in type, order, and number

        createName("hello", (char) 97 , 45443, 33 );
        // as long as arguments are compatible with parameters the method call will compile

        generateUsername((byte)120, "dsfds", (short)34, true);

        byte byteVAr = 45;
        short sh2= 463;
        // actual arguments of the method could be literal values like 23, "str" or variables
        // variable           // literal    //variable      // literal
        generateUsername(             byteVAr,      "dsfds",      sh2,          true );

        // calling methods with literal arguments is the most common practice
    }

    public static void generateUsername(byte b, String str, short sh, boolean bool){
        System.out.print(b);
        System.out.print(str);
        System.out.print(sh);
        System.out.print(bool);
    }

    // each parameter needs to have its own type and name
    public static void createName(String str, char ch, int num, double d){  // parameters or formal parameters
        System.out.println(str + ch + num);
    }

    public static void add2With2(){
        System.out.println(2 + 2);
    }

    public static void add2numbers(int a, int b){  // parameters
        System.out.println(a + b);
    }

}