package October7;

/*
Write a method that takes an integer and returns true if the num is even otherwise returns false.
   Use  % operator to check for evenness or oddness

   isEven(5);  //  false
   isEven(10);  //  true

*/

public class AssignmentIfStatement {
    public static void main(String[] args) {

        System.out.println(isEven(5));
        System.out.println(isEven(10));


    }

    public static boolean isEven(int num){
        if(num %2  == 0 ) {
            return true;
        }
        else{
            return false;

        }
    }
}
