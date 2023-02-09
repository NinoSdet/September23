package January18.interfaceRules;

public class LeafBlower implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Pull the Operate lever");
    }

   // @Override
    public int operate() {
        return 34;
    }
}
