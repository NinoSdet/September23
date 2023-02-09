package December9.utilities;

public class Cup {

    double weight;
    String color;

    public Cup(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    Cup() {  // constructors can have all four visibility modifier
    }


    private Cup(double weight){

    }
}
