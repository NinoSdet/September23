package January13;

public class OnlineStudent extends Student {
    private String state;

    public OnlineStudent(String firstName, String lastName, String state) {
        super(firstName, lastName);
        this.state = state;
        setId(generateId());
    }
    public String generateId(){
        return getFirstName().substring(0,3)+getLastName().substring(0,3)+state;

    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "state='" + state + '\'' +", "+getFirstName()+ " "+getLastName() +", " +getId()+  //super.toString()
                '}';
    }
}
