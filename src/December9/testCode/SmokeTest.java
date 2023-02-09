package December9.testCode;

public class SmokeTest {

    public int publicVar;  // public -> visible everywhere (inside or outside of the package)
    String defaultVar;  // default (no modifier) visibility ->
                       // visible only within the package


    private double privateVar; // private visibility -> visible only in that class


    public void publicMethod(){

        System.out.println("public method");
    }

    void defaultMethod(){
        System.out.println("default method");

        privateMethod();
    }

    private void privateMethod(){  // usually for implementing internal logic
        System.out.println("private method");
    }


}
