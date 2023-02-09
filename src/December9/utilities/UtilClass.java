package December9.utilities;


import December9.testCode.SmokeTest;

public class UtilClass {


    public static void main(String[] args) {


        SmokeTest st = new SmokeTest();
        System.out.println(st.publicVar);
        st.publicMethod();
//        System.out.println(st.defaultVar);
        //'defaultVar' is not public in.
        // Cannot be accessed from outside package
//        st.defaultMethod();
        //'defaultMethod()' is not public. Cannot be accessed from outside package

//        System.out.println(st.privateVar); //privateVar' has private access
//        st.privateMethod();


        Example example = new Example();

//        Bottle bottle = new Bottle();


    }
}
