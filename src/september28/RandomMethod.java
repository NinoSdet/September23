package september28;

public class RandomMethod {
    public static void main(String[] args) {
        int die1 = 1 + (int)(Math.random() * 6);
        int die2 = 5 + (int)(Math.random() * 6);
        int total = die1 + die2;
        System.out.println("die1 :" + die1 +  "\ndie2:" + die2 + "\ntotal:" + total);



//     double randomNumber =   Math.random(); // 0.0 - 0.99

//        System.out.println(randomNumber);

                // Random number between 0-10 noy including 10
                int randomInt =  (int)(Math.random() * 10);

                System.out.println(  (int)(Math.random() * 101)  );     //0-100

                // 10 - 20

                int randomNo2 =  10 + (int)(Math.random() * 10); //10-19

                // 50 - 100

                int randomNo3 =  50 + (int)(Math.random() * 50) ;  //50-99

                // generate 2 digit number (10-99)

                char randomNo4 =  (char)(10 + (int)(Math.random() * 90)) ; //10-99

                System.out.println(randomNo4);

            }
        }

