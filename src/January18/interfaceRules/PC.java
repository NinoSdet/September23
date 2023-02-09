package January18.interfaceRules;

public class  PC implements Runnable, Executable {


    @Override
    public void run() {
        System.out.println("Press the ON button");
    }

    @Override
    public int operate() {
        return 99;
    }
}
