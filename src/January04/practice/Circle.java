package January04.practice;

public class Circle extends Shape{

    private double radius;


    public Circle(boolean isFilled, String color, double radius) {
        super(isFilled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




    public void  calculateArea(){
        System.out.println("Area for a circle is: " + Math.PI * radius * radius);
    }

    public void  calculatePerimeter(){
        System.out.println("Perimeter for a circle is: " + Math.PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
