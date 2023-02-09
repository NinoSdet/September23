package January20.interfaceRules;

public class PC implements Runnable, Executable {


    @Override
    public void run() {
        System.out.println("Press the ON button");
    }


    public void operateSomething(){
        System.out.println("Default method");
    }

    @Override
    public int operate() {
        return 99;
    }

//      default void operateSomething2(){
//            System.out.println("Default method");
//        }
}
