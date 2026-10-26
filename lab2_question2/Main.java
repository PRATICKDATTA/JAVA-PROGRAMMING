package lab2_question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Invalid number. Exiting.");
            sc.close();
            return;
        }

        if (n <= 0) {
            System.out.println("Employee count must be at least 1.");
            sc.close();
            return;
        }

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Employee #" + (i + 1) + " ---");
            System.out.print("Enter Employee Number: ");
            int empNo = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine().trim();
            System.out.print("Enter Basic Pay: ");
            double basicPay = Double.parseDouble(sc.nextLine().trim());

            employees[i] = new Employee(empNo, name, dept, basicPay);
        }

        // Find employee with highest gross salary
        Employee highestPaid = employees[0];
        for (int i = 1; i < n; i++) {
            if (employees[i].getGrossSalary() > highestPaid.getGrossSalary()) {
                highestPaid = employees[i];
            }
        }

        System.out.println("\n========================================================");
        System.out.println("       DETAILS OF EMPLOYEE WITH HIGHEST GROSS SALARY    ");
        System.out.println("========================================================");
        highestPaid.displayDetails();
        System.out.println("========================================================");

        sc.close();
    }
}
