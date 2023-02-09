package December14;

public class ClassTask061AccountClassEncapsulation {
    public static void main(String[] args) {
        //Test the Account class here
        Account account1 = new Account(20000);
        account1.withdraw(2500);
        account1.deposit(3500);
        System.out.println("Balance: " + account1.getBalance());

        System.out.println("Monthly interest rate: " + account1.getMonthlyInterestRate());
        System.out.println("Monthly interest amount : " + account1.getMonthlyInterest());
        System.out.println("The date of account creation: " + account1.getDateCreated() );
    }
}
