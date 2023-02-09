package December9.encapsulation;

public class Tester {


    public static void main(String[] args) {


         BankAccount bankAccount = new BankAccount("John Doe",
                                                    "1600 Penn Ave",
                                                    "123-45-1234",
                                                    10000000,
                                                    2753176351255L,
                                                    372784327847837324L);



//        System.out.println(bankAccount.ssn);
//        bankAccount.ssn = "999-00-9999";
//
//        System.out.println(bankAccount.ssn);


        System.out.println("The ssn of the owner is " + bankAccount.getSsn());

        // Update address

        bankAccount.setAddress("1 Observatory Circle");

        System.out.println("The new address " + bankAccount.getAddress());







    }
}
