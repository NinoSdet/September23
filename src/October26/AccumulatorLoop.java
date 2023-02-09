package October26;

public class AccumulatorLoop {

        public static void main(String[] args) {

            // Find the sum of numbers between 1-100

            // 5050

//        int i = 1;
//        int total = 0;
//        while (i <= 10){
//            total = total + i;
//            System.out.println("Total is: " + total);
//            i++;
//        }

//        System.out.println("Total is: " + total);

            System.out.println(  getTheSum(34, 122) ) ;

            System.out.println(getTheSumOfEven(1,100));

        }

        public static  int  getTheSum (int from, int to){

            int total = 0;
            while (from <= to){
                total = total + from;
                from++;
            }

            return total;
        }

        public static  int  getTheSumOfEven (int from, int to){

            int total = 0;
            while (from <= to){
                if(from % 2 ==0){
                    total = total + from;
                }
                from++;
            }

            return total;
        }
    }

