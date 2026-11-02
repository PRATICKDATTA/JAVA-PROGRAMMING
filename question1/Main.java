package question1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing SavingsAccount ===");
        SavingsAccount sa = new SavingsAccount("SA1001", "John Doe", "123 Elm Street, Springfield", 5000.0, 4.5);
        
        sa.display();
        
        System.out.println("\n--- Depositing 1500 ---");
        sa.deposit(1500.0);
        sa.display();
        
        System.out.println("\n--- Withdrawing 2000 ---");
        sa.withdrawl(2000.0);
        sa.display();
        
        System.out.println("\n--- Attempting overdraft withdrawal of 6000 ---");
        sa.withdrawl(6000.0);
        
        System.out.println("\n--- Calculating Interest and Total Amount ---");
        sa.calculateAmount();
    }
}
