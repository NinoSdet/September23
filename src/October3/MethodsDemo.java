package October3;

import java.util.Scanner;

public class MethodsDemo {

        // DRY -> Don't repeat yourself

    //visibility modifier     static modifier(belongs to the class)         return type              method name             method parameters          method body
    public                 static                                           void                 printAnimalFigure           ()                  {    //  public   static void printAnimalFigure  ()  -> method header

        System.out.println();
        System.out.println("           '__'");
        System.out.println("           (\u00a9\u00a9)");
        System.out.println("   /========\\/");
        System.out.println("  / || \u00a4\u00a4 || ");
        System.out.println(" *  ||----||");
        System.out.println("    \u00a5\u00a5    \u00a5\u00a5");
        System.out.println("    \"\"    \"\"");

    }

    public static void main(String[] args) {

        MethodsDemo.printAnimalFigure(); // method call/invocation
        // Static methods should be called using ClassName.methodName()
        // However, if the method that you are calling in the main method, is located in the same class, you can omit the ClassName
        printAnimalFigure();
        printAnimalFigure();

        Utility.print8CharPassword();
        Utility.print8CharPassword();
        Utility.print8CharPassword();

        generate2DigitNo();
        MethodsDemo.generate2DigitNo();

    }

        // We can create our own method to store re-usable logic
        // To create our own methods, we need to declare the method within the class level, OUTSIDE the main method

    public static void generate2DigitNo(){

        System.out.println(10+ (int)(Math.random()*90));

    }

}