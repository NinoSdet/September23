package December16;

public class AutoboxAndUnbox {
    public static void main(String[] args) {

//        Integer i =  new Integer(3);

        Integer i = 45; //new Integer(45);  // autoboxing of 45 into an object

        Integer another = 4;

        int num = another;  // autounboxing // new Integer(4) -> 4

        // In Java primitives and Wrapper types are automatically compatible with each other due to autoboxing and autounboxing

        double d = 3;

        //Double d2 = 3;  // Double d2 =  new Integer(3);
        //Double d2 = 3.4F;  // Double d2 =  new Float(3.4F);

    }
}
