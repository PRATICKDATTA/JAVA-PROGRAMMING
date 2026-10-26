package lab2_question2;

public class Employee {
    private int emp_no;
    private String name;
    private String department;
    private double basic_pay;
    private double DA;
    private double HRA;
    private double gross_salary;

    // Standard allowances: e.g., DA = 20% of basic, HRA = 10% of basic
    public Employee(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;
        calculateSalary();
    }

    private void calculateSalary() {
        this.DA = 0.20 * this.basic_pay;   // 20% Dearness Allowance
        this.HRA = 0.10 * this.basic_pay;  // 10% House Rent Allowance
        this.gross_salary = this.basic_pay + this.DA + this.HRA;
    }

    public void displayDetails() {
        System.out.println("Employee No   : " + emp_no);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.printf("Basic Pay     : %.2f%n", basic_pay);
        System.out.printf("DA (20%%)      : %.2f%n", DA);
        System.out.printf("HRA (10%%)     : %.2f%n", HRA);
        System.out.printf("Gross Salary  : %.2f%n", gross_salary);
    }

    public double getGrossSalary() {
        return gross_salary;
    }

    public int getEmpNo() {
        return emp_no;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicPay() {
        return basic_pay;
    }

    public double getDA() {
        return DA;
    }

    public double getHRA() {
        return HRA;
    }
}
