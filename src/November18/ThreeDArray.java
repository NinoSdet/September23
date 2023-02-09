package November18;
import java.util.Arrays;
public class ThreeDArray {


    public static void main(String[] args) {

        int[][][] scores = new int[3][2][4];

        System.out.println(Arrays.deepToString(scores));

        scores[0][1][2] = 99;

        System.out.println(Arrays.deepToString(scores));

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                for (int k = 0; k < scores[i][j].length; k++) {
                    System.out.println(scores[i][j][k]);
                }
            }
        }

    }
}