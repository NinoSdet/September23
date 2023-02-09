package November07;


    public class ContinueDEmo {

        public static void main(String[] args) {

            int sum = 0;

            for (int i = 0; i <= 10; i++) {

                if(i < 5){
                    continue;
                }

                sum += i;

            }

            System.out.println(sum);

        }
    }

