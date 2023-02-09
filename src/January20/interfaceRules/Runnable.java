package January20.interfaceRules;

 abstract interface Runnable extends Operatable{


   public static final int age = 12;
   // interface variable are by default public static final


   void run(); //  public abstract void run();

//     public abstract is assumed for every interface method

     // interface methods cannot be final , private or protected,  static

     // one interface can extend another interface
     // a class can only implement an interface


}
