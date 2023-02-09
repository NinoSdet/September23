package November21;

public class PassByValue2 {

        public static void main(String[] args) {

//        increment(45);

            int num = 4;
            num = increment(num);  // re-assign returned value 5 to num

            System.out.println("Num in main method is " + num);

        }

        public static int increment(int x){
            x++;
            return x;
        }
    }

