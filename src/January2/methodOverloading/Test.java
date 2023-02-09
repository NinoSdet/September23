package January2.methodOverloading;

public class Test {

    public static void main(String[] args) {


        myMethod(89);
    }

//    public static void myMethod(int i){
//        System.out.println("Int");
//    }

//    public static void myMethod(double i){
//        System.out.println("double");
//    }

//    public static void myMethod(Integer i){
//        System.out.println("Integer");
//    }

    public static void myMethod(Short i){
        System.out.println("Short");
    }

    public static void myMethod(double... i){
        System.out.println("int varargs");
    }





//    public static void myMethod(short i){
//        System.out.println("short");
//    }


}
