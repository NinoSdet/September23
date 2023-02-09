package December16;

public class ClassTask063Regex {
    public static void main(String[] args) {
        // Create  a method that checks if a passed String matches the correct format for a US phone number.
        // Phone number can't start with zero
        //  202-997-0899  -> true
        //  056-342-2234  -> false
        //  99798456-78956 -> false
        //  231-4562-21 -> false

        System.out.println(checkPhoneNumberFormat("202-997-0899")); //true
        System.out.println(checkPhoneNumberFormat("056-342-2234")); //false
        System.out.println(checkPhoneNumberFormat("99798456-78956")); //false
        System.out.println(checkPhoneNumberFormat("231-4562-21")); //false


    }


    // create the method here
    public static boolean checkPhoneNumberFormat(String phoneNo){
       /* String regex="\\d{3}-\\d{3}-\\d{4}";
        if (phoneNo.matches(regex) && phoneNo.charAt(0)!='0'){
            return true;
        }
        return false;*/
        return phoneNo.matches("[1-9]\\d{2}-\\d{3}-\\d{4}");
    }
}

