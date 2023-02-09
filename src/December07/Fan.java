package December07;



public class Fan {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    static int noOfFans=0;
    int speed = SLOW;
    boolean isOn =false;
    double radius =5;
    String color = "blue";
    static String manufacturer = "WhirWind";
    String productId = "xxxx";

    public Fan(){
        productId = generateProductId();
        noOfFans++;
    }

    public Fan(int speed, boolean isOn, double radius, String color, String manufacturer) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
        this.manufacturer = manufacturer;
        productId = generateProductId();
        noOfFans++;
    }
    public static int getNoOfFansCreated(){
        return noOfFans;
    }

    @Override
    public String toString() {
        if(isOn) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", productId=" + productId +
                    ", color='" + color + '\'' +
                    '}';
        }else{
            return "Fan{Fan is OFF" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public String generateProductId(){
        String alphabet="abcdefghijklmnopqrstuvwxyz0123456789";
        String collect ="";
        for (int i=0; i<10; i++){
            int randomIndex= (int) (Math.random()*alphabet.length());
            collect+=alphabet.charAt(randomIndex);
        }
        return collect;
    }
}
