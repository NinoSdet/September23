package October7;

public class MultiWayIfElseExercise1 {
    public static void main(String[] args) {
        int x=3, y=3;
        int z;
        if (x > 2) {
            if (y > 2) {
               z= x + y;
                System.out.println("z is" + z);
            }
        }else {
            System.out.println("x ix " +x);
        }
    }
}