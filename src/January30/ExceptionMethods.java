package January30;

import java.io.IOException;

public class ExceptionMethods {


    public static void main(String[] args) {




        try {
            Integer.parseInt("t23t6fdg");
//            System.out.println(4/0);
        }catch (NumberFormatException e){
           e.printStackTrace();



        }

        System.out.println("Rest of the code lines..");
    }
}
