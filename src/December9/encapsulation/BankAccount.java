package December9.encapsulation;

public class BankAccount {

    // There are 4 OOP principles - Encapsulation, Inheritance, Polymorphism, Abstraction

    // Encapsulation -> make class variables(data fields) private and provide public getter and setter methods to retrieve and update those fields


    private String ownerName;
    private String address;
    private String ssn;
    private double balance;
    private long routingNo;
    private long accountNo;


    public BankAccount(String ownerName, String address, String ssn, double balance, long routingNo, long accountNo) {
        this.ownerName = ownerName;
        this.address = address;
        this.ssn = ssn;
        this.balance = balance;
        this.routingNo = routingNo;
        this.accountNo = accountNo;
    }


    public String getOwnerName() {

        return ownerName;
    }

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getSsn() {

        return ssn;
    }

    public void setSsn(String ssn) {

        this.ssn = ssn;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public long getRoutingNo() {

        return routingNo;
    }

    public void setRoutingNo(long routingNo) {

        this.routingNo = routingNo;
    }

    public long getAccountNo() {

        return accountNo;
    }

    public void setAccountNo(long accountNo) {

        this.accountNo = accountNo;
    }

    public String getInfo() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                ", routingNo=" + routingNo +
                ", accountNo=" + accountNo +
                '}';
    }
}
