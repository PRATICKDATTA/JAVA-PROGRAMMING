package question1;

public class SavingsAccount extends Accounts {
    private double rateOfInterest; // in percentage, e.g., 5.0 for 5%

    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdrawl(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        }
    }

    public double calculateAmount() {
        // Simple Interest calculation for 1 year: Interest = (balance * rateOfInterest) / 100
        double interest = (balance * rateOfInterest) / 100.0;
        double totalAmount = balance + interest;
        System.out.println("Interest calculated at " + rateOfInterest + "%: " + interest);
        System.out.println("Total Amount (Principal + Interest): " + totalAmount);
        return totalAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
