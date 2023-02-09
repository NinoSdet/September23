package October28;

public class Classwork027aFizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(100);


    }
    public static void fizzBuzz(int x){
        for(int i=1; i<x; i++ ){
            if (i%3==0 ){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            if (i%3!=0 && i%5!=0){
                System.out.print(i);
            }
            System.out.println();
        }


        //create a method here
    }
}

