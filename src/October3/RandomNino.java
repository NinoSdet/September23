package October3;

public class RandomNino {
    public static void main(String[] args) {
        char lettersU1 = (char)(65 + (Math.random() * 26));
        int lettersN = (int)(Math.random() * 10);
        char lettersL1 = (char)(97 + (Math.random() * 26));

        char lettersL2 = (char)(97 + (Math.random() * 26));
        char lettersL3 = (char)(97 + (Math.random() * 26));
        char lettersL4 = (char)(97 + (Math.random() * 26));
        char lettersL5 = (char)(97 + (Math.random() * 26));

        char lettersU2 = (char)(65 + (Math.random() * 26));

        System.out.println(lettersU1+""+lettersN+""+lettersL1+""+lettersL2+""+lettersL3+""+lettersL4+""+lettersL5+""+lettersU2);
    }
}


