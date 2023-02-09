package October7;

public class NonVoidMethodsAssignment {
    public static void main(String[] args) {




        System.out.println(generateEmail("gmail.com"));
        System.out.println(generateEmail("yahoo.com"));
        System.out.println(generateEmail("mail.com"));

        System.out.println(generateEmail("dog.com"));
        System.out.println(generateEmail("duotech.io"));


    }

    public static String generateEmail(String str ){

        char letter1 = (char)(97 + (Math.random() * 26));
        char letter2 = (char)(97 + (Math.random() * 26));
        char letter3 = (char)(97 + (Math.random() * 26));
        char letter4 = (char)(97 + (Math.random() * 26));
        char letter5 = (char)(97 + (Math.random() * 26));

        return "" + letter1 + letter2 +letter3+letter4 +letter5 +"@"+ str;
    }


    /// Create your method here


}
