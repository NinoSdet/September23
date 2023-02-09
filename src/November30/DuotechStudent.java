package November30;

public class DuotechStudent {
    String name;
    int age;
    String stateOfResidence;
    int [] grades;
    double tuition;

    public DuotechStudent(){
        age=25;
        name = "Nino"; // make it a String

    }

    public DuotechStudent(String newName){
        name=newName;
    }
    public DuotechStudent(String newName, int newAge, String newState, int [] newGrades, double newTuition ){
        name=newName;
        age = newAge;
        stateOfResidence=newState;
        grades =newGrades;
        tuition=newTuition;
    }

    public String getInfo(){
        return "NAME:"+ name+ ", AGE:" +age + ", STATE:" + stateOfResidence;
    }
    public double getAverageGrade(){
        int sumGrades = 0;
        for (int i=0; i<grades.length; i++){
            sumGrades+=grades[i];

        }

        return (double)(sumGrades/grades.length);
    }
    public double payTuition(double amount){
        return tuition-=amount;
    }
    public double getTuition(){
        return tuition;
    }





}

