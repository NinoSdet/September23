package October12;

public class Assignment13AgeDependingMessages {
    public static void main(String[] args) {
        printAgeAppropriateMessage(15);
    }

    //Create your method here called printAgeAppropriateMessage() that takes an age and prints the corresponding message
    public static void printAgeAppropriateMessage(int age){
        if (age < 16){
            System.out.println("You can't drive.");
        }
        if (age< 18){
            System.out.println("You can't vote.");
        }
        if (age<25){
            System.out.println("You can't rent a car.");
        }
        if (age>=25){
            System.out.println("You can do anything that's legal.");
        }
    }
}

/* Create a method that takes user's age (has a parameter for age) and prints out different messages based on the age:
       /*
        if age is less than 16, print "You can't drive."
        if age is less than 18, print "You can't vote."
        if age is less than 25, print "You can't rent a car."
        if age is 25 or over, print "You can do anything that's legal."
       */

     /*   boolean b =false;
        if(b=true)
            System.out.println("true");
        else
            System.out.println("False"); */

   /*     printAgeAppropriateMessage(26);
    }

    //Create your method here called printAgeAppropriateMessage() that takes an age and prints the corresponding message
    public static void printAgeAppropriateMessage(int age){
        if (age < 16){
            System.out.println("You can't drive.");
            System.out.println("You can't vote.");
            System.out.println("You can't rent a car.");
        }
        else if (age< 18){
            System.out.println("You can't vote.");
            System.out.println("You can't rent a car.");
        }
        else if (age<25){
            System.out.println("You can't rent a car.");
        }
        else {
            System.out.println("You can do anything that's legal.");
        }
    }
}
*/
