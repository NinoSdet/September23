package December19.inheritanceDemo.protectedKeyword;

public class Developer extends Employee{




    public void testVisisbility(){

//        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);

//        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }


}
