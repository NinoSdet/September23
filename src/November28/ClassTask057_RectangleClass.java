/* Design a class named Rectangle to represent a rectangle.

The class contains:

■ Two double instance variables named width and height that specify the width and height of the rectangle.

■ A method named getArea() that returns the area of this rectangle. -> width*height
■ A method named getPerimeter() that returns the perimeter. -> 2 * (height + width)

Test your class in the main method by creating two Rectangle objects -> one with width 4 and height 40 and the other with width 3.5 and height 35.9.
Print out the width, height, area, and perimeter of each rectangle.*/


package November28;

public class ClassTask057_RectangleClass {

        public static void main(String[] args) {
            //Test your class here

            Rectangle rectangle1 = new Rectangle();
            Rectangle rectangle2 = new Rectangle();
            rectangle1.width=4;
            rectangle1.height=40;
            rectangle2.width=3.5;
            rectangle2.height=35.9;
            System.out.println("Width:"+ rectangle1.width + ", Height: "+ rectangle1.height + ", Area: " + rectangle1.getArea() + ", Perimeter: " + rectangle1.getPerimeter());
            System.out.println("Width:"+ rectangle2.width + ", Height: "+ rectangle2.height + ", Area: " + rectangle2.getArea() + ", Perimeter: " + rectangle2.getPerimeter());


    }
}
