package January13.example2;

public abstract class Shape {

    // Abstract classes can have both concrete(normal methods with implementation) and abstract methods

    // A class that contains at least one abstract method must be declared as abstract


    private boolean isFilled;
    private String color;


    protected Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract double getArea();

    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "Shape{" +
                "isFilled=" + isFilled +
                ", color='" + color + '\'' +
                '}';
    }
}
