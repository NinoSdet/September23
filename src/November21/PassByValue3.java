package November21;

public class PassByValue3 {

        public static void main(String[] args) {

            incrementByX("D", 100);  //110

        }

        public static void incrementByX(String code,int number){

            switch (code){
                case "A":
                    number = incrementBy(10, number);
                    break;
                case "B":
                    number = incrementBy(20, number);
                    break;
                case "C":
                    number = incrementBy(30, number);
                    break;

                case "D":
                    number = incrementBy(40, number);
                    break;

            }

            System.out.println(number);

        }

        public static int incrementBy(int num, int number){
            for (int i = 0; i < num; i++) {
                number++;
            }

            return number;
        }
    }

