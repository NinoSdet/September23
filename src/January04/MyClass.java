package January04;




class AnotherClass extends MyClass{}
// You can have more than one class defined in a single java file, the rule is there can be only one public class
// and that class should have the file name

class AnotherClass2 extends MyClass{}
public class MyClass {

    public static void main(String[] args) {

        AnotherClass anotherClass = new AnotherClass();
        AnotherClass2 anotherClass2 = new AnotherClass2();
    }



    // inner class -> a class declared within a class, it is consideered a member so it can have any visibility and static keyword

    private static class InnerClass{

    }


}
