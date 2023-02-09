package January30;

public class ErrorDemo
{


    // Heap memory error ->  OutOfMemoryError
    //


    public static void main(String[] args) {


//        try {
//            int[] arr = new int[2000000000];   // OutOfMemoryError
//        }catch ( OutOfMemoryError e){
//            System.out.println("No memory");
//        }





        someMethod(); // StackOverflowError  is another subclass of Error class
        // It happens when you have a method that calls itself recursively and without end.

    }

     public static void someMethod(){
         someMethod();
     }


}
