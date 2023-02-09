package January30;

public class finallyBlock {


    public static void main(String[] args) {



        String str = null;

        try {
            System.out.println("Try block");
            System.out.println(str.toUpperCase());

        }catch (NullPointerException e){
//            e.printStackTrace();
            System.out.println("Catch block");
            System.exit(2);
        }finally {
            System.out.println("Finally block");
        }


        // final/finally/finalize

        // final - keyword that is used with classes, methods, variables
        // finally - optional block of try catch that is executed regardless of try block throwing exception
        // finalize - it is method of Object class that was used to put a code that closed the resources
        // but in the latest version of Java (18) it is removed



        // finally is not executed if there is System.exit() at any point before the execution reaches the finally block.




    }
}
