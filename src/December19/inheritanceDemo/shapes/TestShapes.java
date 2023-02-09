package December19.inheritanceDemo.shapes;

public class TestShapes {


    public static void main(String[] args) {



        Circle circle = new Circle();

        System.out.println(circle.color);

        circle.setColor("yellow");

        System.out.println(circle.getColor());


        Rectangle rectangle = new Rectangle();


        System.out.println(rectangle.color);


    }
}
