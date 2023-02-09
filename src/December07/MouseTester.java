package December07;

public class MouseTester {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse(5);
        mouse1.age = 22;
        System.out.println(mouse1.age);
        Mouse mouse2 = new Mouse(10);
        System.out.println(mouse2.age);

        Mouse m3 = new Mouse(2);
        Mouse m4 = new Mouse(12);

        System.out.println(m3.type);
        System.out.println(m4.type);

        m3.type = "mickey mouse";

        System.out.println(m4.type);

        // The correct way to access static variables is through ClassName

        System.out.println(Mouse.type); // ClassName.variableName

    }
}
