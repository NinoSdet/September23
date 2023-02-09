package October17;

public class ClassTask16bIsEligibleToDateOperatorsIfElse {
    public static void main(String[] args) {
        // call your method and print out its returned value
        System.out.println(isEligibleToDate(26, 700000, 5.9));
        System.out.println(isEligibleToDate(22, 1000000, 10));
        System.out.println(isEligibleToDate(27, 50000, 9.2));
    }

    public static boolean isEligibleToDate(int age, double income, double looks){
        if (age >=25 && age <=40 && (income > 500000 || looks > 8.5)){
            return true;
        }else{
            return false;
        }
    }

    //create your method here
}

