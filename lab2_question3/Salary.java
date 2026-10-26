package lab2_question3;

/**
 * Multiple inheritance simulation in Java:
 * Salary extends Employee (class inheritance) and implements Gross (interface implementation).
 */
public class Salary extends Employee implements Gross {
    private double basicPay;
    private double da;
    private double hra;
    private double allowances;

    public Salary(int empId, String name, String designation, double basicPay, double allowances) {
        super(empId, name, designation);
        this.basicPay = basicPay;
        this.allowances = allowances;
        this.da = 0.20 * basicPay;  // 20% DA
        this.hra = 0.15 * basicPay; // 15% HRA
    }

    @Override
    public double calculateGrossSalary() {
        return basicPay + da + hra + allowances;
    }

    @Override
    public void displayGrossDetails() {
        System.out.println("============== SALARY & GROSS STATEMENT ==============");
        displayEmployeeInfo(); // Inherited from Employee class
        System.out.printf("Basic Pay     : $%.2f%n", basicPay);
        System.out.printf("DA (20%%)      : $%.2f%n", da);
        System.out.printf("HRA (15%%)     : $%.2f%n", hra);
        System.out.printf("Allowances    : $%.2f%n", allowances);
        System.out.printf("Gross Salary  : $%.2f%n", calculateGrossSalary());
        System.out.println("======================================================");
    }
}
