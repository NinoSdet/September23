package December19.inheritanceDemo.shapes;

import December19.inheritanceDemo.protectedKeyword.Employee;

public class RegularOutside{



    public void test(){
        Employee employee = new Employee();
//        System.out.println(employee.privateVar);
//        System.out.println(employee.defaultVar);
//        System.out.println(employee.protectedVar);
        System.out.println(employee.publicVar);
    }
}
