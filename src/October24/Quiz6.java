package October24;

public class Quiz6 {
   public static void main(String arg[]){
        String blank = " " ;
        String line = blank +"hello"+blank+blank;
        line.concat("world");
        String newLine=line.trim();
        System.out.println((int)(line.length() +newLine.length()));
    }
}


