package question3;

public interface Department {
    // In Java interfaces, fields are public static final by default
    String deptName = "Computer Science and Engineering";
    String deptHead = "Dr. Robert Vance";

    // Abstract methods for printing the attributes
    void printDeptName();
    void printDeptHead();
    void printDeptDetails();
}
