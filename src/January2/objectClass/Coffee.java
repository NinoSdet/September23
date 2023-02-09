package January2.objectClass;

public class Coffee{ //    public class Coffee extends Object{



    // POJO -> Plain Old Java Object

    // It is simply a regular class with private instance variables, constructor
    // public getters and setters and standard overridden methods such as toString(), equals() and hashcode()

    private String country;
     private boolean isOrganic;

     private String brewMethod;


    public Coffee(String country, boolean isOrganic, String brewMethod) {
        this.country = country;
        this.isOrganic = isOrganic;
        this.brewMethod = brewMethod;
    }



    // It is a common practice to override toString() method of Object class to provide more meaningful information
    @Override
    public String toString() {
        return "Coffee{" +
                "country='" + country + '\'' +
                ", isOrganic=" + isOrganic +
                ", brewMethod='" + brewMethod + '\'' +
                '}';
    }
}
