package December14;

import java.time.*;
public class Account {

    private int id=0;
    private double balance=0.0;
    private static double annualInterestRate;
    private LocalDate dateCreated;

    static{
        annualInterestRate = 0.045;
    }

    public Account(){

    }
    public Account(double balance){
        this.balance=balance;
        id=generateAccountID();
        dateCreated= LocalDate.now();
    }

    private int generateAccountID(){
        return 1000 + (int)(Math.random()*9000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
