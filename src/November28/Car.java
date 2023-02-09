package November28;

public class Car {
    String color;
    String make;
    String model;
    String vin;
    int year;
    boolean hasInsurance;
    boolean isElectric;
    double price;

    public  Car(){
        System.out.println("Constructor is called");
    }

    public Car(String newColor,
               String newMake,
               String newModel,
               String newVin,
               int newYear,
               boolean hasInsurance1,
               boolean isElectric1,
               double newPrice){

        color = newColor;
        make = newMake;
        model = newModel;
        vin = newVin;
        year = newYear;
        hasInsurance = hasInsurance1;
        isElectric = isElectric1;
        price = newPrice;

    }

    public void addToInventory(){
        System.out.println("Adding to inventory");
    }

    public void removeFromInventory(){
        System.out.println("Removing from inventory");
    }

    public String getInfo(){
        return
                "color='" + color + '\'' +
                        ", make='" + make + '\'' +
                        ", model='" + model + '\'' +
                        ", vin='" + vin + '\'' +
                        ", year=" + year +
                        ", hasInsurance=" + hasInsurance +
                        ", isElectric=" + isElectric +
                        ", price=" + price;

    }
}
