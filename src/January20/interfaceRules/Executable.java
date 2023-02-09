package January20.interfaceRules;

public interface Executable {

    // All interface members have public visibility
    // All interface variables are static and final
    // All non-default and non-static methods in interfaces are abstract


    void run();

//    void operateSomething();


//    static void run2();
     default void operateSomething(){
        System.out.println("Default method");
    }

    // default methods are added in Java 8 to
    // support methods with implementation
    // Their purpose was to provide backwards compatibility
    // Pre-Java 8 when interface developer added a new abstract method, all implementing classes would break and not compile and would be forced
    // to implement the new abstract method
    // With default methods, the implementing classes now have a choice to override or simply inherit it without any compiler errors

   public static void run2(){
       System.out.println("Interface");
    }

    // Static methods were also added as of Java 8 to provide Interfaces a way to implement some logic for internal interface operations
}
