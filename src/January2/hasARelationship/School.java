package January2.hasARelationship;

public class School {

    private class SchoolCertification {  // In Composition, the class that is used as a property is usually declared within the encircling class ()
        // SchoolCertification -> inner/nested class, usually a short class that is used internally within another class

        int licenceID;
        int duration;
    }

    // has-a -> when a class is used as a property of another class

    Student student; // Aggregation -  when a class can exist independently without the class that it uses.
    String name;

    SchoolCertification certification; // Composition - It is a relationship where a class that is as a property cannot exist independent of its encircling class.



    public School (Student student, String name){
        this.student = student;
        this.name = name;
    }





}
