package December9.testCode;

//import december9.utilities.Example;

import December9.utilities.Cup;

public class Main {


    public static void main(String[] args) {


        SmokeTest st = new SmokeTest();

        System.out.println(st.publicVar);

        st.publicMethod();

        System.out.println(st.defaultVar);

        st.defaultMethod();

//        System.out.println(st.privateVar); //privateVar' has private access
//        st.privateMethod();

//        Example ex = new Example();

        Cup cup =  new Cup(2,"dcbsghv");

    }
}
