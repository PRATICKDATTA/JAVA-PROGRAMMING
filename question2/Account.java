package question2;

/**
 * Account extends Customer and implements Bank interface.
 * This models multiple inheritance in Java (inheriting class state and behavior from Customer,
 * and interface specifications from Bank).
 */
public class Account extends Customer implements Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String customerId, String customerName, String contactNumber, String email,
                   String accountNumber, String accountType, double balance) {
        super(customerId, customerName, contactNumber, email);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public void openAccount() {
        System.out.println("Account opened successfully with " + BANK_NAME + " (IFSC: " + IFSC_CODE + ")");
    }

    @Override
    public void viewAccountDetails() {
        System.out.println("============== BANK ACCOUNT DETAILS ==============");
        System.out.println("Bank Name      : " + BANK_NAME);
        System.out.println("IFSC Code      : " + IFSC_CODE);
        displayCustomerInfo(); // Inherited from Customer class
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs. " + balance);
        System.out.println("==================================================");
    }

    @Override
    public void applyServiceCharges() {
        double charge = 100.0;
        if (balance >= charge) {
            balance -= charge;
            System.out.println("Annual maintenance charge of Rs. " + charge + " applied.");
        } else {
            System.out.println("Insufficient balance to deduct maintenance charges.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + ". New Balance: Rs. " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs. " + amount + ". New Balance: Rs. " + balance);
        } else {
            System.out.println("Transaction failed: Invalid amount or insufficient balance.");
        }
    }
}
