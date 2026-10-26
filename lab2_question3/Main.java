package lab2_question3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance Framework (Gross Interface, Employee & Salary Classes) ===\n");

        Salary empSalary = new Salary(101, "Robert Downey", "Principal Software Architect", 95000.0, 12000.0);
        empSalary.displayGrossDetails();
    }
}
