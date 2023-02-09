package October7;

public class MultiwayIfElseAssignment {
    public static void main(String[] args) {
        double score = 65;
        if(score >= 60.0)
            System.out.println("D");
        else if(score >= 70.0)
            System.out.println("C");
        else if(score >= 80.0)
            System.out.println("B");
        else if(score >= 90.0)
            System.out.println("A");
        else
            System.out.println("F");
    }
}
