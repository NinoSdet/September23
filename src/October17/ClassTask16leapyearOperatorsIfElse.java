package October17;

public class ClassTask16leapyearOperatorsIfElse {
    public static void main(String[] args) {


        System.out.println(leapYear(2000));
        System.out.println(leapYear(2022));
        System.out.println(leapYear(2010));
        System.out.println(leapYear(1900));
        System.out.println(leapYear(1600));

    }

    public static boolean leapYear(int year){
        if(((year % 4 ==0) && !(year % 100 ==0)) || (year % 400==0))
            return true;
        else{
            return false;
        }


    }
}

