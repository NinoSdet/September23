package October7;

public class RandomPasswordAssignment {
    public static void main(String[] args) {

        //call your method and print the returned result
        System.out.println(getRandomPassword());
    }

    //create your method
    public static String getRandomPassword(){

        char lettersU1 = (char)(65 + (Math.random() * 26));
        char lettersU2 = (char)(65 + (Math.random() * 26));
        char lettersU3 = (char)(65 + (Math.random() * 26));
        char lettersU4 = (char)(65 + (Math.random() * 26));
        char lettersU5= (char)(65 + (Math.random() * 26));
        char lettersU6 = (char)(65 + (Math.random() * 26));

        return "" + lettersU1 + lettersU2 + lettersU3 + lettersU4 + lettersU5 + lettersU6;
    }

}
