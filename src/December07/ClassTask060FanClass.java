/*Design a class named Fan to represent a fan for a company called WhirlWind.

The class contains:

 - 3 constants called SLOW,MEDIUM,and FAST with the values 1,2,and 3 to denote the fan speed.
 - int data field noOfFans to track the number of fan objects created, must be initialized to 0.
   Its value be incremented by one in each constructor to track the number of objects created
 - int data field named speed that specifies the speed of the fan (the default is SLOW).
 - boolean data field named isOn that specifies whether the fan is on(the default is false).
 - double data field named radius that specifies the radius of the fan (the default is 5).
 - String data field named color that specifies the color of the fan(the default is blue).
 - String data field named manufacturer intitialized to "WhirlWind".
 - String data field named productId (the default is "xxx"). It must be initialized in a constructor by calling the utility method generateProductId().


 - A no-arg constructor that creates a default fan.
 - Constructor that initializes speed,radius,color and isOn.

 - A method named toString() that returns a string description for the fan.
   If the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
- A method named getNoOfFansCreated() that returns the number of Fan objects created.
- A utility method named generateProductId() that generates and returns a product ID as a String with random mix of lowercase letters and numbers of length 10. E.g. "0sna36lr7v"


Write a test program that creates a Fan object.

Initialize the object with maximum speed, radius 10, color yellow, and on.
Display the objects information by invoking their toString method.
*/



package December07;

public class ClassTask060FanClass {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow", "WhirlWind");
        Fan fan2 = new Fan(Fan.SLOW, true, 5, "yellow", "WhirlWind");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 10, "blue", "WhirlWind");
        Fan fan4 = new Fan(Fan.FAST, true, 10, "yellow", "WhirlWind");
        Fan fan5 = new Fan(Fan.SLOW, true, 20, "yellow", "WhirlWind");
        Fan fan6 = new Fan(Fan.FAST, true, 10, "red", "WhirlWind");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
        System.out.println(fan4.toString());
        System.out.println(Fan.getNoOfFansCreated());
    }
}
