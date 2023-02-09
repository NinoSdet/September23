package October3;



public class Utility {

    public static void main(String[]args){
        print8CharPassword();
    }

    public static  void print8CharPassword(){

        char one = (char)(65 + (int) (Math.random() * 26));
        int two =(int)(Math.random() * 10);
        int three = (97 + (int)(Math.random() * 26));
        int four = (97 + (int)(Math.random() * 26));
        int five = (97 + (int)(Math.random() * 26));
        int six = (97 + (int)(Math.random() * 26));
        int seven = (97 + (int)(Math.random() * 26));
        int eight = (65 + (int) (Math.random() * 26));
        System.out.print(one);
        System.out.print(two);
        System.out.print((char)three);
        System.out.print((char)four);
        System.out.print((char)five);
        System.out.print((char)six);
        System.out.print((char)seven);
        System.out.print((char)eight);
        System.out.println();
    }

}