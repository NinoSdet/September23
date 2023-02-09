package November07;

public class LoopLabels {



        public static void main(String[] args) {

            OUTER:  for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 10; j++) {

                    System.out.print(j + " ");
                    if(i == 5){
                        break OUTER;
                    }

                }
                System.out.println();

            }
        }

    }

