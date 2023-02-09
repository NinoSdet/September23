package November28;

public class Circle {
    // properties/attributes ->
    // instance variables (data fields)

    double radius; // instance variables are initialized automatically to their default values

        // behaviors -> instance methods

    public double getPerimeter(){

//        int i;
        return Math.PI * 2 * radius;
    }

    public void setRadius(double newRadius){

        radius = newRadius;

    }

    public static void doSomething(){
//        System.out.println(i);
//        int i = 0;
    }

    public double getArea(){

        return Math.PI * radius * radius;
    }

}
