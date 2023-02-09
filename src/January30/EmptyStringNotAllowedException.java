package January30;

public class EmptyStringNotAllowedException extends RuntimeException{


    // You can create your custom exception classes by extending either from RuntimeException or Exception classes


    public EmptyStringNotAllowedException(String message){
        super(message);
    }
}
