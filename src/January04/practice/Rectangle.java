package January04.practice;

public class Rectangle extends Shape{


     private double width;
     private double height;

    public Rectangle(boolean isFilled, String color, double width, double height) {
        super(isFilled, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void  calculateArea(){
        System.out.println("Area for a rectangle is: " + width * height);
    }

    public void  calculatePerimeter(){
        System.out.println("Perimeter for a rectangle is: " + (2 * (height + width)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
