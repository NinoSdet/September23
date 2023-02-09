package January04.polymorphism2;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    private void calculateGPA(){
        System.out.println("Student GPA");
    }
    public void submitAssignment(){
        System.out.println("Student submits assignment in person");
    }

    public void submitAssignment(String date){
        System.out.println("Student submits assignment in person by " + date);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Student student = new OnlineStudent(3223, "John", 1232, "NY");
        student.calculateGPA();
    }
}
