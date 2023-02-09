package January04.practice;

public class Shape {

     private boolean isFilled;
     private String color;

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }


    public void  calculateArea(){
        System.out.println("");
    }

    public void  calculatePerimeter(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "isFilled=" + isFilled +
                ", color='" + color + '\'' +
                '}';
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
}
