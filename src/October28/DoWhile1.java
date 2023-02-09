package October28;
import java.util.Scanner;
public class DoWhile1 {

        public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("You are cool. Do you want to repeat this? y/n: ");
//        String answer = input.next();
//
//        while(answer.equalsIgnoreCase("y")){
//            System.out.println("You are cool. Do you want to repeat this? y/n: ");
//            answer = input.next();
//        }
//
//        System.out.println("Done");

            Scanner input = new Scanner(System.in);
            String answer;
            do{

                System.out.println("You are cool. Do you want to repeat this? y/n: ");
                answer = input.next(); // updates the answer variable by getting the new user input
            } while (answer.equalsIgnoreCase("y"));

            System.out.println("Ok I stopped");
//

        }
    }

