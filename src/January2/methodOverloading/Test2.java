package January2.methodOverloading;

public class Test2 {

    public static void main(String[] args) {


//        myMethod(2.4);  // new Double(2.4)

        myMethod(null);
    }

//

    public static void myMethod(String i){
        System.out.println("String");
    }

//    public static void myMethod(StringBuilder sb){
//        System.out.println("SB");
//    }
////
//
    public static void myMethod(Object o){
        System.out.println("Object");
    }





//


}
