package question1;

public abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    public abstract void withdrawl(double amount);

    public abstract void deposit(double amount);

    public void display() {
        System.out.println("--------------------------------------------");
        System.out.println("Account Number       : " + accountNumber);
        System.out.println("Account Holder Name  : " + accountHoldersName);
        System.out.println("Address              : " + address);
        System.out.println("Current Balance      : " + balance);
        System.out.println("--------------------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public String getAddress() {
        return address;
    }
}
