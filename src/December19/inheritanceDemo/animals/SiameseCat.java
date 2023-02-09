package December19.inheritanceDemo.animals;

public class SiameseCat extends Cat{

    String placeOfOrigin;
    String eyeColor;


    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "SiameseCat{" +
                "placeOfOrigin='" + placeOfOrigin + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                "} " ;
    }
}
