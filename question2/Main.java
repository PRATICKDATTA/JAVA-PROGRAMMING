package question2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance Demonstration (Bank Interface, Customer Class, Account Class) ===\n");
        Account acc = new Account(
            "CUST9876", "Alice Smith", "9876543210", "alice@example.com",
            "ACC55443322", "Savings", 12500.0
        );

        acc.openAccount();
        acc.viewAccountDetails();

        System.out.println("\n--- Performing Transactions ---");
        acc.deposit(3000.0);
        acc.withdraw(1500.0);
        acc.applyServiceCharges();

        System.out.println("\n--- Final Account Summary ---");
        acc.viewAccountDetails();
    }
}
