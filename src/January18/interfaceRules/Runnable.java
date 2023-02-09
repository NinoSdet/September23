package January18.interfaceRules;

 interface Runnable extends Operatable{


   void run(); //  public abstract void run();

//     public abstract is assumed for every interface method

     // interface methods cannot be final , private or protected,  static

     // one interface can extend another interface
     // a class can only implement an interface


}
