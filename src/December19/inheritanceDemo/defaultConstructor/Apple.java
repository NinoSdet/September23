package December19.inheritanceDemo.defaultConstructor;

public class Apple extends Fruit{


    // In Java, all constructors have either super() or this() call. If you don't explicitly add either super(), or this(),
    // java compiler will insert super() call as the first line of the constructor.

     public Apple(){
         // super();
         System.out.println("No arg sub");
     }

    public Apple(int i ){
        System.out.println("int arg sub");
    }

}
