package October5;

public class MethodParameters2 {

    public static void main(String[] args) {

        printSomeMessage("Nasilsin");
    }

    public static void printSomeMessage(String message){  // method parameter is considered a local variable of the method

//       String message = "Hi";  // cannot re=declare a variable with the same name as parameter name

        //message = "Hi"; // re-assigning parameter value will lose the original value that was passed when the method is called

        System.out.println(message + message);
    }


}