package October17;

public class ClassTask17SwitchStatement {
    public static void main(String[] args) {

    printMessage("Monday");
    printMessage("Thursday");
    printMessage("Friday");
    printMessage("Sunday");
    printMessage("Hello");
}

public static void printMessage(String day){
        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Working Hard!!!");
                break;
            case "Friday":
                System.out.println("The weekend is almost here! TGIF!!!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's party time! Alright, Alright, Alright!");
                break;
            default:
                System.out.println("You partied too hard this weekend, bro!");
                break;
        }
    }
}
