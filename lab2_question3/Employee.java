package lab2_question3;

public class Employee {
    protected int empId;
    protected String name;
    protected String designation;

    public Employee(int empId, String name, String designation) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Designation   : " + designation);
    }
}
