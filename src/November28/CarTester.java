package November28;

public class CarTester {
    public static void main(String[] args) {

//
//        Car car = new Car();
////        Car car1 = new Car();
//
////        car.year = 2022;
////        car.color = "Yellow";
////        car.make = "Ferrari";
////        car.model = "Enzo";
////        car.hasInsurance = true;
////        car.isElectric = false;
//        car.vin = "21HGHJJN7VJ8VHJHBHV3";
//        car.price = 8000000;
//
//        System.out.println(car.getInfo());

        Car car = new Car("Yellow", "Ferrari", "Enzo", "3243GJGJGHGHJGJ", 2022, true, false, 800000);

        System.out.println(car.getInfo());

    }
}
