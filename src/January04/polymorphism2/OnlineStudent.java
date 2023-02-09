package January04.polymorphism2;

public class OnlineStudent extends Student{

    int zoomPass;
    String state;

    public OnlineStudent(int id, String name, int zoomPass, String state) {
        super(id, name);
        this.zoomPass = zoomPass;
        this.state = state;
    }


    private void calculateGPA(){
        System.out.println("OnlineStudent GPA");
    }

    public void submitAssignment(){
        System.out.println("Online Student submits assignment in TalentLMS");
    }
}
