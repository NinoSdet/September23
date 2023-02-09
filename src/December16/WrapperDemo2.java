package December16;

public class WrapperDemo2 {
    public static void main(String[] args) {

        // Conversion methods -> Convert String into a numeric type

        String cost = "123000";

        int costAsInt = Integer.parseInt(cost); // converts a string into a primitive int

        System.out.println("The tax of 6 percent for " + costAsInt + " is " + (costAsInt * 0.06));

        Integer costAsIntegerObject = Integer.valueOf("345"); // converts a string into an Object type (Integer)

//        System.out.println(Integer.parseInt("12.3")); // NumberFormatException
//        System.out.println(Integer.parseInt("$12")); // NumberFormatException
        System.out.println(Double.parseDouble("32.0")); // 32.0
        System.out.println(Integer.parseInt("24",8));

//        System.out.println(Byte.parseByte("130")); // NumberFormatException
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TRUE"));
        System.out.println(Boolean.parseBoolean("tRue"));
        System.out.println(Boolean.parseBoolean("hello"));
        System.out.println(Boolean.parseBoolean(""));

//        System.out.println(Long.parseLong("2362432432542L")); // long conversion throws exception with L

    }

}
