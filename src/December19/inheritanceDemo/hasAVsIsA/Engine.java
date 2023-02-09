package December19.inheritanceDemo.hasAVsIsA;

public class Engine {

    int year;
    int noOfCylinders;
    int horsepower;
    boolean isElectric;


    public Engine(int year, int noOfCylinders, int horsepower, boolean isElectric) {
        this.year = year;
        this.noOfCylinders = noOfCylinders;
        this.horsepower = horsepower;
        this.isElectric = isElectric;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
