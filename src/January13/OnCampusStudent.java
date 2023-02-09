
package January13;

public class OnCampusStudent extends Student {
    private int badgeNo;

    public OnCampusStudent(String firstName, String lastName, int badgeNo) {
        super(firstName, lastName);
        this.badgeNo = badgeNo;
        setId(generateId());
    }
    public String generateId(){
        return getFirstName().substring(0,3)+getLastName().substring(0,3)+badgeNo;
    }

    @Override
    public String toString() {
        return "OnCampusStudent{" +
                "badgeNo=" + badgeNo +
                 ", "+ getFirstName()+ " "+getLastName() +", " +getId()+  //supr.toString()
                '}';
    }
}
