package January18.records;

public record MyStudent(int id, String name) {   // POJOs can be easily created using Records
    // Record is a short version of a class
    // where  variable constructor, getter and setters, overridden toString(), equals() and hashcode() methods are automatically generated
}
