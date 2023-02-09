package November28;

public class CircleTester {
    public static void main(String[] args) {

        Circle circle1 = new Circle(); // Classname variableName =  new ClassName();

        System.out.println(circle1.radius);

        circle1.radius = 2.5;

        System.out.println("The area of a circle1 with the radius " +
                circle1.radius + " is " + circle1.getArea()
                + " and the perimeter is " + circle1.getPerimeter());

        circle1.setRadius(5.5);

        System.out.println("The area of a circle1 with the radius " +
                circle1.radius + " is " + circle1.getArea()
                + " and the perimeter is " + circle1.getPerimeter());

        Circle.doSomething();// static methods do not require object

//        Circle.getPerimeter();
//        new Circle().getPerimeter();

        Circle circle2 = new Circle();//

    }
}
