package lab2_question1;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ EMPLOYEE RECORDS ================");
        System.out.println("Company Name (via static accessor): " + Employee.getCompanyName());
        System.out.println("==================================================\n");

        // Array of 5 employees of the same company
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alice Johnson", "Engineering", 85000.0);
        employees[1] = new Employee("Bob Smith", "Human Resources", 62000.0);
        employees[2] = new Employee("Charlie Davis", "Finance", 78000.0);
        employees[3] = new Employee("Diana Prince", "Product Management", 92000.0);
        employees[4] = new Employee("Ethan Hunt", "Quality Assurance", 69000.0);

        // Display information for all 5 employees
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            employees[i].display();
        }
    }
}
