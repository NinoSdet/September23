package January30;

public class ThrowKeyword {


    public static void main(String[] args) {










        someMethod("");


        // throw vs throws
        // throws -> keyword used to declare an exception in the method header
        // throw -> keyword used to explicitly throw some exception object

    }

    public static void someMethod(String str){

//        if(str.isEmpty()){
//           throw new RuntimeException("Empty string is not allowed for this method");
//        }


        if(str.isEmpty()){
            throw new EmptyStringNotAllowedException("Empty string is not allowed");
        }



    }
}
