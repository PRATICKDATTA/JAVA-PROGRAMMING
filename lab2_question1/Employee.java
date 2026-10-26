package lab2_question1;

public class Employee {
    // Private instance variables
    private String name;
    private String department;
    private double salary;

    // Static member shared by all employees of the company
    private static String companyName = "TechNova Solutions Pvt. Ltd.";

    // Constructor to initialize instance data members
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Static method to get or set company name
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    // Display method to show employee and company details
    public void display() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Department   : " + department);
        System.out.printf("Salary       : $%.2f%n", salary);
        System.out.println("----------------------------------------");
    }
}
