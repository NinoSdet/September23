package January20.interfaceRules;

public class LeafBlower implements java.lang.Runnable {

    static final int num;

    static {
        num = 23;
    }
    @Override


    public void run() {
        System.out.println("Pull the Operate lever");
    }

   // @Override
    public int operate() {
        return 34;
    }
}
